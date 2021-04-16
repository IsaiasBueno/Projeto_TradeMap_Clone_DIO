package com.isaiasbueno.projeto_trademap_clone_dio.job;

import java.util.List;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.AcaoFavorita;
import com.isaiasbueno.projeto_trademap_clone_dio.service.IAcaoService;
import com.isaiasbueno.projeto_trademap_clone_dio.service.impl.AcaoFavoritaService;
import com.isaiasbueno.projeto_trademap_clone_dio.utils.LogUtil;
@Component
public class AcaoThreadJob implements DisposableBean, Runnable {
    @Autowired
    private IAcaoService acaoB3Service;
    @Autowired
    private AcaoFavoritaService acaoFavoritaService;
    private Thread thread;
    private boolean someCondition;
    AcaoThreadJob() {
        this.thread = new Thread(this);
        this.thread.start();
        someCondition = true;
    }
    @Override
    public void run() {
        while (someCondition) {
            try {
                Thread.sleep(10000);
                // Poderia ser consultado em um banco em memória para ser mais rápido
                List<AcaoFavorita> listaAcoes = acaoFavoritaService.listarSemDuplicidade();
                for (AcaoFavorita acaoFavorita : listaAcoes) {
                    acaoB3Service.atualizarValorAcao(acaoFavorita.getCodigo());
                }
            } catch (InterruptedException e) {
                LogUtil.error(e);
            }
        }
    }
    @Override
    public void destroy() {
        someCondition = false;
    }
}

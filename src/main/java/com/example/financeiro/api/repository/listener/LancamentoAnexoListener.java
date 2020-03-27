/*
 * package com.example.financeiro.api.repository.listener;
 * 
 * import javax.persistence.PostLoad;
 * 
 * import org.springframework.util.StringUtils;
 * 
 * import com.example.financeiro.api.FinanceiroApiApplication; import
 * com.example.financeiro.api.model.Lancamento; import
 * com.example.financeiro.api.storage.S3;
 * 
 * public class LancamentoAnexoListener {
 * 
 * @PostLoad public void postLoad(Lancamento lancamento) { if
 * (StringUtils.hasText(lancamento.getAnexo())) { S3 s3 =
 * FinanceiroApiApplication.getBean(S3.class);
 * lancamento.seturlAnexo(s3.configurarUrl(lancamento.getAnexo())); } }
 * 
 * }
 */
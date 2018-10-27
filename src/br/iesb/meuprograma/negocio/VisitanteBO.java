/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Visitante;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author anagloria
 */
public class VisitanteBO implements BO<Visitante>{

    @Override
    public void validar(Visitante entidade) throws NegocioException {
       if (entidade.getNome().isEmpty()) {
            throw new NegocioException("Campo Nome é obrigatório");
       }
        
         
            if(entidade.getCpf().isEmpty()){
           throw new NegocioException("Campo CPF é obrigatório");
       }
    }

    @Override
    public void inserir(Visitante entidade) throws NegocioException {
       validar(entidade);
    }
    @Override
    public void alterar(Visitante entidade) throws NegocioException {
         validar(entidade);
        consultar(entidade.getId());
       
    }

    @Override
    public void excluir(Visitante entidade) throws NegocioException {
        consultar(entidade.getId());
    }
    @Override
    public Visitante consultar(int id) throws NegocioException {
        return new Visitante ();
    }

    @Override
    public List<Visitante> listar() throws NegocioException {
       return new ArrayList<Visitante>();
    }

 
    
}

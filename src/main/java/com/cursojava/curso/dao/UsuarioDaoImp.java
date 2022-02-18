package com.cursojava.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository // hace referencia q va tener la funcionalidad de acceder al repositorio de la bd
@Transactional // la forma en la que va tratar las consultas sql 
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entityManager;// el entity manager nos va servir para conectar a bd
    
    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();    
    }

    @Override
    public void deleteUsuario(Long id) {
        // TODO Auto-generated method stub
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }
    
}

package com.cursojava.curso.controllers;
import java.util.List;
import java.util.ArrayList;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Alejandra");
        usuario.setApellido("Benitez");
        usuario.setEmail("alejpascua@gmail.com");
        usuario.setTelefono("938980973");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }
    
    @RequestMapping(value = "usuarios/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable Long id){
        
        usuarioDao.deleteUsuario(id);
    }
}

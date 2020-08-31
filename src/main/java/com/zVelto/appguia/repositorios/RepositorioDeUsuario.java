package com.zVelto.appguia.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.zVelto.appguia.entidades.Usuario;

public interface RepositorioDeUsuario extends CrudRepository<Usuario, Long>{

}

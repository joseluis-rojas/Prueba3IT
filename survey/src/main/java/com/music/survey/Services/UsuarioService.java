package com.music.survey.Services;

import com.music.survey.Entity.Usuario;

import java.util.List;

public interface UsuarioService {
    public abstract List<Usuario> listAllUsuario();
    public abstract Usuario addUsuario();
}

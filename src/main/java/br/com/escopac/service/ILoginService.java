package br.com.escopac.service;

import br.com.escopac.bean.auth.Usuario;

public interface ILoginService {
    String login(String username, String password);
    Usuario saveUser(Usuario user);

    boolean logout(String token);

    Boolean isValidToken(String token);

    String createNewToken(String token);
}

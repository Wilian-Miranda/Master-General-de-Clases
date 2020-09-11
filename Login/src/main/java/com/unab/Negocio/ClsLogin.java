
package com.unab.Negocio;

import com.unab.dominio.Login;

public class ClsLogin {

    public boolean accesoSistema(Login log) {

        if (log.getUsuario().equals("Wilian") && log.getPass().equals("1234")) {
            return true;

        } else {
            return false;
        }

    }

   
}

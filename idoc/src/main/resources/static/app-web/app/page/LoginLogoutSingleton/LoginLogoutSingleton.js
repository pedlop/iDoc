/***
 * autor: lucas
 *
 * Classe que tem como objetivo alternar a visibilidade
 * dos botoes de entrar/cadastrar e sair de modo se há usuario
 * logado ou não
*/
"use strict";
var LoginLogoutSingleton = (function () {
    function LoginLogoutSingleton() {
        if (LoginLogoutSingleton._instancia) {
            throw new Error("Erro: Classe ja instanciada padrao Singleton! ");
        }
        LoginLogoutSingleton._instancia = this;
        this.semUsuario = true;
        this.comUsuario = false;
    }
    return LoginLogoutSingleton;
}());
exports.LoginLogoutSingleton = LoginLogoutSingleton;
//# sourceMappingURL=LoginLogoutSingleton.js.map
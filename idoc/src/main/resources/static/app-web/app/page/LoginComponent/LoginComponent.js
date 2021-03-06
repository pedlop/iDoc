"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var http_1 = require("@angular/http");
var router_1 = require("@angular/router");
/********************************************** */
var Usuario_1 = require("../../dominio/Usuario");
var LoginLogoutSingleton_1 = require("../LoginLogoutSingleton/LoginLogoutSingleton");
/********************************************** */
var LoginComponent = (function () {
    function LoginComponent(router, http) {
        this.router = router;
        this.http = http;
        this.usuario = new Usuario_1.Usuario();
    }
    LoginComponent.prototype.entrar = function () {
        this.http
            .get("http://localhost:10010/cadastrar/usuario/" + JSON.stringify(this.usuario))
            .subscribe(function (a) {
            var loginOk = JSON.parse(a.json());
            if (loginOk) {
                alert("Login com sucesso");
                LoginLogoutSingleton_1.LoginLogoutSingleton._instancia.comUsuario = true;
                LoginLogoutSingleton_1.LoginLogoutSingleton._instancia.semUsuario = false;
            }
            else {
                alert("Login inexistente, por favor cadastre-se");
                LoginLogoutSingleton_1.LoginLogoutSingleton._instancia.comUsuario = false;
                LoginLogoutSingleton_1.LoginLogoutSingleton._instancia.semUsuario = true;
            }
        });
    };
    return LoginComponent;
}());
LoginComponent = __decorate([
    core_1.Component({
        selector: 'login',
        templateUrl: 'app/page/LoginComponent/LoginComponent.html',
        providers: []
    }),
    __metadata("design:paramtypes", [router_1.Router, http_1.Http])
], LoginComponent);
exports.LoginComponent = LoginComponent;
//# sourceMappingURL=LoginComponent.js.map
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
/********************************************/
var Usuario_1 = require("../../dominio/Usuario");
var CadastroComponent = (function () {
    function CadastroComponent(http) {
        this.http = http;
        this.usuario = new Usuario_1.Usuario();
        this.confSenha = "";
    }
    CadastroComponent.prototype.cadastrar = function () {
        if (this.usuario.senha != this.confSenha) {
            alert("Por favor as senhas não confirmam, digite as senhas novamente");
            this.usuario.senha = "";
            this.confSenha = "";
        }
        this.http
            .get("http://localhost:10010/cadastrar/usuario/" + JSON.stringify(this.usuario))
            .subscribe(function (a) {
            var msg = JSON.parse(a.json());
            alert(msg.getMessagemUsuario());
        });
    };
    return CadastroComponent;
}());
CadastroComponent = __decorate([
    core_1.Component({
        selector: 'cadastro',
        templateUrl: 'app/page/CadastroComponent/CadastroComponent.html',
        providers: []
    }),
    __metadata("design:paramtypes", [http_1.Http])
], CadastroComponent);
exports.CadastroComponent = CadastroComponent;
//# sourceMappingURL=CadastroComponent.js.map
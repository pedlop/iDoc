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
/**-------------------- ANGULAR 2 ----------------------*/
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var forms_1 = require("@angular/forms");
var http_1 = require("@angular/http");
var router_1 = require("@angular/router");
/**-------------------- BIBLIOTECAS ----------------------*/
//import { TextMaskModule   }              from 'angular2-text-mask';
/**-------------------- PAGINAS - COMPONENT(s) ----------------------*/
var AppComponent_1 = require("./page/AppComponent/AppComponent");
var LoginComponent_1 = require("./page/LoginComponent/LoginComponent");
/**-------------------- DOMINIO E COMUNICAO WebService ----------------------*/
/** ------------------------ SINGLETONS --------------------------------------*/
var LoginLogoutSingleton_1 = require("./page/LoginLogoutSingleton/LoginLogoutSingleton");
var WINDOW_PROVIDER = {
    provide: Window,
    useValue: window
};
var appRoutes = [
    { path: 'login', component: LoginComponent_1.LoginComponent },
    { path: 'home', component: AppComponent_1.AppComponent }
];
var AppModule = (function () {
    function AppModule() {
        //CRIA OS SINGLETONS PARA O TODA A APLICAO
        var loginLogout = new LoginLogoutSingleton_1.LoginLogoutSingleton();
    }
    return AppModule;
}());
AppModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule,
            http_1.HttpModule,
            router_1.RouterModule.forRoot(appRoutes),
            forms_1.FormsModule],
        declarations: [AppComponent_1.AppComponent,
            LoginComponent_1.LoginComponent
        ],
        providers: [WINDOW_PROVIDER],
        bootstrap: [AppComponent_1.AppComponent]
    }),
    __metadata("design:paramtypes", [])
], AppModule);
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map
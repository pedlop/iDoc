import {Component}                     from '@angular/core';
import { Response   }                  from '@angular/http';
import { Router }                      from '@angular/router';
/********************************************** */

@Component({
    selector:'projetos',
    templateUrl: 'app/page/ProjetosComponent/ProjetosComponent.html',
    providers:[  ]
})
export class ProjetosComponent{

  constructor(  public  router : Router ) {
    
  
  }

  
}
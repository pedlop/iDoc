import {Component}                     from '@angular/core';
import { Response   }                  from '@angular/http';
import { Router }                      from '@angular/router';
/********************************************** */

@Component({
    selector:'projetos',
    templateUrl: 'app/page/HomeComponent/HomeComponent.html',
    providers:[  ]
})
export class HomeComponent{

  constructor(  public  router : Router ) {
    
  
  }

  
}
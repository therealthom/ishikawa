import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { IshikawaComponent } from './ishikawa/ishikawa.component';

const routes: Routes = [
  { path: 'ishikawa', component: IshikawaComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }

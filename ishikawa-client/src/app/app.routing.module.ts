import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { IshikawaComponent } from './ishikawa/ishikawa.component';
import { AddIshikawaComponent } from './ishikawa/add-ishikawa.component';

const routes: Routes = [
  { path: 'ishikawa', component: IshikawaComponent },
  { path: 'add', component: AddIshikawaComponent }
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

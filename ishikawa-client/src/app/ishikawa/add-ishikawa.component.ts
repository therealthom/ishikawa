import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Ishikawa } from '../models/ishikawa.model';
import { IshikawaService } from './ishikawa.service';

@Component({
  templateUrl: './add-ishikawa.component.html'
})
export class AddIshikawaComponent {

  ishikawa: Ishikawa = new Ishikawa();
  constructor(private router: Router, private ishikawaService: IshikawaService) {}

  createIshikawa(): void {
    this.ishikawaService.createIshikawa(this.ishikawa)
        .subscribe( data => {
          alert("Ishikawa created successfully.");
        });
  };
}

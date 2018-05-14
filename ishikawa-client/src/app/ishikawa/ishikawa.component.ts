import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Ishikawa } from '../models/ishikawa.model';
import { IshikawaService } from './ishikawa.service';

@Component({
  selector: 'app-ishikawa',
  templateUrl: './ishikawa.component.html',
  styles: []
})
export class IshikawaComponent implements OnInit {

  ishikawas: Ishikawa[];

  constructor(private router: Router, private ishikawaService: IshikawaService) {

  }

  ngOnInit() {
    this.ishikawaService.getIshikawas()
      .subscribe( data => {
        this.ishikawas = data;
      });
  };

  deleteIshikawa(ishikawa: Ishikawa): void {
    this.ishikawaService.deleteIshikawa(ishikawa)
      .subscribe( data => {
        this.ishikawas = this.ishikawas.filter(u => u !== ishikawa);
      })
  };

}

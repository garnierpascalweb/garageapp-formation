import { Component, OnInit } from '@angular/core';
import { GarageService } from '../garage.service';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.scss']
})
export class CarsComponent implements OnInit {

  cars: any;

  constructor(private garageService : GarageService){
    
  }

  ngOnInit(): void {
    this.garageService.getCars().subscribe(datas => {
      this.cars = datas;
    });
  }
}

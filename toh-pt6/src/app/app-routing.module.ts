import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { HeroesComponent }      from './heroes/heroes.component';
import { HeroDetailComponent }  from './hero-detail/hero-detail.component';
import { SampleApplicationComponent } from './sample-application/sample-application.component';
import {CheckListComponent} from './check-list/check-list.component';

const routes: Routes = [
  { path: '', redirectTo: '/checkList', pathMatch: 'full' },
  // { path: 'dashboard', component: DashboardComponent },
  // { path: 'detail/:id', component: HeroDetailComponent },
  // { path: 'heroes', component: HeroesComponent },
  { path: 'studyTracker', component: SampleApplicationComponent},
  { path: 'checkList', component: CheckListComponent},
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}

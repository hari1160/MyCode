import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

import { BehaviorSubject } from 'rxjs';
import { User } from './user';

@Injectable()
export class AuthService {
  
  private isAccessible:any;
  private AloggedIn: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(false);

  get isLoggedIn() {
   
    return this.AloggedIn.asObservable();
  }

  constructor(
    private router: Router
  ) {}

  
  
  login(user: User) {
    console.log(user);
    console.log(user.userName);
    console.log(user.password);

    const userGetRole =  sessionStorage.getItem('userRole');
    console.log("Get Role"+ userGetRole);
    if (userGetRole === 'admin' ) {
      this.isAccessible = 'true';
      
     }
    if (user.userName !== '' && user.password !== '' && this.isAccessible === 'true' ) {
      this.AloggedIn.next(true);
      console.log("success");
     // this.router.navigate(['/home']);
    }
  }

  logout() {
    this.AloggedIn.next(false);
    
    this.router.navigate(['/login']);
  }
}

import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';




@Injectable({ providedIn: 'root' })
export class CheckListSummaryService {

  private heroesUrl = 'api/heroes';  // URL to web api
  private studyUrl = "http://localhost:8080/api/studies";
  private studyIdsUrl = "http://localhost:8080/api/study/ids";
  public updateURL = "http://localhost:8080/api/studies";
  public checkListSummaryUrl = "http://localhost:8080/api/checkListDetails";
  public updateCheckListDetails = "http://localhost:8080/api/checkListDetails";
  public checkListIds ="http://localhost:8080/api/checklist/ids";
  public addCheckListDetailsUrl = "http://localhost:8080/api/checkListDetails";
  public deleteCheckListDetailsUrl = "http://localhost:8080/api/checkListDetails";

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(
    private http: HttpClient) { }

    getCheckListIds() : any {
      return this.http.get(this.checkListIds).pipe(map(this.extractObserverData));
    }

    deleteChecklistSummary(studyId: string) : any {
      return this.http.delete(this.deleteCheckListDetailsUrl+'/' + studyId).pipe(map(this.extractObserverData));
    }

 
  getStudy(studyId : string) : any {
      console.log('Hello');
      return this.http.get(this.studyUrl + '/' + studyId).pipe(map(this.extractObserverData), catchError(this.handleError<[]>('getHeroes', [])));
  }

  getCheckListSummary(studyId: String) : any {
    return this.http.get(this.checkListSummaryUrl + '/' + studyId).pipe(map(this.extractObserverData), catchError(this.handleError<[]>('getHeroes', [])));
  }

  addNewChecklistDetails(requestBody) : any {
    return this.http.post(this.addCheckListDetailsUrl , requestBody).pipe(map(this.extractObserverData)); 
  }

  saveCheckListDetails(requestBody, studyId) : any {
    return this.http.put(this.updateCheckListDetails + '/' + studyId, requestBody).pipe(map(this.extractObserverData));
  }

  // submitStudy() {
  //   return this.http.put(this.studyUrl+ '/')
  // }

  getStudyIds() {
    return this.http.get(this.studyIdsUrl).pipe(map(this.extractObserverData), catchError(this.handleError<[]>('getHeroes', [])));
  }

  updateStudyDetails(studyId, requestBody): any {
    console.log('UPDATED');
    return this.http.put(this.updateURL + '/' + studyId, requestBody ).pipe(map(this.extractObserverData));
  }

  private extractObserverData(res: Response) {
    if (res.status < 200 || res.status >= 300) {
      throw new Error('ServiceManagementService - Response status: ' + res.status);
    }
  //  // console.log(body, "body");
  //   console.log(res, "response");
  //   // let body = res.json();
    return res;
}

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  /** Log a HeroService message with the MessageService */
  private log(message: string) {
   
  }
}

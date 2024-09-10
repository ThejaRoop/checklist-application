import { Component, OnInit } from '@angular/core';
import { MessageService } from '../message.service';
import { Heros } from '../heros';
import { StudyService } from '../study.service';
import { Studies } from '../studies';

@Component({
  selector: 'app-sample-application',
  templateUrl: './sample-application.component.html',
  styleUrls: ['./sample-application.component.css']
})
export class SampleApplicationComponent implements OnInit {
  

  public powers = ['Really Smart', 'Super Flexible',
            'Super Hot', 'Weather Changer'];

  public selectedStudy = '';

  public featuresToShow = {
    'Protocol Amendment Tracker' : {
      protocolAmmendmentCreation : '',
      protocolAmmendmentStatus : ''
    },
    'ICF Amendment Tracker' : {
      icfCreation : '',
      icfStatus : ''
    },
    'NoPHIS Checklist' : {
      noPhisChecklistCreation : '',
      noPhisChecklistStatus : ''
    },
    'HQ TMF TOC' : {
      hqTmfTocCreation : '',
      hqTmfTocStatus : ''
    },
    'C-TMF TOC' : {
      ctmfTocCreation : '',
      ctmfTocStatus : ''
    },
    'S-TMF TOC' : {
      stmfTocCreation : '',
      stmfTocStatus : ''
    },
    'Study Lead QC Checklist' : {
      studyLeadQCCheclistCreation : '',
      studyLeadQCCheclistStatus : ''
    },
    'eTMF Tracking Tool/eTRAC' : {
      etmftractingCreation : '',
      etmftractingStatus : ''
    },
    'eCTD Tracker/CSR Appendices' : {
      ectdtrackerCreation : '',
      ectdtrackerStatus : ''
    },
    'TMF Final QC and Archival' : {
      tmfFinalQCCreation : '',
      tmfFinalQCStatus : ''
    }
  }
  public studies;

  public showForm = false;

  public model = new Heros(18, 'Dr IQ', this.powers[0], 'Chuck Overstreet');

  public submitted = false;
  public StudyDetails : Studies;
  constructor(private studyService: StudyService, public messageService: MessageService) { 

  }


  onSubmit() { 

    console.log(this.StudyDetails);

    this.studyService.updateStudyDetails(this.selectedStudy, this.StudyDetails ).subscribe((res) => {
      this.StudyDetails = res;
      this.submitted = true; 
    } )


  }

  newHero() {
    this.model = new Heros(42, '', '');
  }

  ngOnInit() {

    this.studyService.getStudyIds().subscribe((studyIds) => {
      this.studies = studyIds;

    });


  }

  getStudyDetails() {
    this.studyService.getStudy(this.selectedStudy).subscribe((res) => {
      console.log("respsonse in component", res);
      // this.StudyDetails = res;
      this.StudyDetails = res;
      this.showForm = true; 
      this.submitted = true; 
      
    })

    
    // let sample = '{"trialNo":"ACZ885X2201","protocolAmmendmentCreation":"Not created","protocolAmmendmentStatus":"","icfCreation":"Not created","icfStatus":"","noPhisChecklistCreation":"N/A","noPhisChecklistStatus":"","hqTmfTocCreation":"29-Jun-2016","hqTmfTocStatus":"Modified on 04-Jul-2019","studyLeadQCCheclistCreation":"23-04-2019","studyLeadQCCheclistStatus":"Modified: 6/26/19 Next final version due on: 27-May-2020","tmfFinalQCCreation":"Not created","tmfFinalQCStatus":"","ctmfTocStatus":"Modified on: 04-Jul-2019","stmfTocStatus":"Modified on: US sites:04-Jul-2019 1001 1002 1003 1004","etmftractingCreation":"Not created","ctmfTocCreation":"29-Jun-2016","etmftractingStatus":"Not created","stmfTocCreation":"US sites:12-Jul-2017 1001 1002 1003 1004","ectdtrackerCreation":"Not created","ectdtrackerStatus":""}';
    // this.StudyDetails = JSON.parse(sample);
  }

  getInformation(item, keyNo) {
    return this.StudyDetails[Object.keys(item)[keyNo]];
  }

  setInformation($e, obj, keyNo) {
    
    this.StudyDetails[Object.keys(obj)[keyNo]] = $e;

  }

  inputId(item, keyNo) {
    return Object.keys(item)[keyNo];
  }

  // obtainStatusInformation(item) {
  //   return this.StudyDetails[Object.keys(item)[1]];
  // }

}

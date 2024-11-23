import {User} from "./User";
import {SmartPot} from "./SmartPot";

export class UserSmartPot {
  get smartPot(): SmartPot {
    return this._smartPot;
  }

  set smartPot(value: SmartPot) {
    this._smartPot = value;
  }
  get user(): User {
    return this._user;
  }

  set user(value: User) {
    this._user = value;
  }
  get toluene(): number {
    return this._toluene;
  }

  set toluene(value: number) {
    this._toluene = value;
  }
  get alcohol(): number {
    return this._alcohol;
  }

  set alcohol(value: number) {
    this._alcohol = value;
  }
  get ammonium(): number {
    return this._ammonium;
  }

  set ammonium(value: number) {
    this._ammonium = value;
  }
  get carbonDioxide(): number {
    return this._carbonDioxide;
  }

  set carbonDioxide(value: number) {
    this._carbonDioxide = value;
  }
  get soilMoisture(): number {
    return this._soilMoisture;
  }

  set soilMoisture(value: number) {
    this._soilMoisture = value;
  }
  get lightIntensity(): number {
    return this._lightIntensity;
  }

  set lightIntensity(value: number) {
    this._lightIntensity = value;
  }
  get temperature(): number {
    return this._temperature;
  }

  set temperature(value: number) {
    this._temperature = value;
  }
  get humidity(): number {
    return this._humidity;
  }

  set humidity(value: number) {
    this._humidity = value;
  }
  get dateRegister(): Date {
    return this._dateRegister;
  }

  set dateRegister(value: Date) {
    this._dateRegister = value;
  }
  get depositWaterLevel(): string {
    return this._depositWaterLevel;
  }

  set depositWaterLevel(value: string) {
    this._depositWaterLevel = value;
  }
  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }
  private _id!: number;
  private _depositWaterLevel!: string;
  private _dateRegister!: Date;
  private _humidity!: number;
  private _temperature!: number;
  private _lightIntensity!: number;
  private _soilMoisture!: number;
  private _carbonDioxide!: number;
  private _ammonium!: number;
  private _alcohol!: number;
  private _toluene!: number;
  private _user!: User;
  private _smartPot!: SmartPot;
}

import {SmartPot} from "./SmartPot";
export class Plant {
  get smartPot(): SmartPot {
    return this._smartPot;
  }

  set smartPot(value: SmartPot) {
    this._smartPot = value;
  }
  get kingdom(): string {
    return this._kingdom;
  }

  set kingdom(value: string) {
    this._kingdom = value;
  }
  get family(): string {
    return this._family;
  }

  set family(value: string) {
    this._family = value;
  }
  get image(): string[] {
    return this._image;
  }

  set image(value: string[]) {
    this._image = value;
  }
  get scientificName(): string {
    return this._scientificName;
  }

  set scientificName(value: string) {
    this._scientificName = value;
  }
  get commonName(): string {
    return this._commonName;
  }

  set commonName(value: string) {
    this._commonName = value;
  }
  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }

  private _id!: number;
  private _commonName!: string;
  private _scientificName!: string;
  private _image!: string[];
  private _family!: string;
  private _kingdom!: string;
  private _smartPot!: SmartPot;
}

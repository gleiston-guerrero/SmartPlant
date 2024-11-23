import {Plant} from "./Plant";
import {UserSmartPot} from "./UserSmartPot";
export class SmartPot {
  get plant(): Plant {
    return this._plant;
  }

  set plant(value: Plant) {
    this._plant = value;
  }
  get userSmartPot(): UserSmartPot[] {
    return this._userSmartPot;
  }

  set userSmartPot(value: UserSmartPot[]) {
    this._userSmartPot = value;
  }
  get name(): string {
    return this._name;
  }

  set name(value: string) {
    this._name = value;
  }
  get MACAddress(): string {
    return this._MACAddress;
  }

  set MACAddress(value: string) {
    this._MACAddress = value;
  }
  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }
  private _id!: number;
  private _MACAddress!: string;
  private _name!: string;
  private _userSmartPot!: UserSmartPot[];
  private _plant!: Plant;
}

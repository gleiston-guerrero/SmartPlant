import {UserSmartPot} from "./UserSmartPot";
export class User {
  get userSmartPot(): UserSmartPot[] {
    return this._userSmartPot;
  }

  set userSmartPot(value: UserSmartPot[]) {
    this._userSmartPot = value;
  }
  get clave(): string {
    return this._clave;
  }

  set clave(value: string) {
    this._clave = value;
  }
  get nombreDeUsuario(): string {
    return this._nombreDeUsuario;
  }

  set nombreDeUsuario(value: string) {
    this._nombreDeUsuario = value;
  }
  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }
  private _id!: number;
  private _nombreDeUsuario!: string;
  private _clave!: string;
  private _userSmartPot!: UserSmartPot[];
}

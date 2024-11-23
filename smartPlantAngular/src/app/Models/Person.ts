export class Person {
  get email(): string {
    return this._email;
  }

  set email(value: string) {
    this._email = value;
  }
  get dateOfBirth(): Date {
    return this._dateOfBirth;
  }

  set dateOfBirth(value: Date) {
    this._dateOfBirth = value;
  }
  get address(): string {
    return this._address;
  }

  set address(value: string) {
    this._address = value;
  }
  get telephone(): string {
    return this._telephone;
  }

  set telephone(value: string) {
    this._telephone = value;
  }
  get identyCard(): string {
    return this._identyCard;
  }

  set identyCard(value: string) {
    this._identyCard = value;
  }
  get surname(): string {
    return this._surname;
  }

  set surname(value: string) {
    this._surname = value;
  }
  get id(): number {
    return <number>this._id;
  }

  set id(value: number) {
    this._id = value;
  }
  get name(): string {
    return <string>this._name;
  }

  set name(value: string) {
    this._name = value;
  }

  private _id!: number;
  private _name!: string;
  private _surname!: string;
  private _identyCard!: string;
  private _telephone!: string;
  private _address!: string;
  private _dateOfBirth!: Date;
  private _email!: string;
}

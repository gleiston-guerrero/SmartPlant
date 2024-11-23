export class Notification {
  get message(): string {
    return this._message;
  }

  set message(value: string) {
    this._message = value;
  }
  get element(): string {
    return this._element;
  }

  set element(value: string) {
    this._element = value;
  }
  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }
  private _id!: number;
  private _element!: string;
  private _message!: string;
}

/** 
* Retorna el límite de crédito del cliente
*/
protected double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtCbE(LocalDate f1, LocalDate f2) {...

//Realizar "Form Template Method" creando una nueva clase que tenga un método abstracto para calcular un monto
//que se le pueda enviar los mismos parámetros
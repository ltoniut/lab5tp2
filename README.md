Repositorio: https://github.com/ltoniut/lab5tp2

1. En principio se instancia un mecánico. Se crean los autos a chequear y se agrega al mecánico como Observador.
Se llama, por cada auto, al método repairAll. Se clona temporalmente al auto y dependiendo de los niveles de agua, aceite y presión se actualizan o no los valores.
Se notifica al mecánico observador, que analiza las diferencias entre el auto clonado y su estado anterior. A partir de lo mismo, el mecánico calcula el precio de reparación e imprime en pantalla el proceso de chequeo.

2. Update se ejecuta cuando una instancia observada de Car llama a notifyAll(). Recibe dos parámetros: Un auto antes de que se hayan hecho cambios y su estado posterior a dichos cambios.

# Estructura del Proyecto Aerolinea

## Paquetes y clases

El paquete raíz  es es.indra.aerolinea

### .beans

#### Interfaces

*IAerolinea* 

*Interfaz que define el comportamiento de la gestión de vuelos.

### .beans.impl

#### Clases

##### Aerolinea

*Implementación de la interfaz IAerolinea:

 *Variables*
 
  *Id: de tipo int.
 
  *Nombre: de tipo String.
 
  *Vuelo: Array de tipo Vuelo donde se guardan los vuelos de esa aerolínea.
 
 *Métodos*
 
  *Constructores: dos constructores, uno vacío y otro con todas las variables.
  
  *Getters y Setters.
  
  *ConsultarVuelo: se puede consultar con el parámetro de origen o el de origen y el de destino o sin parámetros, sin parámetros solo leera el archivo de texto que le pasamos. Este último utiliza la clase ReadFile del paquete services
  
  *AnularVuelo: se puede usar con 0 o n parámetros de tipo Sring.
  
  ### .services
  
  #### Clases
  
  ##### ReadFile
  
  *Variables*
   
   *No tiene variables
   
   *Metodos*
   
   *retornarVuelos: lee y guarda los vuelos que se encuentran en un archivo de texto. Devuelve una lista con la información.
   
  
  
  


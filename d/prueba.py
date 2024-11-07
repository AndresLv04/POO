from graphviz import Digraph

# Crear un diagrama de clases utilizando Graphviz
dot = Digraph(comment='Diagrama de Clases del Sistema de Ascensor')

# Agregar nodos de clases principales
dot.node('Ascensor', '''Ascensor
----------------------
- Puerta puertaAscensor
- Puerta puertaPiso
- PlantillaBtns btnsAscensor
- int ubnActual
- String estado
----------------------
+ Ascensor()
+ mostrarPisoAscensor()
+ mover(int pisoDestino)
+ psrBtnAscensor(int pisoDestino)
''')

dot.node('Piso', '''Piso
----------------------
- PlantillaBtns btnSubir
- PlantillaBtns btnBajar
- Puerta puertaPiso
- Ascensor ascensor
----------------------
+ Piso(Ascensor ascensor)
+ presionarBtnSubir(int pisoSolicitado)
+ presionarBtnBajar(int pisoSolicitado)
''')

dot.node('SistemaControl', '''SistemaControl
----------------------
- Ascensor ascensor
- Piso[] pisos
- Scanner sc
----------------------
+ SistemaControl()
+ manejarSolicitud()
''')

dot.node('Puerta', '''<<interface>> Puerta
----------------------
+ abrirPuerta()
+ cerrarPuerta()
''')

dot.node('PuertaPiso', '''PuertaPiso
----------------------
+ abrirPuerta()
+ cerrarPuerta()
''')

dot.node('PuertaAscensor', '''PuertaAscensor
----------------------
+ abrirPuerta()
+ cerrarPuerta()
''')

dot.node('PlantillaBtns', '''<<abstract>> PlantillaBtns
----------------------
+ senalConfirmation()
+ senalConfirmationApagada()
+ presionar(int piso)
''')

dot.node('BtnSubir', '''BtnSubir
----------------------
+ presionar(int piso)
''')

dot.node('BtnBajar', '''BtnBajar
----------------------
+ presionar(int piso)
''')

dot.node('BtnsAscensor', '''BtnsAscensor
----------------------
+ presionar(int piso)
''')

# Agregar relaciones
dot.edge('Ascensor', 'PuertaAscensor', label='composición')
dot.edge('Ascensor', 'PuertaPiso', label='composición')
dot.edge('Ascensor', 'BtnsAscensor', label='composición')
dot.edge('Piso', 'PuertaPiso', label='composición')
dot.edge('Piso', 'Ascensor', label='composición')
dot.edge('SistemaControl', 'Ascensor', label='composición')
dot.edge('SistemaControl', 'Piso', label='composición')
dot.edge('PuertaPiso', 'Puerta', arrowhead='onormal', style='dashed')
dot.edge('PuertaAscensor', 'Puerta', arrowhead='onormal', style='dashed')
dot.edge('BtnSubir', 'PlantillaBtns', arrowhead='onormal', style='dashed')
dot.edge('BtnBajar', 'PlantillaBtns', arrowhead='onormal', style='dashed')
dot.edge('BtnsAscensor', 'PlantillaBtns', arrowhead='onormal', style='dashed')

# Mostrar el diagrama
dot.attr(rankdir='LR')  # Cambiar la dirección del gráfico (izquierda a derecha)
dot.render('/mnt/data/diagrama_clases_ascensor', format='png', cleanup=True)
'/mnt/data/diagrama_clases_ascensor.png'

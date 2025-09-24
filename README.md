🚗 Proyecto de Interfaces 🏎️

¡Bienvenido al proyecto de interfaces gráficas! 🎉 Este proyecto, desarrollado en Java con Swing, presenta tres versiones evolutivas de una interfaz gráfica que combina autenticación de usuarios, personalización de opciones y una temática de carreras. A continuación, te explicamos todo lo que necesitas saber sobre este proyecto. 🚀

📖 Descripción

Este proyecto incluye tres versiones de una aplicación de escritorio que implementa una interfaz de usuario para:





Inicio de sesión (Version_1): Una interfaz básica con campos para usuario, contraseña y términos y condiciones. 🧑‍💻



Inicio de sesión mejorado (Version_2): Añade opciones para recordar usuario y selección de idioma. 🌐



Configuración completa (Version_3): Incorpora pestañas para registro, configuración de carrera y personalización avanzada. 🏁

Cada versión utiliza un fondo personalizado (imágenes estáticas o GIFs) y componentes de Swing como JTextField, JPasswordField, JCheckBox, JComboBox, JRadioButton, JTabbedPane, entre otros. 🎨

📂 Estructura del Proyecto





Version_1.java / Version_1.form: Interfaz básica de inicio de sesión con usuario, contraseña y aceptación de términos. 🖱️



Version_2.java / Version_2.form: Versión mejorada con selección de idioma y opción para recordar usuario. 🌍



Version_3.java / Version_3.form: Interfaz avanzada con pestañas para inicio de sesión, registro de usuario y configuración de carrera (con elementos como sliders, spinners y barras de progreso). 🛠️



Recursos: Imágenes de fondo (fondo.jpg, FondoGif.gif, FondoCarrera.gif) ubicadas en src/main/resources/. 🖼️

🛠️ Requisitos

Para ejecutar este proyecto, necesitas:





☕ Java Development Kit (JDK) 8 o superior.



📚 Una IDE compatible con Java y Swing (como IntelliJ IDEA o Eclipse).



🖼️ Las imágenes de fondo deben estar en la carpeta src/main/resources/.



📦 Asegúrate de que las dependencias de Swing estén incluidas (vienen con el JDK estándar).

🚀 Instrucciones de Uso





Clona o descarga el proyecto:

git clone <URL-del-repositorio>



Configura tu IDE:





Importa los archivos .java y .form en tu IDE.



Asegúrate de que la carpeta src/main/resources/ contenga las imágenes de fondo.



Compila y ejecuta:





Cada versión (Version_1.java, Version_2.java, Version_3.java) tiene un método main que inicia la aplicación.



Ejecuta el archivo deseado desde tu IDE o con:

java Version_X.java



Explora las versiones:





Version_1: Introduce un usuario y contraseña, marca los términos y condiciones, y haz clic en "Acceder". 🔑



Version_2: Selecciona un idioma, activa la opción de recordar usuario si lo deseas, y accede. 🌟



Version_3: Navega entre las pestañas para iniciar sesión, registrarte o configurar parámetros de carrera (pilotos, velocidad, neumáticos, etc.). 🏎️

✨ Características Principales





Diseño visual: Fondos personalizados con imágenes y GIFs para una experiencia inmersiva. 🖥️



Interfaz modular: Cada versión añade nuevas funcionalidades, desde un inicio de sesión simple hasta una configuración avanzada. 🧩



Componentes Swing: Uso de elementos como JTabbedPane, JProgressBar, JSlider y JSpinner para mayor interactividad. ⚙️



Flexibilidad: Las versiones .form permiten editar la interfaz gráficamente en IDEs compatibles (como IntelliJ). 🖌️

📋 Notas Adicionales





Los archivos .form son generados por el diseñador gráfico de Swing (como el de IntelliJ IDEA) y describen la disposición de los componentes. 🔍



Asegúrate de que las imágenes de fondo existan en la ruta especificada, o la aplicación podría no mostrar el fondo correctamente. 🖼️



La Version_3 incluye una pestaña de configuración de carrera con controles avanzados, ideal para aplicaciones relacionadas con simulaciones de carreras. 🏆

🛠️ Posibles Mejoras





🖼️ Agregar soporte para más formatos de imágenes o animaciones dinámicas.



🌐 Implementar funcionalidad real para la selección de idiomas (traducción de etiquetas).



🔒 Añadir validación de datos en los campos de usuario y contraseña.



📊 Mejorar la pestaña de configuración de carrera con visualizaciones en tiempo real.

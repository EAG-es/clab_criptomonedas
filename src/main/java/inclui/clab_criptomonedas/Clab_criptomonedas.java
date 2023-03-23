package inclui.clab_criptomonedas;

import incli.restful.jdbc_servidor_https_spring.cliente_jdbc_servidor_https_spring;
import inclui.formularios.clui_formularios;
import inclui.formularios.control_entradas;
import static inclui.formularios.control_entradas.k_entradas_tipo_numero;
import static inclui.formularios.control_entradas.k_entradas_tipo_reset;
import static inclui.formularios.control_entradas.k_entradas_tipo_submit;
import static inclui.formularios.control_entradas.k_entradas_tipo_texto;
import static inclui.formularios.control_entradas.k_in_ruta;
import inclui.formularios.control_selecciones;
import static inclui.formularios.control_selecciones.k_control_selecciones_letras_por_linea_num;
import static inclui.formularios.control_selecciones.k_control_selecciones_opciones_mapa;
import inclui.formularios.control_tablas;
import static inclui.formularios.control_tablas.k_control_tablas_letras_por_linea_num;
import static inclui.formularios.control_tablas.k_control_tablas_opciones_mapas_lista;
import static innui.formularios.controles.k_opciones_mapa_no_requerido;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.errores.patrones;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.jdbc.sql_comandos;
import static innui.modelos.jdbc.sql_comandos.k_sql_comandos_marcador_columnas_lista_error;
import innui.modelos.modelos;
import innui.modelos.modelos_comunicaciones.modelos_comunicaciones;
import innui.modelos.tipos_valores;
import static java.lang.System.exit;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

/**
 *
 * @author emilio
 */
public class Clab_criptomonedas extends iniciales {
    /** 
     * Ruta de los recursos de traducción para este paquete
     */
    public static String k_in_ruta = "in/inclui/clab_criptomonedas/in";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_url = "clab_criptomonedas.jdbc_servidor_http_spring.url";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_driver = "clab_criptomonedas.jdbc_servidor_http_spring.driver";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_conexion = "clab_criptomonedas.jdbc_servidor_http_spring.conexion";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_usuario = "clab_criptomonedas.jdbc_servidor_http_spring.usuario";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_clave = "clab_criptomonedas.jdbc_servidor_http_spring.clave";
    public static String k_clab_criptomonedas_select = "clab_criptomonedas.select";
    public static String k_clab_criptomonedas_select_count = "clab_criptomonedas.select_count";
    public static String k_clab_criptomonedas_insert = "clab_criptomonedas.insert";
    public static String k_clab_criptomonedas_update = "clab_criptomonedas.update";
    public static String k_clab_criptomonedas_delete = "clab_criptomonedas.delete";
    public static String k_clab_criptomonedas_select_pagina_tam = "clab_criptomonedas.select.pagina_tam";
    public static String k_clab_criptomonedas_select_columnas_tex="clab_criptomonedas.select_columnas_tex";
    public static String k_clab_criptomonedas_select_columnas_cabecera_tex="clab_criptomonedas.select_columnas_cabecera_tex";
    public static String k_clab_criptomonedas_letras_por_linea="clab_criptomonedas.letras_por_linea";
    public static String k_lectura_clave_tabla = "lectura_clave_tabla";
    public static String k_lectura_clave_seleccion = "lectura_clave_seleccion";
    public static String k_paginacion_clave_fila_num = "paginacion_clave_fila_num";
    public static String k_insercion_clave_id_criptomoneda = "insercion_clave_id_criptomoneda";
    public static String k_insercion_clave_simbolo = "insercion_clave_simbolo";
    public static String k_insercion_clave_capitalizacion_de_mercado = "insercion_clave_capitalizacion_de_mercado";
    public static String k_insercion_clave_aporte_circulante = "insercion_clave_aporte_circulante";
    public static String k_insercion_clave_capitalizacion_total_diluida = "insercion_clave_capitalizacion_total_diluida";
    public static String k_insercion_clave_aporte_total = "insercion_clave_aporte_total";
    public static String k_insercion_clave_aporte_maximo = "insercion_clave_aporte_maximo";
    public static String k_insercion_clave_dominancia = "insercion_clave_dominancia";
    public static String k_insercion_clave_total_valor_bloqueado = "insercion_clave_total_valor_bloqueado";
    public static String k_insercion_clave_revisar = "insercion_clave_revisar";
    public static String k_insercion_clave_enviar = "insercion_clave_envair";
    public static String k_borrado_clave_fila_num = "borrado_clave_fila_num";
    public static String k_borrado_clave_confirmar = "borrado_clave_confirmar";
    public static String k_formato_date = "%1$td/%1$tm/%1$ty %1$tT";
    public static String k_formato_time = "%1$tT";
    public static String k_formato_numero = "%1$,15d";
    public static String k_formato_decimal = "%1$,15.2f";
    public static String k_columna_cuenta_tex = "cuenta";
    public String url;
    public String driver;
    public String conexion;
    public String usuario;
    public String clave;
    public String select;
    public String select_columnas_tex;
    public String select_columnas_cabecera_tex;
    public String select_count;
    public String select_pagina_tam;
    public String letras_por_linea;
    public String insert;
    public String update;
    public String delete;
    public clui_formularios lectura_clui_formulario = new clui_formularios();
    public cliente_jdbc_servidor_https_spring cliente_jdbc_servidor_https_spring = new cliente_jdbc_servidor_https_spring();
    public control_tablas lectura_control_tabla = new control_tablas();
    public control_selecciones lectura_control_seleccion = new control_selecciones();
    public clui_formularios paginacion_clui_formulario = new clui_formularios();
    public control_entradas paginacion_control_entrada = new control_entradas();
    public clui_formularios borrado_clui_formulario = new clui_formularios();
    public control_entradas borrado_control_entrada_confirmar = new control_entradas();
    public control_entradas borrado_control_entrada = new control_entradas() {
        @Override
        public boolean _validar_numero(Object objeto_a_validar, oks ok, Object... extras_array) throws Exception {
            if (ok.es == false) { return false; }
            ResourceBundle in;
            Double doble;
            int min = 1;
            int max = Integer.parseInt(select_pagina_tam);
            try {
                doble = Double.valueOf(objeto_a_validar.toString());
                int num = doble.intValue();
                if (num >= min && num <= max) {
                    return true;
                } else {
                    in = ResourceBundles.getBundle(k_in_ruta);
                    ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
                }
            } catch (Exception e) {
                in = ResourceBundles.getBundle(k_in_ruta);
                ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
            }
            return ok.es;
        }        
    };
    public clui_formularios insercion_clui_formulario = new clui_formularios();
    public clui_formularios actualizado_clui_formulario = new clui_formularios();
    public control_entradas actualizado_control_entrada = new control_entradas() {
        @Override
        public boolean _validar_numero(Object objeto_a_validar, oks ok, Object... extras_array) throws Exception {
            if (ok.es == false) { return false; }
            ResourceBundle in;
            Double doble;
            int min = 1;
            int max = Integer.parseInt(select_pagina_tam);
            try {
                doble = Double.valueOf(objeto_a_validar.toString());
                int num = doble.intValue();
                if (num >= min && num <= max) {
                    return true;
                } else {
                    in = ResourceBundles.getBundle(k_in_ruta);
                    ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
                }
            } catch (Exception e) {
                in = ResourceBundles.getBundle(k_in_ruta);
                ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
            }
            return ok.es;
        }        
    };

    /**
     * Inicio de la aplicación
     * @param args 
     */
    public static void main(String[] args) {
        oks ok = new oks();
        Clab_criptomonedas clab_criptomonedas = null;
        try {
            clab_criptomonedas = new Clab_criptomonedas();
            clab_criptomonedas.run(ok);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }    
    /**
     * Inicio de la aplicación desde un objeto instanciado
     * @param ok Comunicar resultados
     * @param extras_array Opción de añadir parámetros en el futuro.
     * @return true si todo va bien
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean run(oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return ok.es; }
            ResourceBundle in = null;
            String valor_tex; 
            iniciar(ok);
            boolean es_repetir_externo = false;
            boolean es_repetir_interno = false;
            Long filas_cuenta;
            int pagina_tam;
            if (ok.es) { 
                LinkedList<LinkedHashMap<String, Object>> filas_lista;
                in = ResourceBundles.getBundle(k_in_ruta);
                Long fila_inicio_pagina = 0L;
                while (true) {
                    es_repetir_externo = false;
                    configurar(ok);
                    if (ok.es == false) { break; }
                    crear_formulario_lectura(ok);
                    if (ok.es == false) { break; }
                    crear_formulario_paginacion(ok);
                    if (ok.es == false) { break; }
                    crear_formulario_insercion(ok);
                    if (ok.es == false) { break; }
                    crear_formulario_borrado(ok);
                    if (ok.es == false) { break; }
                    crear_formulario_actualizar(ok);
                    if (ok.es == false) { break; }
                    pagina_tam = Integer.parseInt(select_pagina_tam);
                    while (true) {
                        filas_cuenta = leer_cuenta_filas_criptomonedas(fila_inicio_pagina, ok);
                        if (ok.es == false) { break; }
                        filas_lista = leer_pagina_criptomonedas(fila_inicio_pagina, ok);
                        if (ok.es == false) { break; }
                        cargar_tabla(filas_lista, ok);
                        if (ok.es == false) { break; }
                        es_repetir_interno = false;
                        escribir_linea(tr.in(in, "Presentando fila ") 
                        + (fila_inicio_pagina + 1) + tr.in(in, " de ") + filas_cuenta, ok);
                        lectura_clui_formulario.procesar(ok);
                        if (ok.es == false) { break; }
                        if (lectura_clui_formulario._es_cancelar) {
                            ok.setTxt(tr.in(in, "Cancelado. "));
                            break;
                        }
                        valor_tex = (String) lectura_control_seleccion.leer_seleccion(ok);
                        if (ok.es == false) { break; }
                        switch (valor_tex) {
                        case "retroceder" -> {
                            es_repetir_interno = true;
                            if (fila_inicio_pagina > 0) {
                                fila_inicio_pagina = fila_inicio_pagina - pagina_tam;
                                if (fila_inicio_pagina < 0) {
                                    fila_inicio_pagina = 0L;
                                }
                            } 
                        }
                        case "avanzar" -> {
                            es_repetir_interno = true;
                            if (fila_inicio_pagina < filas_cuenta) {
                                if (fila_inicio_pagina + pagina_tam  < filas_cuenta) {
                                    fila_inicio_pagina = fila_inicio_pagina + pagina_tam;
                                }
                            } 
                        }
                        case "ir" -> {
                            es_repetir_interno = true;
                            paginacion_clui_formulario.procesar(ok, extras_array);
                            if (ok.es == false) { break; }
                            if (lectura_clui_formulario._es_cancelar) {
                                ok.setTxt(tr.in(in, "Cancelado. "));
                                break;
                            }
                            BigDecimal bigDecimal = (BigDecimal) paginacion_control_entrada.valor_de_conversion;
                            Long fila_num = bigDecimal.longValue();
                            fila_num = fila_num - 1;
                            if (fila_num < 0) {
                                fila_num = 0L;
                            } else if (fila_num > filas_cuenta) {
                                fila_num = fila_inicio_pagina;
                            }
                            fila_inicio_pagina = fila_num;
                        }
                        case "crear" -> {
                            es_repetir_interno = true;
                            insercion_clui_formulario.procesar(ok, extras_array);
                            if (ok.es == false) { break; }
                            if (insercion_clui_formulario._es_terminar) {
                                List<Entry<String, Object>> entrys_lista;
                                entrys_lista = insercion_clui_formulario.exportar_valores(ok, extras_array);
                                if (ok.es == false) { break; }
                                LinkedList<Object> valores_lista = new LinkedList<>();
                                for (Entry<String, Object> entry : entrys_lista) {
                                    if (entry.getValue() == null) {
                                        valores_lista.add(null);
                                    } else if (entry.getValue().toString().isBlank()) {
                                        valores_lista.add(null);
                                    } else {
                                        valores_lista.add(entry.getValue());
                                    }
                                }
                                crear_fila(valores_lista, ok);
                                if (ok.es == false) { break; }
                            }
                        }
                        case "actualizar" -> {
                            es_repetir_interno = true;
                            actualizado_clui_formulario.procesar(ok, extras_array);
                            if (ok.es == false) { break; }
                            BigDecimal bigDecimal = (BigDecimal) actualizado_control_entrada.valor_de_conversion;
                            int fila_num = bigDecimal.intValue();
                            LinkedHashMap<String, Object> columnas_mapa;
                            List<Entry<String, Object>> entrys_lista = new LinkedList<>();
                            columnas_mapa = filas_lista.get(fila_num);
                            for (Entry<String, Object> entry: columnas_mapa.entrySet()) {
                                entrys_lista.add(entry);
                            }
                            insercion_clui_formulario.procesar(ok, extras_array);
                            if (ok.es == false) { break; }
                            if (insercion_clui_formulario._es_terminar) {                                
                                entrys_lista = insercion_clui_formulario.exportar_valores(ok, extras_array);
                                if (ok.es == false) { break; }
                                LinkedList<Object> valores_lista = new LinkedList<>();
                                for (Entry<String, Object> entry : entrys_lista) {
                                    if (entry.getValue() == null) {
                                        valores_lista.add(null);
                                    } else if (entry.getValue().toString().isBlank()) {
                                        valores_lista.add(null);
                                    } else {
                                        valores_lista.add(entry.getValue());
                                    }
                                }
                                actualizar_fila(valores_lista, ok);
                                if (ok.es == false) { break; }
                            }
                        }
                        case "borrar" -> {
                            es_repetir_interno = true;
                            borrado_clui_formulario.procesar(ok, extras_array);
                            if (ok.es == false) { break; }
                            if (borrado_clui_formulario._es_terminar) {
                                BigDecimal bigDecimal = (BigDecimal) borrado_control_entrada.valor_de_conversion;
                                int fila_num = bigDecimal.intValue();
                                borrar_fila(fila_num, ok);
                                if (ok.es == false) { break; }
                                escribir_linea(tr.in(in, "Fila borrada con éxito. "), ok, extras_array);
                            }
                        }
                        default -> {
                            escribir_linea_error(tr.in(in, "Opción no válida. "), ok, extras_array);
                            es_repetir_interno = true;
                        }}
                        if (es_repetir_interno == false) {
                            break;
                        }
                    }
                    if (ok.es == false) {
                        break;
                    }
                    if (es_repetir_externo == false) {
                        break;
                    }
                }
                oks ok_fin = new oks();
                terminar(ok_fin);
                if (ok_fin.es == false) {
                    ok.setTxt(ok.getTxt(), ok_fin.getTxt());
                }
            }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean iniciar(oks ok, Object... extra_array) throws Exception {
        // Iniciar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(modelos_comunicaciones.class, ok);
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    
    @Override
    public boolean terminar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        _terminar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return ok.es; }
        _terminar_desde_clase(modelos_comunicaciones.class, ok);
        if (ok.es == false) { return ok.es; }
        _terminar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    
    public boolean configurar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            url = properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            if (url == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            }
            driver = properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            if (driver == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            }
            conexion = properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            if (conexion == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            }
            usuario = properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            if (usuario == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            }
            clave = properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            if (clave == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            }
            select = properties.getProperty(k_clab_criptomonedas_select);
            if (select == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select);
            }
            select_columnas_tex = properties.getProperty(k_clab_criptomonedas_select_columnas_tex);
            if (select_columnas_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_tex);
            }
            select_columnas_cabecera_tex = properties.getProperty(k_clab_criptomonedas_select_columnas_cabecera_tex);
            if (select_columnas_cabecera_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_cabecera_tex);
            }
            select_pagina_tam = properties.getProperty(k_clab_criptomonedas_select_pagina_tam);
            if (select_pagina_tam == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_pagina_tam);
            }
            select_count = properties.getProperty(k_clab_criptomonedas_select_count);
            if (select_count == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_count);
            }
            insert = properties.getProperty(k_clab_criptomonedas_insert);
            if (insert == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_insert);
            }
            update = properties.getProperty(k_clab_criptomonedas_update);
            if (update == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_update);
            }
            delete = properties.getProperty(k_clab_criptomonedas_delete);
            if (delete == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_delete);
            }
            letras_por_linea = properties.getProperty(k_clab_criptomonedas_letras_por_linea);
            if (letras_por_linea == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_letras_por_linea);
            }
            if (ok.es == false) {
                escribir_linea(ok.getTxt(), ok, extra_array);
            }
            escribir_linea(tr.in(in, "mensaje de inicio "), ok, extra_array);
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de presentación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_lectura(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            lectura_control_tabla.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            Map<String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_control_tablas_opciones_mapas_lista, lectura_control_tabla.crear_tabla_vacia(ok, extra_array));
            if (ok.es == false) { return ok.es; }
            opciones_mapa.put(k_control_tablas_letras_por_linea_num, Integer.valueOf(letras_por_linea));
            lectura_control_tabla.poner_en_formulario(lectura_clui_formulario, k_lectura_clave_tabla, null, tr.in(in, "Tabla de criptomonedas "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            lectura_control_seleccion.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_control_selecciones_opciones_mapa, new LinkedHashMap<String, Object>() {{
                ResourceBundle in = null;
                in = ResourceBundles.getBundle(k_in_ruta);
                put("retroceder", tr.in(in,"Retroceder"));
                put("avanzar", tr.in(in,"Avanzar"));
                put("ir", tr.in(in,"Ir a fila"));
                put("crear", tr.in(in,"Crear"));
                put("actualizar", tr.in(in,"Actualizar"));
                put("borrar", tr.in(in,"Borrar"));
            }});
            if (ok.es == false) { return ok.es; }
            opciones_mapa.put(k_control_selecciones_letras_por_linea_num, Integer.valueOf(letras_por_linea));
            lectura_control_seleccion.poner_en_formulario(lectura_clui_formulario, k_lectura_clave_seleccion, null, tr.in(in, "Seleccione una opción. "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de paginación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_paginacion(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            paginacion_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_control_entrada.poner_en_formulario(paginacion_clui_formulario, k_paginacion_clave_fila_num
            , null, tr.in(in, "¿Número de fila de inicio de página? "), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de actualización.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_actualizar(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            actualizado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            actualizado_control_entrada.poner_en_formulario(actualizado_clui_formulario, k_borrado_clave_fila_num
            , null, tr.in(in, "¿Número de fila que actualizar? "), null, ok);
            if (ok.es == false) { return ok.es; }
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de borrado.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_borrado(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            borrado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            borrado_control_entrada.poner_en_formulario(borrado_clui_formulario, k_borrado_clave_fila_num
            , null, tr.in(in, "¿Número de fila que borrar? "), null, ok);
            if (ok.es == false) { return ok.es; }
            borrado_control_entrada_confirmar.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            borrado_control_entrada_confirmar.poner_en_formulario(borrado_clui_formulario, k_borrado_clave_confirmar
            , null, tr.in(in, "¿Está seguro? "), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de paginación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_insercion(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            control_entradas insercion_id_criptomoneda_control_entrada = new control_entradas();
            control_entradas insercion_simbolo_control_entrada = new control_entradas();
            control_entradas insercion_capitalizacion_de_mercado_control_entrada = new control_entradas();
            control_entradas insercion_aporte_circulante_control_entrada = new control_entradas();
            control_entradas insercion_capitalizacion_total_diluida_control_entrada = new control_entradas();
            control_entradas insercion_aporte_total_control_entrada = new control_entradas();
            control_entradas insercion_aporte_maximo_control_entrada = new control_entradas();
            control_entradas insercion_dominancia_control_entrada = new control_entradas();
            control_entradas insercion_total_valor_bloqueado_control_entrada = new control_entradas();
            control_entradas insercion_revisar_control_entrada = new control_entradas();
            control_entradas insercion_enviar_control_entrada = new control_entradas();
            String [] columnas_array = select_columnas_cabecera_tex.split(",");
            insercion_id_criptomoneda_control_entrada.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            insercion_simbolo_control_entrada.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_de_mercado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_circulante_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_total_diluida_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_total_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_maximo_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_dominancia_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_total_valor_bloqueado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_revisar_control_entrada.iniciar(k_entradas_tipo_reset, ok);
            if (ok.es == false) { return ok.es; }
            insercion_enviar_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            insercion_id_criptomoneda_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_id_criptomoneda
            , null, columnas_array[0], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_simbolo_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_simbolo
            , null, columnas_array[1], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_de_mercado_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_capitalizacion_de_mercado
            , null, columnas_array[2], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_circulante_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_aporte_circulante
            , null, columnas_array[3], null, ok);
            if (ok.es == false) { return ok.es; }
            Map<String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_opciones_mapa_no_requerido, "");
            insercion_capitalizacion_total_diluida_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_capitalizacion_total_diluida
            , null, columnas_array[4], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_total_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_aporte_total
            , null, columnas_array[5], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_maximo_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_aporte_maximo
            , null, columnas_array[6], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_dominancia_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_dominancia
            , null, columnas_array[7], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_total_valor_bloqueado_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_total_valor_bloqueado
            , null, columnas_array[8], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_revisar_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_revisar
            , null, "¿Desea revisarlo? ", null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_enviar_control_entrada.poner_en_formulario(insercion_clui_formulario, k_insercion_clave_enviar
            , null, tr.in(in, "¿Enviar? "), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Llena el formulario de presentación de una página de una consulta de lectura.
     * @param ok
     * @param filas_lista
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean cargar_tabla(LinkedList<LinkedHashMap<String, Object>> filas_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            lectura_control_tabla.cargar_tabla(filas_lista, ok, extra_array);
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    
    public LinkedList<LinkedHashMap<String, Object>> leer_pagina_criptomonedas(Long inicio_pos, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        LinkedList<LinkedHashMap<String, Object>> retorno_lista = null;
        ResourceBundle in = null;
        try {
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return null; }
            sql_comando.leer_crear_lectura_columnas_lista(select_columnas_tex, ok);
            if (ok.es == false) { return null; }
            sql_comando.leer_iniciar(select, ok, extra_array);
            if (ok.es == false) { return null; }
            sql_comando.leer_poner_valor(inicio_pos, ok, extra_array);
            if (ok.es == false) { return null; }
            sql_comando.leer_poner_valor(Integer.valueOf(select_pagina_tam), ok, extra_array);
            if (ok.es == false) { return null; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return null; }
            sql_comando = cliente_jdbc_servidor_https_spring.leer(sql_comando, ok, extra_array);
            if (ok.es == false) { return null; }
            retorno_lista = Clab_criptomonedas.this._pasar_a_texto_segun_tipo(sql_comando.lecturas_lista, ok, extra_array);
            if (ok.es == false) { return null; }
            _poner_cabecera(retorno_lista, ok);
            if (ok.es == false) { return null; }
            return retorno_lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Long leer_cuenta_filas_criptomonedas(Long inicio_pos, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        ResourceBundle in = null;
        try {
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return null; }
            sql_comando.leer_iniciar(select_count, ok, extra_array);
            if (ok.es == false && ok.id.equals(k_sql_comandos_marcador_columnas_lista_error) == false) {
                return null; 
            } else {
                ok.iniciar();
            }
            sql_comando.leer_crear_lectura_columnas_lista(k_columna_cuenta_tex, ok, extra_array);
            if (ok.es == false) { return null; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return null; }
            sql_comando = cliente_jdbc_servidor_https_spring.leer(sql_comando, ok, extra_array);
            if (ok.es == false) { return null; }
            tipos_valores tipo_valor = sql_comando.lecturas_lista.get(0).get(k_columna_cuenta_tex);
            return ((BigDecimal) tipo_valor.valor).longValue();
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Crea una fila
     * @param valores_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_fila(LinkedList<Object> valores_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.crear_iniciar(insert, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(0), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(1), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(2), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(3), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(4), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(5), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(6), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(7), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(8), ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.crear(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Actualiza una fila
     * @param valores_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean actualizar_fila(LinkedList<Object> valores_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.crear_iniciar(insert, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(0), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(1), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(2), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(3), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(4), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(5), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(6), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(7), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(8), ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.crear(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Borra una fila
     * @param fila_num
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean borrar_fila(int fila_num, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            LinkedHashMap<String, Object> columnas_mapa;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.borrar_iniciar(delete, ok, extra_array);
            if (ok.es == false) { return false; }
            columnas_mapa = lectura_control_tabla.leer_fila(fila_num, ok);
            if (ok.es == false) { return false; }
            for (Object object : columnas_mapa.values()) {
                id = object.toString();
                break;
            }
            if (id == null) { return false; }
            sql_comando.borrar_poner_valor(id, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.borrar(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }

    public LinkedList<LinkedHashMap<String, Object>> _pasar_a_texto_segun_tipo(LinkedList<LinkedHashMap<String, tipos_valores>> filas_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        LinkedList<LinkedHashMap<String, Object>> retorno_lista = null;
        ResourceBundle in = null;
        try {
            String texto;
            LinkedHashMap<String, Object> retorno_columnas_mapa;
            retorno_lista = new LinkedList<>();
            for (LinkedHashMap<String, tipos_valores> columnas_mapa: filas_lista) {
                retorno_columnas_mapa = new LinkedHashMap<>();
                for (Entry<String,tipos_valores> entry: columnas_mapa.entrySet()) {
                    texto = _pasar_a_texto_segun_tipo(entry.getValue(), ok);
                    if (ok.es == false) { break; }
                    retorno_columnas_mapa.put(entry.getKey(), texto);
                }
                if (ok.es == false) { break; }
                retorno_lista.add(retorno_columnas_mapa);
            }
        } catch (Exception e) {
            throw e;
        }
        return retorno_lista;
    }

    public boolean _poner_cabecera(LinkedList<LinkedHashMap<String, Object>> filas_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        try {
            LinkedHashMap<String, Object> cabecera = new LinkedHashMap<>();
            String [] columnas_array;
            columnas_array = select_columnas_cabecera_tex.split(",");
            int i = 0;
            for (String columna: columnas_array) {
                columna = columna.trim();
                cabecera.put(columna, columna);
            }
            filas_lista.addFirst(cabecera); 
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    /**
     * Pasa a texto el dato.
     * @param tipo_valor
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public String _pasar_a_texto_segun_tipo(tipos_valores tipo_valor, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        String retorno = null;
        try {
            String tipo = tipo_valor.getTipo();
            Object valor = tipo_valor.getValor();
            Date date;
            Time time;
            if (valor == null) {
                retorno = "--";
            } else if (valor instanceof String) {
                if (tipo.toLowerCase().contains("date")
                 || tipo.toLowerCase().contains("timestamp")) {
                    date = convertir_fecha_y_hora(valor.toString(), ok);
                    retorno = String.format(k_formato_date, date);
                } else if (tipo.toLowerCase().contains("time")) {
                    time = convertir_hora(valor.toString(), ok);
                    retorno = String.format(k_formato_time, time);
                } else {
                    retorno = valor.toString();
                }
            } else if (valor instanceof Date valor_date) {
                retorno = String.format(k_formato_date, valor_date);
            } else if (valor instanceof Time valor_time) {
                retorno = String.format(k_formato_time, valor_time);
            } else if (valor instanceof Integer valor_integer) {
                retorno = String.format(k_formato_numero, valor_integer);
            } else if (valor instanceof Long valor_long) {
                retorno = String.format(k_formato_numero, valor_long);
            } else if (valor instanceof Double valor_double) {
                retorno = String.format(k_formato_decimal, valor_double);
            } else if (valor instanceof Float valor_float) {
                retorno = String.format(k_formato_decimal, valor_float);
            } else if (valor instanceof BigDecimal valor_bigdecimal) {
                if (valor_bigdecimal.remainder(BigDecimal.ONE).multiply(BigDecimal.valueOf(1000)).compareTo(BigDecimal.ZERO) > 0) {
                    retorno = String.format(k_formato_decimal, valor_bigdecimal);
                } else {
                    retorno = String.format(k_formato_numero, valor_bigdecimal.toBigIntegerExact());
                }
            } else if (valor instanceof BigInteger valor_biginteger) {
                retorno = String.format(k_formato_numero, valor_biginteger);
            } else {
                retorno = valor.toString();
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return retorno;
    }
    /**
     * Convierte una hora según los formatos de k_patrones_formato_fecha y k_patrones_formato_hora (separados por |)
     * El texto se separa por el espacio en blanco entre la fecha y la hora. Y se convierten por separado
     * @param texto
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public Date convertir_fecha_y_hora(String texto, oks ok, Object ... extras_array) throws Exception {
        Date date;
        date = patrones.convertir_fecha_y_hora(texto, ok, extras_array);
        if (ok.es == false) {
            date = patrones.convertir_fecha(texto, ok, extras_array);
        }
        return date;
    }    
    /**
     * Convierte una hora según los formatos de k_patrones_formato_hora (separados por |)
     * @param texto
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public Time convertir_hora(String texto, oks ok, Object ... extras_array) throws Exception {
        Time time;
        Date date;
        date = patrones.convertir_hora(texto, ok, extras_array);
        time = new Time(date.getTime());
        return time;
    }
}

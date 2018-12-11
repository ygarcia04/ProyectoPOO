--
-- PostgreSQL database dump
--

-- Dumped from database version 9.1.5
-- Dumped by pg_dump version 10.5

-- Started on 2018-12-07 19:46:44

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1912 (class 0 OID 0)
-- Dependencies: 1911
-- Name: DATABASE "db_Contabilidad"; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE "db_Contabilidad" IS 'Base de datos proyecto POO III PAC 2018';


--
-- TOC entry 1 (class 3079 OID 11639)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1915 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 163 (class 1259 OID 18117)
-- Name: Tbl_Cuenta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Tbl_Cuenta" (
    "idCuenta" integer NOT NULL,
    "nombreCuenta" character(50) NOT NULL,
    tipo integer NOT NULL
);


ALTER TABLE public."Tbl_Cuenta" OWNER TO postgres;

--
-- TOC entry 168 (class 1259 OID 18132)
-- Name: Tbl_Cuenta_idCuenta_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Tbl_Cuenta_idCuenta_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Tbl_Cuenta_idCuenta_seq" OWNER TO postgres;

--
-- TOC entry 1916 (class 0 OID 0)
-- Dependencies: 168
-- Name: Tbl_Cuenta_idCuenta_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Tbl_Cuenta_idCuenta_seq" OWNED BY public."Tbl_Cuenta"."idCuenta";


--
-- TOC entry 165 (class 1259 OID 18123)
-- Name: Tbl_DetBalance; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Tbl_DetBalance" (
    balance integer NOT NULL,
    cuenta integer NOT NULL,
    monto numeric(10,2)
);


ALTER TABLE public."Tbl_DetBalance" OWNER TO postgres;

--
-- TOC entry 164 (class 1259 OID 18120)
-- Name: Tbl_EncabezadoBalance; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Tbl_EncabezadoBalance" (
    "idBalance" integer NOT NULL,
    "fechaInicio" date NOT NULL,
    "fechaFin" date NOT NULL
);


ALTER TABLE public."Tbl_EncabezadoBalance" OWNER TO postgres;

--
-- TOC entry 171 (class 1259 OID 18161)
-- Name: Tbl_EncabezadoBalance_idBalance_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Tbl_EncabezadoBalance_idBalance_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Tbl_EncabezadoBalance_idBalance_seq" OWNER TO postgres;

--
-- TOC entry 1917 (class 0 OID 0)
-- Dependencies: 171
-- Name: Tbl_EncabezadoBalance_idBalance_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Tbl_EncabezadoBalance_idBalance_seq" OWNED BY public."Tbl_EncabezadoBalance"."idBalance";


--
-- TOC entry 166 (class 1259 OID 18126)
-- Name: Tbl_Movimientos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Tbl_Movimientos" (
    correlativo integer NOT NULL,
    cuenta integer NOT NULL,
    fecha date NOT NULL,
    debe numeric(10,2),
    haber numeric(10,2)
);


ALTER TABLE public."Tbl_Movimientos" OWNER TO postgres;

--
-- TOC entry 172 (class 1259 OID 18171)
-- Name: Tbl_Movimientos_correlativo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Tbl_Movimientos_correlativo_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Tbl_Movimientos_correlativo_seq" OWNER TO postgres;

--
-- TOC entry 1918 (class 0 OID 0)
-- Dependencies: 172
-- Name: Tbl_Movimientos_correlativo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Tbl_Movimientos_correlativo_seq" OWNED BY public."Tbl_Movimientos".correlativo;


--
-- TOC entry 162 (class 1259 OID 18114)
-- Name: Tbl_TipoCuenta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Tbl_TipoCuenta" (
    "idTipo" integer NOT NULL,
    "tipoCuenta" character(50) NOT NULL
);


ALTER TABLE public."Tbl_TipoCuenta" OWNER TO postgres;

--
-- TOC entry 169 (class 1259 OID 18140)
-- Name: Tbl_TipoCuenta_idTipo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Tbl_TipoCuenta_idTipo_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Tbl_TipoCuenta_idTipo_seq" OWNER TO postgres;

--
-- TOC entry 1919 (class 0 OID 0)
-- Dependencies: 169
-- Name: Tbl_TipoCuenta_idTipo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Tbl_TipoCuenta_idTipo_seq" OWNED BY public."Tbl_TipoCuenta"."idTipo";


--
-- TOC entry 167 (class 1259 OID 18129)
-- Name: Tbl_Usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Tbl_Usuario" (
    "idUsuario" integer NOT NULL,
    usuario character(30) NOT NULL,
    password character(30) NOT NULL
);


ALTER TABLE public."Tbl_Usuario" OWNER TO postgres;

--
-- TOC entry 170 (class 1259 OID 18153)
-- Name: Tbl_Usuario_idUsuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Tbl_Usuario_idUsuario_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Tbl_Usuario_idUsuario_seq" OWNER TO postgres;

--
-- TOC entry 1920 (class 0 OID 0)
-- Dependencies: 170
-- Name: Tbl_Usuario_idUsuario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Tbl_Usuario_idUsuario_seq" OWNED BY public."Tbl_Usuario"."idUsuario";


--
-- TOC entry 1776 (class 2604 OID 18134)
-- Name: Tbl_Cuenta idCuenta; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Cuenta" ALTER COLUMN "idCuenta" SET DEFAULT nextval('public."Tbl_Cuenta_idCuenta_seq"'::regclass);


--
-- TOC entry 1777 (class 2604 OID 18163)
-- Name: Tbl_EncabezadoBalance idBalance; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_EncabezadoBalance" ALTER COLUMN "idBalance" SET DEFAULT nextval('public."Tbl_EncabezadoBalance_idBalance_seq"'::regclass);


--
-- TOC entry 1778 (class 2604 OID 18173)
-- Name: Tbl_Movimientos correlativo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Movimientos" ALTER COLUMN correlativo SET DEFAULT nextval('public."Tbl_Movimientos_correlativo_seq"'::regclass);


--
-- TOC entry 1775 (class 2604 OID 18142)
-- Name: Tbl_TipoCuenta idTipo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_TipoCuenta" ALTER COLUMN "idTipo" SET DEFAULT nextval('public."Tbl_TipoCuenta_idTipo_seq"'::regclass);


--
-- TOC entry 1779 (class 2604 OID 18155)
-- Name: Tbl_Usuario idUsuario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Usuario" ALTER COLUMN "idUsuario" SET DEFAULT nextval('public."Tbl_Usuario_idUsuario_seq"'::regclass);


--
-- TOC entry 1896 (class 0 OID 18117)
-- Dependencies: 163
-- Data for Name: Tbl_Cuenta; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Tbl_Cuenta" ("idCuenta", "nombreCuenta", tipo) FROM stdin;
1	Caja                                              	1
2	Bancos                                            	1
3	Inversiones Temp                                  	1
4	Doc por Cobrar                                    	1
5	Clientes                                          	1
6	Deudores Varios                                   	1
7	Anticipo a emp                                    	1
8	Inventario                                        	1
9	Acciones y valores                                	1
10	Depositos a plazo fijo                            	1
11	Terrenos                                          	1
12	Edificios                                         	1
13	Maquinaria y Equip                                	1
14	Mobiliario y Equip                                	1
15	Equipo de Transporte                              	1
16	Equipo de distribucion                            	1
17	Herramientas                                      	1
18	Credito Mercantil                                 	1
19	Patentes                                          	1
20	Marcas                                            	1
21	Derechos de autor                                 	1
22	Gastos de organizacion                            	1
23	Gastos de instalacion                             	1
24	Gastos de investigacion                           	1
25	Seguros pagados por adelant                       	1
26	Rentas pagadas por ant                            	1
27	Impuesto s/v Pagado                               	1
28	Intereses pagados por adelant                     	1
29	Papeleria y utiles                                	1
30	Material de empaque                               	1
31	Material de aseo                                  	1
32	Publicidad                                        	1
33	Accesorios y suministros                          	1
34	Depositos en garantia                             	1
35	Doc por cobrar L/P                                	1
36	Anticipo a proveedores                            	1
37	Proveedores                                       	2
38	Documentos por pagar                              	2
39	Prestamos Bancarios                               	2
40	Acreedores varios                                 	2
41	Impuestos s/v cobrados                            	2
42	Imp s/Renta a pagar                               	2
43	Doc por pagar L/P                                 	2
44	Prestamos Bancarios L/P                           	2
45	Hipotecas por pagar                               	2
46	Rentas cobradas por anticipado                    	2
47	Intereses cobrados por ant                        	2
48	Anticipo a cliente                                	2
49	Capital                                           	3
50	Reservas                                          	3
51	Utilidad/Perdida                                  	3
\.


--
-- TOC entry 1898 (class 0 OID 18123)
-- Dependencies: 165
-- Data for Name: Tbl_DetBalance; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Tbl_DetBalance" (balance, cuenta, monto) FROM stdin;
\.


--
-- TOC entry 1897 (class 0 OID 18120)
-- Dependencies: 164
-- Data for Name: Tbl_EncabezadoBalance; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Tbl_EncabezadoBalance" ("idBalance", "fechaInicio", "fechaFin") FROM stdin;
\.


--
-- TOC entry 1899 (class 0 OID 18126)
-- Dependencies: 166
-- Data for Name: Tbl_Movimientos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Tbl_Movimientos" (correlativo, cuenta, fecha, debe, haber) FROM stdin;
\.


--
-- TOC entry 1895 (class 0 OID 18114)
-- Dependencies: 162
-- Data for Name: Tbl_TipoCuenta; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Tbl_TipoCuenta" ("idTipo", "tipoCuenta") FROM stdin;
1	Activo                                            
2	Pasivo                                            
3	Patrimonio Neto                                   
\.


--
-- TOC entry 1900 (class 0 OID 18129)
-- Dependencies: 167
-- Data for Name: Tbl_Usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Tbl_Usuario" ("idUsuario", usuario, password) FROM stdin;
\.


--
-- TOC entry 1921 (class 0 OID 0)
-- Dependencies: 168
-- Name: Tbl_Cuenta_idCuenta_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Tbl_Cuenta_idCuenta_seq"', 51, true);


--
-- TOC entry 1922 (class 0 OID 0)
-- Dependencies: 171
-- Name: Tbl_EncabezadoBalance_idBalance_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Tbl_EncabezadoBalance_idBalance_seq"', 1, false);


--
-- TOC entry 1923 (class 0 OID 0)
-- Dependencies: 172
-- Name: Tbl_Movimientos_correlativo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Tbl_Movimientos_correlativo_seq"', 1, false);


--
-- TOC entry 1924 (class 0 OID 0)
-- Dependencies: 169
-- Name: Tbl_TipoCuenta_idTipo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Tbl_TipoCuenta_idTipo_seq"', 3, true);


--
-- TOC entry 1925 (class 0 OID 0)
-- Dependencies: 170
-- Name: Tbl_Usuario_idUsuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Tbl_Usuario_idUsuario_seq"', 1, false);


--
-- TOC entry 1783 (class 2606 OID 18139)
-- Name: Tbl_Cuenta Tbl_Cuenta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Cuenta"
    ADD CONSTRAINT "Tbl_Cuenta_pkey" PRIMARY KEY ("idCuenta");


--
-- TOC entry 1787 (class 2606 OID 18170)
-- Name: Tbl_DetBalance Tbl_DetBalance_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_DetBalance"
    ADD CONSTRAINT "Tbl_DetBalance_pkey" PRIMARY KEY (balance, cuenta);


--
-- TOC entry 1785 (class 2606 OID 18168)
-- Name: Tbl_EncabezadoBalance Tbl_EncabezadoBalance_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_EncabezadoBalance"
    ADD CONSTRAINT "Tbl_EncabezadoBalance_pkey" PRIMARY KEY ("idBalance");


--
-- TOC entry 1789 (class 2606 OID 18178)
-- Name: Tbl_Movimientos Tbl_Movimientos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Movimientos"
    ADD CONSTRAINT "Tbl_Movimientos_pkey" PRIMARY KEY (correlativo);


--
-- TOC entry 1781 (class 2606 OID 18147)
-- Name: Tbl_TipoCuenta Tbl_TipoCuenta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_TipoCuenta"
    ADD CONSTRAINT "Tbl_TipoCuenta_pkey" PRIMARY KEY ("idTipo");


--
-- TOC entry 1791 (class 2606 OID 18160)
-- Name: Tbl_Usuario Tbl_Usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Usuario"
    ADD CONSTRAINT "Tbl_Usuario_pkey" PRIMARY KEY ("idUsuario");


--
-- TOC entry 1792 (class 2606 OID 18148)
-- Name: Tbl_Cuenta Tbl_Cuenta_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Cuenta"
    ADD CONSTRAINT "Tbl_Cuenta_fkey" FOREIGN KEY (tipo) REFERENCES public."Tbl_TipoCuenta"("idTipo");


--
-- TOC entry 1793 (class 2606 OID 18179)
-- Name: Tbl_Movimientos Tbl_Movimientos_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tbl_Movimientos"
    ADD CONSTRAINT "Tbl_Movimientos_fkey" FOREIGN KEY (cuenta) REFERENCES public."Tbl_Cuenta"("idCuenta");


--
-- TOC entry 1914 (class 0 OID 0)
-- Dependencies: 7
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2018-12-07 19:46:45

--
-- PostgreSQL database dump complete
--


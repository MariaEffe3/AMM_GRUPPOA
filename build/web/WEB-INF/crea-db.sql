/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Maria Francesca
 * Created: 14-feb-2017
 */

CREATE DATABASE violet;

CREATE TABLE utente
(
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    nome VARCHAR(128),
    cognome VARCHAR(128),
    username VARCHAR(128),
    password VARCHAR(128)
)


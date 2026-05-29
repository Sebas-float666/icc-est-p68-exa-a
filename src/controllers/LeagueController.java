package controllers;

import models.League;

public class LeagueController {

    /**
     * FILA A - Implementar este metodo con Selection Sort ascendente.
     * Ordena el arreglo de ligas de menor a mayor segun getTotalActiveGoals().
     *
     * Nombre exacto requerido: sortSelectionAsc
     *
     * @param leagues Arreglo de ligas a ordenar
     * @return Arreglo ordenado
     */
    public League[] sortSelectionAsc(League[] leagues) {
        // TODO: Implementar (solo si su fila es A)

        for (int i = 0; i < leagues.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < leagues.length; j++) {
                if (leagues[j].getTotalActiveGoals() < leagues[max].getTotalActiveGoals()) {
                    max = j;
                }
            }
            League aux = leagues[i];
            leagues[i] = leagues[max];
            leagues[max] = aux;

        }
        return leagues;
    }

    /**
     * TODOS - Implementar busqueda binaria por goles activos totales.
     *
     * El arreglo recibido ya fue ordenado con el metodo de su fila.
     * Implemente la busqueda conforme al orden que aplico:
     * - Fila A: arreglo ascendente, use logica de busqueda ascendente.
     * - Fila B: arreglo descendente, use logica de busqueda descendente.
     *
     * Nombre exacto requerido: binarySearchByTotalActiveGoals
     *
     * @param leagues          Arreglo de ligas ya ordenado
     * @param totalActiveGoals Total de goles activos a buscar
     * @return La liga encontrada, o null si no existe
     */
    public int binarySearchByTotalActiveGoals(League[] league, int totalActiveGoals) {

        int inicio = 0;
        int fin = league.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (medio == totalActiveGoals) {
                return medio;
            }
            if (medio < totalActiveGoals) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;

    }

    /**
     * Imprime el arreglo de ligas en consola.
     *
     * @param leagues Arreglo de ligas a imprimir
     */
    public void printLeagues(League[] leagues) {

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potroMusic.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.potroMusic.entidades.Album;
import mx.itson.potroMusic.entidades.Artista;
import mx.itson.potroMusic.entidades.Cancion;
import mx.itson.potroMusic.enums.Genero;

/**
 *
 * @author natyv
 */
public class main {
    
    public static void main(String[] args) {
        Artista artista = new Artista();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe el nombre del album: ");
        String nombreAlbum = scanner.nextLine();
        artista.setNombre(nombreAlbum);
        
        System.out.println("Escribe cual es su sitio web: ");
        String sitioWeb = scanner.nextLine();
        artista.setSitioWeb(sitioWeb);
        
        System.out.println("Escribe cual es la descripcion: ");
        String descripcion = scanner.nextLine();
        artista.setDescripcion(descripcion);
                
        Album a = new Album();
        
        a.setArtista(artista);
        a.setNombre(nombreAlbum);
        a.setLanzamiento(2025);
        a.setGenero(Genero.OTRO);
       
        List<Cancion> canciones = new ArrayList<>();
        
        System.out.println("Ingrese la cantidad de canciones que desea en el album" + a.getNombre());
        int albumCantidad = scanner.nextInt();
        
        for (int i=1; i<=albumCantidad;i++){
        
            Cancion cancion = new Cancion();
            
            System.out.println("Ingrese el nombre de la cancion ");
            String cancionNombre = scanner.next();
            cancion.setNombre(cancionNombre);
            
            System.out.println("La duracion de la cancion en segundos");
            int duracionCancion1 = scanner.nextInt();
            cancion.setDuracion(duracionCancion1);
            
            System.out.println("Orden de la cancion: ");
            int ordenCancion1 = scanner.nextInt();
            cancion.setOrden(ordenCancion1);
            
            canciones.add(cancion);
        }
        a.setCanciones(canciones);
        
        for(Cancion c : a.getCanciones()){
        System.out.println(c.getNombre());
        System.out.println(c.getOrden());
        System.out.println(c.getDuracion());
        }
    }
}

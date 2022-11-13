
package salon;


public class Alumno {
    private int codigo;
    private String nombre;
    
    private Notas nota;

    public Alumno(int codigo, String nombre, Notas nota) {
        this.codigo = codigo;
        this.nombre = nombre;   
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public void modificarNotas(int n1,int n2,int n3){
        nota.setNota1(n1);
        nota.setNota2(n2);
        nota.setNota3(n3);
    
    }
    
    
    public void datosYnotas(){
        System.out.println("Codigo: "+this.codigo+"||Nombre: "+nombre+"||Nota1: "+nota.getNota1()+"||Nota2: "+nota.getNota2()+"||Nota3: "+nota.getNota3());
        
    }
    
    
    
    
    
    
    
    }
    


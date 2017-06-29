package service.operacaoView.SelectsFiltro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author H.L.Cancellier
 */
public class GeraSelect {
    
    public String retornaStringSelect(ParametroSelect ps){
        return  ps.getBaseSelect() +
                ps.getCOLUMN_CLAUSE()+
                ps.getBaseFrom() + 
                ps.getINNER_JOIN_CLAUSE()+
                ps.getBaseWhere() + 
                ps.getWHERE_CLAUSE()
                ;
    }
    
    public String retornaStringSelect(List<ParametroSelect> lps){
        StringBuffer stringSelect = new StringBuffer();
        stringSelect.append(lps.get(0).getBaseSelect());
        for(ParametroSelect ps: lps){
            stringSelect.append(ps.getCOLUMN_CLAUSE());
        }
        stringSelect.append(lps.get(0).getBaseFrom());
        
        for(ParametroSelect ps: lps){
            System.out.println("Clausula: " + ps.getINNER_JOIN_CLAUSE());
            if(stringSelect.toString().contains(ps.getINNER_JOIN_CLAUSE())){
                System.out.println("Contém..");
            }else{
                System.out.println("Não Contém..");
            }
            stringSelect.append(ps.getINNER_JOIN_CLAUSE());
        }
        
        stringSelect.append(lps.get(0).getBaseWhere());
        for(ParametroSelect ps: lps){
            stringSelect.append(ps.getWHERE_CLAUSE());
        }
        return stringSelect.toString();
    }
    
    
    public static void main(String[] args){
        GeraSelect g = new GeraSelect();
        
        ParametroSelect ps1 = new PSOrigem();
        ps1.setValor("EVENTOS NÃO ESPORTIVOS");
        
        System.out.println(g.retornaStringSelect(ps1));
        
        ps1.setValor("ESPORTE");
        
        System.out.println(g.retornaStringSelect(ps1));
        
        System.out.println("");
        
        ParametroSelect ps2 = new PSQualification();
        ps2.setValor("teste");
        
        
        List<ParametroSelect> lps = new ArrayList<ParametroSelect>();
        
        lps.add(ps1);
        lps.add(ps2);
        System.out.println(lps.get(0).compareTo(lps.get(1)));
        /*
        System.out.println(g.retornaStringSelect(lps));
        */
        System.out.println(ps1.getINNER_JOIN_CLAUSE());
        System.out.println(ps2.getINNER_JOIN_CLAUSE());
    }
}


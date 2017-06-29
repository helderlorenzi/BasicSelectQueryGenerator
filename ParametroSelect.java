package SMSService.operacaoView.SelectsFiltro;

import java.util.List;

/**
 *
 * @author H.L.Cancellier
 */
public abstract class ParametroSelect implements Comparable<ParametroSelect>{

    @Override
    public int compareTo(ParametroSelect o) {
        int c = 0;
        if(this.INNER_JOIN_CLAUSE.length() > o.INNER_JOIN_CLAUSE.length()){c = 1;}
        if(this.INNER_JOIN_CLAUSE.length() < o.INNER_JOIN_CLAUSE.length()){c = -1;}
        return c;
    }
    
    private String baseSelect = "SELECT users.id_user, users.name_user, users.birth_user, phones.id_phone, phones.type_phone, phones.ddd_phone, phones.phone, phones.operator";
    private String baseFrom = " FROM users INNER JOIN phones_by_user ON phones_by_user.id_user = users.id_user INNER JOIN phones ON phones_by_user.id_phone = phones.id_phone";
    private String baseWhere = " WHERE phones.type_phone = 'MÓVEL'";
    
    private String valor = "";
    private String COLUMN_CLAUSE;
    private String INNER_JOIN_CLAUSE;
    private String WHERE_CLAUSE;

    public String getBaseSelect() {
        return baseSelect;
    }

    public void setBaseSelect(String baseSelect) {
        this.baseSelect = baseSelect;
    }

    public String getBaseFrom() {
        return baseFrom;
    }

    public void setBaseFrom(String baseFrom) {
        this.baseFrom = baseFrom;
    }

    public String getBaseWhere() {
        return baseWhere;
    }

    public void setBaseWhere(String baseWhere) {
        this.baseWhere = baseWhere;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCOLUMN_CLAUSE() {
        if(getValor().equals("")){
            return "";}
        else{
            return COLUMN_CLAUSE;
        }
    }

    public void setCOLUMN_CLAUSE(String COLUMN_CLAUSE) {
        this.COLUMN_CLAUSE = COLUMN_CLAUSE;
    }

    public String getINNER_JOIN_CLAUSE() {
        if(getValor().equals("")){
            return "";}
        else{
            return INNER_JOIN_CLAUSE;
        }
    }

    public void setINNER_JOIN_CLAUSE(String INNER_JOIN_CLAUSE) {
        this.INNER_JOIN_CLAUSE = INNER_JOIN_CLAUSE;
    }

    public String getWHERE_CLAUSE() {
        if(getValor().equals("")){
            return "";}
        else{
            return WHERE_CLAUSE.replace("@", getValor());
        }
    }

    public void setWHERE_CLAUSE(String WHERE_CLAUSE) {
        this.WHERE_CLAUSE = WHERE_CLAUSE;
    }
    
    
        
}

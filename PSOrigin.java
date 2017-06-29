package SMSService.operacaoView.SelectsFiltro;

/**
 *
 * @author H.L.Cancellier
 */
public class PSOrigin extends ParametroSelect{
    
    public PSOrigin(){
        setCOLUMN_CLAUSE(", sources_data.desc_origin AS origin");
        setINNER_JOIN_CLAUSE(" INNER JOIN origin_details ON origin_details.id_user = users.id_user INNER JOIN origins_cadastro ON users.id_origin = origins_cadastro.id_origin");
        setWHERE_CLAUSE(" AND origins_data.desc_origin = '@'");
    }
    
}

package SMSService.operacaoView.SelectsFiltro;

/**
 *
 * @author H.L.Cancellier
 */
public class PSQualification extends ParametroSelect{
    
    public PSQualification(){
        setCOLUMN_CLAUSE(", ocupations.ocupation AS qualification");
        setINNER_JOIN_CLAUSE(" INNER JOIN origin_details ON origin_details.id_user = users.id_user INNER JOIN origins_data ON users.id_origin = origins_data.id_origin INNER JOIN areas ON origin_details.area = areas.id_area INNER JOIN ocupations ON users.ocupation = ocupations.id_ocupation");
        setWHERE_CLAUSE(" AND ocupations.ocupation = '@'");
    }
    
}

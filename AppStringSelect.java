package service.operacaoView.SelectsFiltro;

/**
 *
 * @author H.L.Cancellier
 */
public class AppStringSelect {
    public void main(String[] args){
        String filterByOrigin =
                " SELECT" +
                " users.id_user," +
                " users.nome_user," +
                " users.birth_user," +
                " phones.id_phone," +
                " phones.type_phone," +
                " phones.ddd_phone," +
                " phones.phone," +
                " phones.operator," +

                " sources_data.desc_origin AS origin" +

                " FROM users" +
                " INNER JOIN phones_por_user ON phones_por_user.id_user = users.id_user INNER JOIN phones ON phones_por_user.id_phone = phones.id_phone" +

                " INNER JOIN origin_details ON origin_details.id_user = users.id_user INNER JOIN sources_data ON users.id_origin = sources_data.id_origin" +

                " WHERE sources_data.desc_origin = ''" +

                " AND phones.type_phone = 'MÓVEL'"; 

        String filterByQualification =
                " SELECT" +
                " users.id_user," +
                " users.nome_user," +
                " users.birth_user," +
                " phones.id_phone," +
                " phones.type_phone," +
                " phones.ddd_phone," +
                " phones.phone," +
                " phones.operator," +

                " ocupations.ocupation AS qualification" +

                " FROM users" +
                " INNER JOIN phones_por_user ON phones_por_user.id_user = users.id_user INNER JOIN phones ON phones_por_user.id_phone = phones.id_phone" +

                " INNER JOIN origin_details ON origin_details.id_user = users.id_user INNER JOIN sources_data ON users.id_origin = sources_data.id_origin" +
                " INNER JOIN areas ON origin_details.area = areas.id_area INNER JOIN ocupations ON users.ocupation = ocupations.id_ocupation" +

                " WHERE ocupations.ocupation = ''" +
                " AND phones.type_phone = 'MÓVEL'" 
                ;

        String filterByArea =
                " SELECT" +
                " users.id_user," +
                " users.nome_user," +
                " users.birth_user," +
                " phones.id_phone," +
                " phones.type_phone," +
                " phones.ddd_phone," +
                " phones.phone," +
                " phones.operator," +

                " areas.area AS `description area`" +

                " FROM users" +
                " INNER JOIN phones_por_user ON phones_por_user.id_user = users.id_user INNER JOIN phones ON phones_por_user.id_phone = phones.id_phone" +

                " INNER JOIN origin_details ON origin_details.id_user = users.id_user INNER JOIN sources_data ON users.id_origin = sources_data.id_origin" +
                " INNER JOIN areas ON origin_details.area = areas.id_area INNER JOIN ocupations ON users.ocupation = ocupations.id_ocupation" +

                " WHERE areas.area = ''" +

                " AND phones.type_phone = 'MÓVEL'" 
                ;

        String filterByModality =
                " SELECT" +
                " users.id_user," +
                " users.nome_user," +
                " users.birth_user," +
                " phones.id_phone," +
                " phones.type_phone," +
                " phones.ddd_phone," +
                " phones.phone," +
                " phones.operator," +

                " modalityes.modality AS modality" +

                " FROM users" +
                " INNER JOIN phones_por_user ON phones_por_user.id_user = users.id_user INNER JOIN phones ON phones_por_user.id_phone = phones.id_phone" +

                " INNER JOIN modalityes_por_user ON modalityes_por_user.id_user = users.id_user INNER JOIN modalityes ON modalityes.id_modality = modalityes_por_user.id_modality" +

                " WHERE modalityes.modality = ''" +

                " AND phones.type_phone = 'MÓVEL'" 
                ;

    }
}

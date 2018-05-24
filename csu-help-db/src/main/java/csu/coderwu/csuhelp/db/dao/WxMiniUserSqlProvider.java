package csu.coderwu.csuhelp.db.dao;

import csu.coderwu.csuhelp.db.entity.WxMiniUser;
import csu.coderwu.csuhelp.db.entity.WxMiniUserExample.Criteria;
import csu.coderwu.csuhelp.db.entity.WxMiniUserExample.Criterion;
import csu.coderwu.csuhelp.db.entity.WxMiniUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class WxMiniUserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    public String countByExample(WxMiniUserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("wx_mini_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    public String deleteByExample(WxMiniUserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("wx_mini_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    public String insertSelective(WxMiniUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("wx_mini_user");
        
        if (record.getNickname() != null) {
            sql.VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.VALUES("gender", "#{gender,jdbcType=INTEGER}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            sql.VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            sql.VALUES("country", "#{country,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarUrl() != null) {
            sql.VALUES("avatar_url", "#{avatarUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUnionId() != null) {
            sql.VALUES("union_id", "#{unionId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    public String selectByExample(WxMiniUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("open_id");
        } else {
            sql.SELECT("open_id");
        }
        sql.SELECT("nickname");
        sql.SELECT("gender");
        sql.SELECT("city");
        sql.SELECT("province");
        sql.SELECT("country");
        sql.SELECT("avatar_url");
        sql.SELECT("union_id");
        sql.FROM("wx_mini_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        WxMiniUser record = (WxMiniUser) parameter.get("record");
        WxMiniUserExample example = (WxMiniUserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("wx_mini_user");
        
        if (record.getOpenId() != null) {
            sql.SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{record.gender,jdbcType=INTEGER}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{record.city,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            sql.SET("province = #{record.province,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            sql.SET("country = #{record.country,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarUrl() != null) {
            sql.SET("avatar_url = #{record.avatarUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUnionId() != null) {
            sql.SET("union_id = #{record.unionId,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("wx_mini_user");
        
        sql.SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        sql.SET("gender = #{record.gender,jdbcType=INTEGER}");
        sql.SET("city = #{record.city,jdbcType=VARCHAR}");
        sql.SET("province = #{record.province,jdbcType=VARCHAR}");
        sql.SET("country = #{record.country,jdbcType=VARCHAR}");
        sql.SET("avatar_url = #{record.avatarUrl,jdbcType=VARCHAR}");
        sql.SET("union_id = #{record.unionId,jdbcType=VARCHAR}");
        
        WxMiniUserExample example = (WxMiniUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(WxMiniUser record) {
        SQL sql = new SQL();
        sql.UPDATE("wx_mini_user");
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{gender,jdbcType=INTEGER}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            sql.SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            sql.SET("country = #{country,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarUrl() != null) {
            sql.SET("avatar_url = #{avatarUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUnionId() != null) {
            sql.SET("union_id = #{unionId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("open_id = #{openId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_mini_user
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, WxMiniUserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
package org.talend.designer.codegen.translators.databases.amazon.mysql;

import org.talend.core.model.metadata.IMetadataColumn;

import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.metadata.MappingTypeRetriever;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.process.IProcess;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class TAmazonMysqlOutputMainJava {
  protected static String nl;
  public static synchronized TAmazonMysqlOutputMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TAmazonMysqlOutputMainJava result = new TAmazonMysqlOutputMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + "                if(log.is";
  protected final String TEXT_4 = "Enabled())";
  protected final String TEXT_5 = NL + "            log.";
  protected final String TEXT_6 = "(\"";
  protected final String TEXT_7 = " - \" ";
  protected final String TEXT_8 = " + ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = ");";
  protected final String TEXT_11 = NL + "            StringBuilder ";
  protected final String TEXT_12 = " = new StringBuilder();";
  protected final String TEXT_13 = NL + "            ";
  protected final String TEXT_14 = ".append(\"Parameters:\");";
  protected final String TEXT_15 = NL + "                    ";
  protected final String TEXT_16 = ".append(\"";
  protected final String TEXT_17 = "\" + \" = \" + String.valueOf(";
  protected final String TEXT_18 = ").substring(0, 4) + \"...\");     ";
  protected final String TEXT_19 = NL + "                    ";
  protected final String TEXT_20 = ".append(\"";
  protected final String TEXT_21 = "\" + \" = \" + ";
  protected final String TEXT_22 = ");";
  protected final String TEXT_23 = NL + "                ";
  protected final String TEXT_24 = ".append(\" | \");";
  protected final String TEXT_25 = NL + "            StringBuilder ";
  protected final String TEXT_26 = " = new StringBuilder();    ";
  protected final String TEXT_27 = NL + "                    ";
  protected final String TEXT_28 = ".append(";
  protected final String TEXT_29 = ".";
  protected final String TEXT_30 = ");";
  protected final String TEXT_31 = NL + "                    if(";
  protected final String TEXT_32 = ".";
  protected final String TEXT_33 = " == null){";
  protected final String TEXT_34 = NL + "                        ";
  protected final String TEXT_35 = ".append(\"<null>\");" + NL + "                    }else{";
  protected final String TEXT_36 = NL + "                        ";
  protected final String TEXT_37 = ".append(";
  protected final String TEXT_38 = ".";
  protected final String TEXT_39 = ");" + NL + "                    }   ";
  protected final String TEXT_40 = NL + "                ";
  protected final String TEXT_41 = ".append(\"|\");";
  protected final String TEXT_42 = NL;
  protected final String TEXT_43 = NL + "            ";
  protected final String TEXT_44 = " = null;";
  protected final String TEXT_45 = NL + "\t\tif(nb_line_";
  protected final String TEXT_46 = "==0) {" + NL + "\t";
  protected final String TEXT_47 = NL + "    \t";
  protected final String TEXT_48 = NL + "            java.sql.Statement stmtDrop_";
  protected final String TEXT_49 = " = conn_";
  protected final String TEXT_50 = ".createStatement();";
  protected final String TEXT_51 = NL + "                              stmtDrop_";
  protected final String TEXT_52 = ".setQueryTimeout(Integer.valueOf(Integer.valueOf(";
  protected final String TEXT_53 = ")));";
  protected final String TEXT_54 = NL + "            stmtDrop_";
  protected final String TEXT_55 = ".execute(\"";
  protected final String TEXT_56 = "\" ";
  protected final String TEXT_57 = ");";
  protected final String TEXT_58 = NL + "            stmtDrop_";
  protected final String TEXT_59 = ".close();" + NL + "            java.sql.Statement stmtCreate_";
  protected final String TEXT_60 = " = conn_";
  protected final String TEXT_61 = ".createStatement();";
  protected final String TEXT_62 = NL + "                              stmtCreate_";
  protected final String TEXT_63 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_64 = "));";
  protected final String TEXT_65 = NL + "                    stmtCreate_";
  protected final String TEXT_66 = ".execute(((\"";
  protected final String TEXT_67 = "\").replace(\"{TALEND_DYNAMIC_COLUMN}\",DynamicUtils.getCreateTableSQL(";
  protected final String TEXT_68 = ".";
  protected final String TEXT_69 = ", \"";
  protected final String TEXT_70 = "\")";
  protected final String TEXT_71 = ".toUpperCase()";
  protected final String TEXT_72 = ")+\")";
  protected final String TEXT_73 = "\"));";
  protected final String TEXT_74 = NL + "                stmtCreate_";
  protected final String TEXT_75 = ".execute(\"";
  protected final String TEXT_76 = ")\");";
  protected final String TEXT_77 = NL + "            stmtCreate_";
  protected final String TEXT_78 = ".close();";
  protected final String TEXT_79 = NL + "            java.sql.Statement stmtCreate_";
  protected final String TEXT_80 = " = conn_";
  protected final String TEXT_81 = ".createStatement();";
  protected final String TEXT_82 = NL + "                              stmtCreate_";
  protected final String TEXT_83 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_84 = "));";
  protected final String TEXT_85 = NL + "                    stmtCreate_";
  protected final String TEXT_86 = ".execute(((\"";
  protected final String TEXT_87 = "\").replace(\"{TALEND_DYNAMIC_COLUMN}\",DynamicUtils.getCreateTableSQL(";
  protected final String TEXT_88 = ".";
  protected final String TEXT_89 = ", \"";
  protected final String TEXT_90 = "\")";
  protected final String TEXT_91 = ".toUpperCase()";
  protected final String TEXT_92 = ")+\")";
  protected final String TEXT_93 = "\"));";
  protected final String TEXT_94 = NL + "                stmtCreate_";
  protected final String TEXT_95 = ".execute(\"";
  protected final String TEXT_96 = ")\");";
  protected final String TEXT_97 = NL + "            stmtCreate_";
  protected final String TEXT_98 = ".close();";
  protected final String TEXT_99 = NL;
  protected final String TEXT_100 = NL + "                    String keyCheckTable_";
  protected final String TEXT_101 = " = \"[Informix]\"+\"[\"+";
  protected final String TEXT_102 = "+\"][\"+";
  protected final String TEXT_103 = "+\"][\"+";
  protected final String TEXT_104 = "+\"][\"+";
  protected final String TEXT_105 = "+\"][\"+";
  protected final String TEXT_106 = "+\"]\"+ \"[checktable]\" + \"[\" + ";
  protected final String TEXT_107 = " + \"]\";";
  protected final String TEXT_108 = NL + "                    // [%connection%][checktable][tableName]" + NL + "                    String keyCheckTable_";
  protected final String TEXT_109 = " = conn_";
  protected final String TEXT_110 = " + \"[checktable]\" + \"[\" + ";
  protected final String TEXT_111 = " + \"]\";";
  protected final String TEXT_112 = NL + NL + "                if(GlobalResource.resourceMap.get(keyCheckTable_";
  protected final String TEXT_113 = ")== null){//}" + NL + "" + NL + "                    synchronized (GlobalResource.resourceLockMap.get(keyCheckTable_";
  protected final String TEXT_114 = ")) {//}" + NL + "                        if(GlobalResource.resourceMap.get(keyCheckTable_";
  protected final String TEXT_115 = ")== null){//}";
  protected final String TEXT_116 = NL + "                                java.sql.Statement isExistStmt_";
  protected final String TEXT_117 = " = conn_";
  protected final String TEXT_118 = ".createStatement();" + NL + "                                boolean whetherExist_";
  protected final String TEXT_119 = " = false;" + NL + "                                try {" + NL + "                                    isExistStmt_";
  protected final String TEXT_120 = ".execute(\"SELECT TOP 1 1 FROM [\" +  tableName_";
  protected final String TEXT_121 = " + \"]\" );" + NL + "                                    whetherExist_";
  protected final String TEXT_122 = " = true;" + NL + "                                } catch (java.lang.Exception e){" + NL + "                                    whetherExist_";
  protected final String TEXT_123 = " = false;" + NL + "                                }" + NL + "                                isExistStmt_";
  protected final String TEXT_124 = ".close();";
  protected final String TEXT_125 = NL + "                                ";
  protected final String TEXT_126 = NL + "                                java.sql.DatabaseMetaData dbMetaData_";
  protected final String TEXT_127 = " = conn_";
  protected final String TEXT_128 = ".getMetaData();" + NL + "                                if(tableNameForSearch_";
  protected final String TEXT_129 = ".indexOf(\"\\\"\")==-1){" + NL + "                                    tableNameForSearch_";
  protected final String TEXT_130 = " = tableNameForSearch_";
  protected final String TEXT_131 = ".toUpperCase();" + NL + "                                }else{" + NL + "                                    tableNameForSearch_";
  protected final String TEXT_132 = " = tableNameForSearch_";
  protected final String TEXT_133 = ".replaceAll(\"\\\"\",\"\");" + NL + "                                }" + NL + "                                java.sql.ResultSet rsTable_";
  protected final String TEXT_134 = " = dbMetaData_";
  protected final String TEXT_135 = ".getTables(null, dbschemaForSearch_";
  protected final String TEXT_136 = ", tableNameForSearch_";
  protected final String TEXT_137 = ", new String[]{\"TABLE\"});" + NL + "                                boolean whetherExist_";
  protected final String TEXT_138 = " = false;" + NL + "                                if(rsTable_";
  protected final String TEXT_139 = ".next()) {" + NL + "                                    whetherExist_";
  protected final String TEXT_140 = " = true;" + NL + "                                }" + NL + "                                rsTable_";
  protected final String TEXT_141 = ".close();" + NL;
  protected final String TEXT_142 = NL + "                                java.sql.DatabaseMetaData dbMetaData_";
  protected final String TEXT_143 = " = conn_";
  protected final String TEXT_144 = ".getMetaData();" + NL + "                                java.sql.ResultSet rsTable_";
  protected final String TEXT_145 = " = dbMetaData_";
  protected final String TEXT_146 = ".getTables(null, null, null, new String[]{\"TABLE\"});" + NL + "                                boolean whetherExist_";
  protected final String TEXT_147 = " = false;" + NL + "                                while(rsTable_";
  protected final String TEXT_148 = ".next()) {" + NL + "                                    String table_";
  protected final String TEXT_149 = " = rsTable_";
  protected final String TEXT_150 = ".getString(\"TABLE_NAME\");" + NL + "                                    String schema_";
  protected final String TEXT_151 = " = rsTable_";
  protected final String TEXT_152 = ".getString(\"TABLE_SCHEM\");" + NL + "                                    if(table_";
  protected final String TEXT_153 = ".equals";
  protected final String TEXT_154 = "IgnoreCase";
  protected final String TEXT_155 = "(";
  protected final String TEXT_156 = ")" + NL + "                                        && (schema_";
  protected final String TEXT_157 = ".equals";
  protected final String TEXT_158 = "IgnoreCase";
  protected final String TEXT_159 = "(dbschema_";
  protected final String TEXT_160 = ") || dbschema_";
  protected final String TEXT_161 = ".trim().length() ==0)) {" + NL + "                                        whetherExist_";
  protected final String TEXT_162 = " = true;" + NL + "                                        break;" + NL + "                                    }" + NL + "                                }" + NL + "                                rsTable_";
  protected final String TEXT_163 = ".close();";
  protected final String TEXT_164 = NL + "                                java.sql.DatabaseMetaData dbMetaData_";
  protected final String TEXT_165 = " = conn_";
  protected final String TEXT_166 = ".getMetaData();" + NL + "                                java.sql.ResultSet rsTable_";
  protected final String TEXT_167 = " = dbMetaData_";
  protected final String TEXT_168 = ".getTables(null, null, null, new String[]{\"TABLE\"});" + NL + "                                boolean whetherExist_";
  protected final String TEXT_169 = " = false;" + NL + "                                while(rsTable_";
  protected final String TEXT_170 = ".next()) {" + NL + "                                    String table_";
  protected final String TEXT_171 = " = rsTable_";
  protected final String TEXT_172 = ".getString(\"TABLE_NAME\");" + NL + "                                    String schema_";
  protected final String TEXT_173 = " = rsTable_";
  protected final String TEXT_174 = ".getString(\"TABLE_SCHEM\");" + NL + "                                    if(table_";
  protected final String TEXT_175 = ".equals";
  protected final String TEXT_176 = "IgnoreCase";
  protected final String TEXT_177 = "((";
  protected final String TEXT_178 = ")";
  protected final String TEXT_179 = ".toUpperCase()";
  protected final String TEXT_180 = ")" + NL + "                                        && (schema_";
  protected final String TEXT_181 = ".equals";
  protected final String TEXT_182 = "IgnoreCase";
  protected final String TEXT_183 = "(dbschema_";
  protected final String TEXT_184 = ") || (dbschema_";
  protected final String TEXT_185 = ".trim().length() ==0 && dbUser_";
  protected final String TEXT_186 = ".equalsIgnoreCase(schema_";
  protected final String TEXT_187 = ")))) {" + NL + "                                        whetherExist_";
  protected final String TEXT_188 = " = true;" + NL + "                                        break;" + NL + "                                    }" + NL + "                                }" + NL + "                                rsTable_";
  protected final String TEXT_189 = ".close();";
  protected final String TEXT_190 = NL + "                                java.sql.DatabaseMetaData dbMetaData_";
  protected final String TEXT_191 = " = conn_";
  protected final String TEXT_192 = ".getMetaData();" + NL + "                                java.sql.ResultSet rsTable_";
  protected final String TEXT_193 = " = dbMetaData_";
  protected final String TEXT_194 = ".getTables(null, null, null, new String[]{\"TABLE\"});" + NL + "                                boolean whetherExist_";
  protected final String TEXT_195 = " = false;" + NL + "                                String defaultSchema_";
  protected final String TEXT_196 = " = \"public\";" + NL + "                                if(dbschema_";
  protected final String TEXT_197 = " == null || dbschema_";
  protected final String TEXT_198 = ".trim().length() == 0) {" + NL + "                                    java.sql.Statement stmtSchema_";
  protected final String TEXT_199 = " = conn_";
  protected final String TEXT_200 = ".createStatement();" + NL + "                                    java.sql.ResultSet rsSchema_";
  protected final String TEXT_201 = " = stmtSchema_";
  protected final String TEXT_202 = ".executeQuery(\"select current_schema() \");" + NL + "                                    while(rsSchema_";
  protected final String TEXT_203 = ".next()){" + NL + "                                        defaultSchema_";
  protected final String TEXT_204 = " = rsSchema_";
  protected final String TEXT_205 = ".getString(\"current_schema\");" + NL + "                                    }" + NL + "                                    rsSchema_";
  protected final String TEXT_206 = ".close();" + NL + "                                    stmtSchema_";
  protected final String TEXT_207 = ".close();" + NL + "                                }" + NL + "                                while(rsTable_";
  protected final String TEXT_208 = ".next()) {" + NL + "                                    String table_";
  protected final String TEXT_209 = " = rsTable_";
  protected final String TEXT_210 = ".getString(\"TABLE_NAME\");" + NL + "                                    String schema_";
  protected final String TEXT_211 = " = rsTable_";
  protected final String TEXT_212 = ".getString(\"TABLE_SCHEM\");" + NL + "                                    if(table_";
  protected final String TEXT_213 = ".equals";
  protected final String TEXT_214 = "IgnoreCase";
  protected final String TEXT_215 = "(";
  protected final String TEXT_216 = ")" + NL + "                                        && (schema_";
  protected final String TEXT_217 = ".equals";
  protected final String TEXT_218 = "IgnoreCase";
  protected final String TEXT_219 = "(dbschema_";
  protected final String TEXT_220 = ") || ((dbschema_";
  protected final String TEXT_221 = " ==null || dbschema_";
  protected final String TEXT_222 = ".trim().length() ==0) && defaultSchema_";
  protected final String TEXT_223 = ".equals";
  protected final String TEXT_224 = "IgnoreCase";
  protected final String TEXT_225 = "(schema_";
  protected final String TEXT_226 = ")))) {" + NL + "                                        whetherExist_";
  protected final String TEXT_227 = " = true;" + NL + "                                        break;" + NL + "                                    }" + NL + "                                }" + NL + "                                rsTable_";
  protected final String TEXT_228 = ".close();";
  protected final String TEXT_229 = NL + "\t\t\t\t            \tString tableForSearch_";
  protected final String TEXT_230 = " = ";
  protected final String TEXT_231 = ";" + NL + "\t\t\t\t            \tif(tableForSearch_";
  protected final String TEXT_232 = " != null){" + NL + "\t\t\t\t            \t\tif(tableForSearch_";
  protected final String TEXT_233 = ".startsWith(\"\\\"\") && tableForSearch_";
  protected final String TEXT_234 = ".endsWith(\"\\\"\")){" + NL + "\t\t\t\t            \t\t\ttableForSearch_";
  protected final String TEXT_235 = " =  tableForSearch_";
  protected final String TEXT_236 = ".substring(1,tableForSearch_";
  protected final String TEXT_237 = ".length()-1);" + NL + "\t\t\t\t            \t\t}else{" + NL + "\t\t\t\t            \t\t\ttableForSearch_";
  protected final String TEXT_238 = " =  tableForSearch_";
  protected final String TEXT_239 = ".toUpperCase();" + NL + "\t\t\t\t            \t\t}" + NL + "\t\t\t\t            \t}" + NL + "\t\t\t\t                java.sql.DatabaseMetaData dbMetaData_";
  protected final String TEXT_240 = " = conn_";
  protected final String TEXT_241 = ".getMetaData();" + NL + "\t\t\t\t                java.sql.ResultSet rsTable_";
  protected final String TEXT_242 = " = dbMetaData_";
  protected final String TEXT_243 = ".getTables(null, conn_";
  protected final String TEXT_244 = ".getSchema(), tableForSearch_";
  protected final String TEXT_245 = ", new String[]{\"TABLE\"});" + NL + "\t\t\t\t                boolean whetherExist_";
  protected final String TEXT_246 = " = false;" + NL + "\t\t\t\t               \tif(rsTable_";
  protected final String TEXT_247 = ".next()) {" + NL + "\t\t\t\t\t\t\t\t\twhetherExist_";
  protected final String TEXT_248 = " = true;" + NL + "\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t                rsTable_";
  protected final String TEXT_249 = ".close();" + NL + "\t\t\t\t            ";
  protected final String TEXT_250 = NL + "\t\t\t\t                java.sql.DatabaseMetaData dbMetaData_";
  protected final String TEXT_251 = " = conn_";
  protected final String TEXT_252 = ".getMetaData();" + NL + "                                java.sql.ResultSet rsTable_";
  protected final String TEXT_253 = " = dbMetaData_";
  protected final String TEXT_254 = ".getTables(null, schemaForSearch_";
  protected final String TEXT_255 = ", null, new String[]{\"TABLE\"});" + NL + "                                boolean whetherExist_";
  protected final String TEXT_256 = " = false;" + NL + "                                while(rsTable_";
  protected final String TEXT_257 = ".next()) {" + NL + "                                    if(rsTable_";
  protected final String TEXT_258 = ".getString(\"TABLE_NAME\").equalsIgnoreCase(tableForSearch_";
  protected final String TEXT_259 = ")) {" + NL + "                                        whetherExist_";
  protected final String TEXT_260 = " = true;" + NL + "                                        break;" + NL + "                                    }" + NL + "                                }" + NL + "                                rsTable_";
  protected final String TEXT_261 = ".close();";
  protected final String TEXT_262 = NL + "                                java.sql.DatabaseMetaData dbMetaData_";
  protected final String TEXT_263 = " = conn_";
  protected final String TEXT_264 = ".getMetaData();" + NL + "                                java.sql.ResultSet rsTable_";
  protected final String TEXT_265 = " = dbMetaData_";
  protected final String TEXT_266 = ".getTables(null, null, null, new String[]{\"TABLE\"});" + NL + "                                boolean whetherExist_";
  protected final String TEXT_267 = " = false;" + NL + "                                while(rsTable_";
  protected final String TEXT_268 = ".next()) {" + NL + "                                    String table_";
  protected final String TEXT_269 = " = rsTable_";
  protected final String TEXT_270 = ".getString(\"TABLE_NAME\");" + NL + "                                    if(table_";
  protected final String TEXT_271 = ".equalsIgnoreCase(";
  protected final String TEXT_272 = ")) {" + NL + "                                        whetherExist_";
  protected final String TEXT_273 = " = true;" + NL + "                                        break;" + NL + "                                    }" + NL + "                                }" + NL + "                                rsTable_";
  protected final String TEXT_274 = ".close();";
  protected final String TEXT_275 = NL + "                                if(!whetherExist_";
  protected final String TEXT_276 = ") {" + NL + "                                    java.sql.Statement stmtCreate_";
  protected final String TEXT_277 = " = conn_";
  protected final String TEXT_278 = ".createStatement();";
  protected final String TEXT_279 = NL + "                                                      stmtCreate_";
  protected final String TEXT_280 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_281 = "));";
  protected final String TEXT_282 = NL + "                                            stmtCreate_";
  protected final String TEXT_283 = ".execute(((\"";
  protected final String TEXT_284 = "\").replace(\"{TALEND_DYNAMIC_COLUMN}\",DynamicUtils.getCreateTableSQL(";
  protected final String TEXT_285 = ".";
  protected final String TEXT_286 = ", \"";
  protected final String TEXT_287 = "\")";
  protected final String TEXT_288 = ".toUpperCase()";
  protected final String TEXT_289 = ")+\")";
  protected final String TEXT_290 = "\"));";
  protected final String TEXT_291 = NL + "                                        stmtCreate_";
  protected final String TEXT_292 = ".execute(\"";
  protected final String TEXT_293 = ")\");";
  protected final String TEXT_294 = NL + "                                    stmtCreate_";
  protected final String TEXT_295 = ".close();" + NL + "                                }";
  protected final String TEXT_296 = NL + "                                if(whetherExist_";
  protected final String TEXT_297 = ") {" + NL + "                                    java.sql.Statement stmtDrop_";
  protected final String TEXT_298 = " = conn_";
  protected final String TEXT_299 = ".createStatement();";
  protected final String TEXT_300 = NL + "                                                      stmtDrop_";
  protected final String TEXT_301 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_302 = "));";
  protected final String TEXT_303 = NL + "                                    stmtDrop_";
  protected final String TEXT_304 = ".execute(\"";
  protected final String TEXT_305 = "\" ";
  protected final String TEXT_306 = ");";
  protected final String TEXT_307 = NL + "                                    stmtDrop_";
  protected final String TEXT_308 = ".close();" + NL + "                                }" + NL + "                                java.sql.Statement stmtCreate_";
  protected final String TEXT_309 = " = conn_";
  protected final String TEXT_310 = ".createStatement();";
  protected final String TEXT_311 = NL + "                                                  stmtCreate_";
  protected final String TEXT_312 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_313 = "));";
  protected final String TEXT_314 = NL + "                                        stmtCreate_";
  protected final String TEXT_315 = ".execute(((\"";
  protected final String TEXT_316 = "\").replace(\"{TALEND_DYNAMIC_COLUMN}\",DynamicUtils.getCreateTableSQL(";
  protected final String TEXT_317 = ".";
  protected final String TEXT_318 = ", \"";
  protected final String TEXT_319 = "\")";
  protected final String TEXT_320 = ".toUpperCase()";
  protected final String TEXT_321 = ")+\")";
  protected final String TEXT_322 = "\"));";
  protected final String TEXT_323 = NL + "                                    stmtCreate_";
  protected final String TEXT_324 = ".execute(\"";
  protected final String TEXT_325 = ")\");";
  protected final String TEXT_326 = NL + "                                stmtCreate_";
  protected final String TEXT_327 = ".close();";
  protected final String TEXT_328 = NL + "                            GlobalResource.resourceMap.put(keyCheckTable_";
  protected final String TEXT_329 = ", true);" + NL + "            //{{{" + NL + "                        } // end of if" + NL + "                    } // end synchronized" + NL + "                }";
  protected final String TEXT_330 = NL + "            java.sql.Statement stmtClear_";
  protected final String TEXT_331 = " = conn_";
  protected final String TEXT_332 = ".createStatement();";
  protected final String TEXT_333 = NL + "                              stmtClear_";
  protected final String TEXT_334 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_335 = "));";
  protected final String TEXT_336 = NL + "            stmtClear_";
  protected final String TEXT_337 = ".executeUpdate(\"";
  protected final String TEXT_338 = "\");";
  protected final String TEXT_339 = NL + "            stmtClear_";
  protected final String TEXT_340 = ".close();";
  protected final String TEXT_341 = NL + "            java.sql.Statement stmtTruncCount_";
  protected final String TEXT_342 = " = conn_";
  protected final String TEXT_343 = ".createStatement();";
  protected final String TEXT_344 = NL + "                              stmtTruncCount_";
  protected final String TEXT_345 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_346 = "));";
  protected final String TEXT_347 = NL + "            java.sql.ResultSet rsTruncCount_";
  protected final String TEXT_348 = " = stmtTruncCount_";
  protected final String TEXT_349 = ".executeQuery(\"";
  protected final String TEXT_350 = "\");" + NL + "            int rsTruncCountNumber_";
  protected final String TEXT_351 = " = 0;" + NL + "            if(rsTruncCount_";
  protected final String TEXT_352 = ".next()) {" + NL + "                rsTruncCountNumber_";
  protected final String TEXT_353 = " = rsTruncCount_";
  protected final String TEXT_354 = ".getInt(1);" + NL + "            }" + NL + "            rsTruncCount_";
  protected final String TEXT_355 = ".close();" + NL + "            stmtTruncCount_";
  protected final String TEXT_356 = ".close();" + NL + "            java.sql.Statement stmtTrunc_";
  protected final String TEXT_357 = " = conn_";
  protected final String TEXT_358 = ".createStatement();";
  protected final String TEXT_359 = NL + "                              stmtTrunc_";
  protected final String TEXT_360 = ".setQueryTimeout(Integer.valueOf(";
  protected final String TEXT_361 = "));";
  protected final String TEXT_362 = NL + "                conn_";
  protected final String TEXT_363 = ".commit();";
  protected final String TEXT_364 = NL + "            stmtTrunc_";
  protected final String TEXT_365 = ".executeUpdate(\"";
  protected final String TEXT_366 = "\");";
  protected final String TEXT_367 = NL + "                if(!conn_";
  protected final String TEXT_368 = ".getAutoCommit()){" + NL + "                    conn_";
  protected final String TEXT_369 = ".commit();" + NL + "                }";
  protected final String TEXT_370 = NL + "            deletedCount_";
  protected final String TEXT_371 = " += rsTruncCountNumber_";
  protected final String TEXT_372 = ";" + NL + "            stmtTrunc_";
  protected final String TEXT_373 = ".close();";
  protected final String TEXT_374 = NL + "            java.sql.Statement stmtTruncCount_";
  protected final String TEXT_375 = " = conn_";
  protected final String TEXT_376 = ".createStatement();" + NL + "            java.sql.ResultSet rsTruncCount_";
  protected final String TEXT_377 = " = stmtTruncCount_";
  protected final String TEXT_378 = ".executeQuery(\"";
  protected final String TEXT_379 = "\");" + NL + "            java.sql.Statement stmtTrunc_";
  protected final String TEXT_380 = " = conn_";
  protected final String TEXT_381 = ".createStatement();";
  protected final String TEXT_382 = NL + "                conn_";
  protected final String TEXT_383 = ".commit();";
  protected final String TEXT_384 = NL + "            stmtTrunc_";
  protected final String TEXT_385 = ".executeUpdate(\"";
  protected final String TEXT_386 = "\");";
  protected final String TEXT_387 = NL + "            while(rsTruncCount_";
  protected final String TEXT_388 = ".next()) {" + NL + "                deletedCount_";
  protected final String TEXT_389 = " += rsTruncCount_";
  protected final String TEXT_390 = ".getInt(1);" + NL + "            }" + NL + "            rsTruncCount_";
  protected final String TEXT_391 = ".close();" + NL + "            stmtTruncCount_";
  protected final String TEXT_392 = ".close();" + NL + "            stmtTrunc_";
  protected final String TEXT_393 = ".close();";
  protected final String TEXT_394 = NL + "\t\t\tStringBuffer duplidateClause_";
  protected final String TEXT_395 = " = new StringBuffer(\" ON DUPLICATE KEY UPDATE \");" + NL + "\t\t\t\t";
  protected final String TEXT_396 = NL + "\t\t\t\t\t\tduplidateClause_";
  protected final String TEXT_397 = ".append(\",\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_398 = NL + "\t\t\t\t\t\tduplidateClause_";
  protected final String TEXT_399 = ".append (\"`\" +  ";
  protected final String TEXT_400 = " + \"`\");" + NL + "\t\t\t\t\t\tduplidateClause_";
  protected final String TEXT_401 = ".append (\"=\");" + NL + "\t\t\t\t\t\tduplidateClause_";
  protected final String TEXT_402 = ".append (";
  protected final String TEXT_403 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_404 = NL;
  protected final String TEXT_405 = NL + "\t\t\t\t\t\tString insert_";
  protected final String TEXT_406 = " = \"INSERT INTO `\" + tableName_";
  protected final String TEXT_407 = " + \"` (";
  protected final String TEXT_408 = ", \"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_409 = ".";
  protected final String TEXT_410 = ", \"";
  protected final String TEXT_411 = "\")+\") VALUES (";
  protected final String TEXT_412 = ", \"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_413 = ".";
  protected final String TEXT_414 = ")+\")\";";
  protected final String TEXT_415 = NL + "\t\t\t\t\t\tString insert_";
  protected final String TEXT_416 = " = \"INSERT INTO `\" + tableName_";
  protected final String TEXT_417 = " + \"` (\"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_418 = ".";
  protected final String TEXT_419 = ", \"";
  protected final String TEXT_420 = "\")+\") VALUES (\"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_421 = ".";
  protected final String TEXT_422 = ")+\")\";";
  protected final String TEXT_423 = NL + "\t\t\t\tinsert_";
  protected final String TEXT_424 = " += \tduplidateClause_";
  protected final String TEXT_425 = ".toString();";
  protected final String TEXT_426 = NL + "\t\t\t\t";
  protected final String TEXT_427 = "\t" + NL + "    StringBuffer insertStringBuffer_";
  protected final String TEXT_428 = " = new StringBuffer(insert_";
  protected final String TEXT_429 = ");" + NL + "    insertStringBuffer_";
  protected final String TEXT_430 = ".insert(insert_";
  protected final String TEXT_431 = ".indexOf(\"INSERT\")+ \"INSERT\".length() + 1 , ";
  protected final String TEXT_432 = " + \" \");" + NL + "    insert_";
  protected final String TEXT_433 = " =insertStringBuffer_";
  protected final String TEXT_434 = ".toString(); ";
  protected final String TEXT_435 = "    " + NL + "" + NL + "                pstmt_";
  protected final String TEXT_436 = " = conn_";
  protected final String TEXT_437 = ".prepareStatement(insert_";
  protected final String TEXT_438 = ");" + NL;
  protected final String TEXT_439 = NL + "\t            ////////////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "" + NL + "\t            StringBuilder extendInsertValueStmt_";
  protected final String TEXT_440 = " = new StringBuilder();" + NL + "                for(int i=0;i < ";
  protected final String TEXT_441 = ";i++){";
  protected final String TEXT_442 = NL + "                    extendInsertValueStmt_";
  protected final String TEXT_443 = ".append(\"(";
  protected final String TEXT_444 = ",\"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_445 = ".";
  protected final String TEXT_446 = ")+\")\");";
  protected final String TEXT_447 = NL + "\t\t\t\t    extendInsertValueStmt_";
  protected final String TEXT_448 = ".append(\"(";
  protected final String TEXT_449 = ")\");";
  protected final String TEXT_450 = NL + "                if (i!=";
  protected final String TEXT_451 = "-1) extendInsertValueStmt_";
  protected final String TEXT_452 = ".append(\",\");" + NL + "                }";
  protected final String TEXT_453 = NL + "\t\t\t\t\t\tinsert_";
  protected final String TEXT_454 = " = \"INSERT INTO `\" + ";
  protected final String TEXT_455 = " + \"` (";
  protected final String TEXT_456 = ", \"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_457 = ".";
  protected final String TEXT_458 = ", \"";
  protected final String TEXT_459 = "\")+\") VALUES \" + extendInsertValueStmt_";
  protected final String TEXT_460 = ".toString();";
  protected final String TEXT_461 = NL + "\t\t\t\t\t\tinsert_";
  protected final String TEXT_462 = " = \"INSERT INTO `\" + ";
  protected final String TEXT_463 = " + \"` (\"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_464 = ".";
  protected final String TEXT_465 = ", \"";
  protected final String TEXT_466 = "\")+\") VALUES \" + extendInsertValueStmt_";
  protected final String TEXT_467 = ".toString();";
  protected final String TEXT_468 = NL + "\t\t\t\t    insert_";
  protected final String TEXT_469 = " += \tduplidateClause_";
  protected final String TEXT_470 = ".toString();";
  protected final String TEXT_471 = NL + "\t\t\t\t\t";
  protected final String TEXT_472 = "\t" + NL + "    StringBuffer insertStringBuffer_";
  protected final String TEXT_473 = " = new StringBuffer(insert_";
  protected final String TEXT_474 = ");" + NL + "    insertStringBuffer_";
  protected final String TEXT_475 = ".insert(insert_";
  protected final String TEXT_476 = ".indexOf(\"INSERT\")+ \"INSERT\".length() + 1 , ";
  protected final String TEXT_477 = " + \" \");" + NL + "    insert_";
  protected final String TEXT_478 = " =insertStringBuffer_";
  protected final String TEXT_479 = ".toString(); ";
  protected final String TEXT_480 = "    " + NL + "\t\t\t\t    pstmt_";
  protected final String TEXT_481 = " =  conn_";
  protected final String TEXT_482 = ".prepareStatement(insert_";
  protected final String TEXT_483 = ");";
  protected final String TEXT_484 = NL + NL + "\t\t\t\t    insertColName";
  protected final String TEXT_485 = " = \"";
  protected final String TEXT_486 = ", \"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_487 = ".";
  protected final String TEXT_488 = ", \"";
  protected final String TEXT_489 = "\");" + NL + "\t\t\t\t    insertColValue";
  protected final String TEXT_490 = " =  \"";
  protected final String TEXT_491 = ", \"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_492 = ".";
  protected final String TEXT_493 = ");";
  protected final String TEXT_494 = NL + "\t      \t\t\tinsertColName";
  protected final String TEXT_495 = " = DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_496 = ".";
  protected final String TEXT_497 = ", \"";
  protected final String TEXT_498 = "\");" + NL + "\t\t\t\t    insertColValue";
  protected final String TEXT_499 = " =  DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_500 = ".";
  protected final String TEXT_501 = ");";
  protected final String TEXT_502 = NL + "\t\t\t    rowCount";
  protected final String TEXT_503 = " = 0;";
  protected final String TEXT_504 = NL + "\t            int rowCount";
  protected final String TEXT_505 = " = 0;";
  protected final String TEXT_506 = NL + "\t\t\t\t\t\tString insert_";
  protected final String TEXT_507 = " = \"INSERT INTO `\" + ";
  protected final String TEXT_508 = " + \"` (";
  protected final String TEXT_509 = ", \"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_510 = ".";
  protected final String TEXT_511 = ", \"";
  protected final String TEXT_512 = "\")+\") VALUES (";
  protected final String TEXT_513 = ", \"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_514 = ".";
  protected final String TEXT_515 = ")+\")\";";
  protected final String TEXT_516 = NL + "\t\t\t\t\t\tString insert_";
  protected final String TEXT_517 = " = \"INSERT INTO `\" + ";
  protected final String TEXT_518 = " + \"` (\"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_519 = ".";
  protected final String TEXT_520 = ", \"";
  protected final String TEXT_521 = "\")+\") VALUES (\"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_522 = ".";
  protected final String TEXT_523 = ")+\")\";";
  protected final String TEXT_524 = NL + "\t\t\t\t\t    insert_";
  protected final String TEXT_525 = " += \tduplidateClause_";
  protected final String TEXT_526 = ".toString();";
  protected final String TEXT_527 = NL + "\t\t\t\t\t    batchSize_";
  protected final String TEXT_528 = " = ";
  protected final String TEXT_529 = ";" + NL + "\t\t   \t\t\t    batchSizeCounter_";
  protected final String TEXT_530 = "=0;";
  protected final String TEXT_531 = NL + "\t\t\t\t\t    int batchSize_";
  protected final String TEXT_532 = " = ";
  protected final String TEXT_533 = ";" + NL + "\t\t   \t\t\t    int batchSizeCounter_";
  protected final String TEXT_534 = "=0;";
  protected final String TEXT_535 = NL + "\t\t        ";
  protected final String TEXT_536 = "\t" + NL + "    StringBuffer insertStringBuffer_";
  protected final String TEXT_537 = " = new StringBuffer(insert_";
  protected final String TEXT_538 = ");" + NL + "    insertStringBuffer_";
  protected final String TEXT_539 = ".insert(insert_";
  protected final String TEXT_540 = ".indexOf(\"INSERT\")+ \"INSERT\".length() + 1 , ";
  protected final String TEXT_541 = " + \" \");" + NL + "    insert_";
  protected final String TEXT_542 = " =insertStringBuffer_";
  protected final String TEXT_543 = ".toString(); ";
  protected final String TEXT_544 = "    " + NL + "\t\t        pstmt_";
  protected final String TEXT_545 = " = conn_";
  protected final String TEXT_546 = ".prepareStatement(insert_";
  protected final String TEXT_547 = ");" + NL + NL;
  protected final String TEXT_548 = NL + "\t\t\t\tString update_";
  protected final String TEXT_549 = " = \"UPDATE `\" + tableName_";
  protected final String TEXT_550 = " + \"` SET ";
  protected final String TEXT_551 = ", \"+DynamicUtils.getUpdateSet(";
  protected final String TEXT_552 = ".";
  protected final String TEXT_553 = ", \"";
  protected final String TEXT_554 = "\")+\" WHERE ";
  protected final String TEXT_555 = "\";";
  protected final String TEXT_556 = NL + "\t\t\t\tString update_";
  protected final String TEXT_557 = " = \"UPDATE `\" + tableName_";
  protected final String TEXT_558 = " + \"` SET \"+DynamicUtils.getUpdateSet(";
  protected final String TEXT_559 = ".";
  protected final String TEXT_560 = ", \"";
  protected final String TEXT_561 = "\")+\" WHERE ";
  protected final String TEXT_562 = "\";";
  protected final String TEXT_563 = NL + "\t    ";
  protected final String TEXT_564 = NL + "\t    StringBuffer updateStringBuffer_";
  protected final String TEXT_565 = " = new StringBuffer(update_";
  protected final String TEXT_566 = ");" + NL + "\t    updateStringBuffer_";
  protected final String TEXT_567 = ".insert(update_";
  protected final String TEXT_568 = ".indexOf(\"UPDATE\")+ \"UPDATE\".length() +1 , ";
  protected final String TEXT_569 = "  + \" \");" + NL + "\t    update_";
  protected final String TEXT_570 = " =updateStringBuffer_";
  protected final String TEXT_571 = ".toString(); ";
  protected final String TEXT_572 = NL + "\t    pstmt_";
  protected final String TEXT_573 = " = conn_";
  protected final String TEXT_574 = ".prepareStatement(update_";
  protected final String TEXT_575 = ");" + NL + "\t    ";
  protected final String TEXT_576 = NL + "\t\t\t\t\tString insert_";
  protected final String TEXT_577 = " = \"INSERT INTO `\" + tableName_";
  protected final String TEXT_578 = " + \"` (";
  protected final String TEXT_579 = ", \"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_580 = ".";
  protected final String TEXT_581 = ", \"";
  protected final String TEXT_582 = "\")+\") VALUES (";
  protected final String TEXT_583 = ", \"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_584 = ".";
  protected final String TEXT_585 = ")+\")\";";
  protected final String TEXT_586 = NL + "\t\t\t\t\tString insert_";
  protected final String TEXT_587 = " = \"INSERT INTO `\" + tableName_";
  protected final String TEXT_588 = " + \"` (\"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_589 = ".";
  protected final String TEXT_590 = ", \"";
  protected final String TEXT_591 = "\")+\") VALUES (\"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_592 = ".";
  protected final String TEXT_593 = ")+\")\";";
  protected final String TEXT_594 = NL + "\t\t\t\t\tString update_";
  protected final String TEXT_595 = " = \"UPDATE `\" + tableName_";
  protected final String TEXT_596 = " + \"` SET ";
  protected final String TEXT_597 = ", \"+DynamicUtils.getUpdateSet(";
  protected final String TEXT_598 = ".";
  protected final String TEXT_599 = ", \"";
  protected final String TEXT_600 = "\")+\" WHERE ";
  protected final String TEXT_601 = "\";";
  protected final String TEXT_602 = NL + "\t\t\t\t\tString update_";
  protected final String TEXT_603 = " = \"UPDATE `\" + tableName_";
  protected final String TEXT_604 = " + \"` SET \"+DynamicUtils.getUpdateSet(";
  protected final String TEXT_605 = ".";
  protected final String TEXT_606 = ", \"";
  protected final String TEXT_607 = "\")+\" WHERE ";
  protected final String TEXT_608 = "\";";
  protected final String TEXT_609 = NL + "\t    pstmt_";
  protected final String TEXT_610 = " = conn_";
  protected final String TEXT_611 = ".prepareStatement(\"SELECT COUNT(1) FROM `\" + ";
  protected final String TEXT_612 = " + \"` WHERE ";
  protected final String TEXT_613 = "\");//String insert_";
  protected final String TEXT_614 = " = \"INSERT INTO `\" + ";
  protected final String TEXT_615 = " + \"` (";
  protected final String TEXT_616 = ") VALUES (";
  protected final String TEXT_617 = ")\";" + NL + "\t    ";
  protected final String TEXT_618 = "\t" + NL + "    StringBuffer insertStringBuffer_";
  protected final String TEXT_619 = " = new StringBuffer(insert_";
  protected final String TEXT_620 = ");" + NL + "    insertStringBuffer_";
  protected final String TEXT_621 = ".insert(insert_";
  protected final String TEXT_622 = ".indexOf(\"INSERT\")+ \"INSERT\".length() + 1 , ";
  protected final String TEXT_623 = " + \" \");" + NL + "    insert_";
  protected final String TEXT_624 = " =insertStringBuffer_";
  protected final String TEXT_625 = ".toString(); ";
  protected final String TEXT_626 = "    " + NL + "\t    pstmtInsert_";
  protected final String TEXT_627 = " = conn_";
  protected final String TEXT_628 = ".prepareStatement(insert_";
  protected final String TEXT_629 = ");" + NL + "\t    ";
  protected final String TEXT_630 = NL + "\t    StringBuffer updateStringBuffer_";
  protected final String TEXT_631 = " = new StringBuffer(update_";
  protected final String TEXT_632 = ");" + NL + "\t    updateStringBuffer_";
  protected final String TEXT_633 = ".insert(update_";
  protected final String TEXT_634 = ".indexOf(\"UPDATE\")+ \"UPDATE\".length() +1 , ";
  protected final String TEXT_635 = "  + \" \");" + NL + "\t    update_";
  protected final String TEXT_636 = " =updateStringBuffer_";
  protected final String TEXT_637 = ".toString(); ";
  protected final String TEXT_638 = NL + "\t    pstmtUpdate_";
  protected final String TEXT_639 = " = conn_";
  protected final String TEXT_640 = ".prepareStatement(update_";
  protected final String TEXT_641 = ");" + NL + "\t    ";
  protected final String TEXT_642 = NL + "\t\t\t\t\tString insert_";
  protected final String TEXT_643 = " = \"INSERT INTO `\" + tableName_";
  protected final String TEXT_644 = " + \"` (";
  protected final String TEXT_645 = ", \"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_646 = ".";
  protected final String TEXT_647 = ", \"";
  protected final String TEXT_648 = "\")+\") VALUES (";
  protected final String TEXT_649 = ", \"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_650 = ".";
  protected final String TEXT_651 = ")+\")\";";
  protected final String TEXT_652 = NL + "\t\t\t\t\tString insert_";
  protected final String TEXT_653 = " = \"INSERT INTO `\" + tableName_";
  protected final String TEXT_654 = " + \"` (\"+DynamicUtils.getInsertIntoStmtColumnsList(";
  protected final String TEXT_655 = ".";
  protected final String TEXT_656 = ", \"";
  protected final String TEXT_657 = "\")+\") VALUES (\"+DynamicUtils.getInsertIntoStmtValuesList(";
  protected final String TEXT_658 = ".";
  protected final String TEXT_659 = ")+\")\";";
  protected final String TEXT_660 = NL + "\t\t\t\t\tString update_";
  protected final String TEXT_661 = " = \"UPDATE `\" + tableName_";
  protected final String TEXT_662 = " + \"` SET ";
  protected final String TEXT_663 = ", \"+DynamicUtils.getUpdateSet(";
  protected final String TEXT_664 = ".";
  protected final String TEXT_665 = ", \"";
  protected final String TEXT_666 = "\")+\" WHERE ";
  protected final String TEXT_667 = "\";";
  protected final String TEXT_668 = NL + "\t\t\t\t\tString update_";
  protected final String TEXT_669 = " = \"UPDATE `\" + tableName_";
  protected final String TEXT_670 = " + \"` SET \"+DynamicUtils.getUpdateSet(";
  protected final String TEXT_671 = ".";
  protected final String TEXT_672 = ", \"";
  protected final String TEXT_673 = "\")+\" WHERE ";
  protected final String TEXT_674 = "\";";
  protected final String TEXT_675 = NL + "\t    ";
  protected final String TEXT_676 = NL + "\t    StringBuffer updateStringBuffer_";
  protected final String TEXT_677 = " = new StringBuffer(update_";
  protected final String TEXT_678 = ");" + NL + "\t    updateStringBuffer_";
  protected final String TEXT_679 = ".insert(update_";
  protected final String TEXT_680 = ".indexOf(\"UPDATE\")+ \"UPDATE\".length() +1 , ";
  protected final String TEXT_681 = "  + \" \");" + NL + "\t    update_";
  protected final String TEXT_682 = " =updateStringBuffer_";
  protected final String TEXT_683 = ".toString(); ";
  protected final String TEXT_684 = NL + "\t    pstmtUpdate_";
  protected final String TEXT_685 = " = conn_";
  protected final String TEXT_686 = ".prepareStatement(update_";
  protected final String TEXT_687 = ");" + NL + "\t    ";
  protected final String TEXT_688 = "\t" + NL + "    StringBuffer insertStringBuffer_";
  protected final String TEXT_689 = " = new StringBuffer(insert_";
  protected final String TEXT_690 = ");" + NL + "    insertStringBuffer_";
  protected final String TEXT_691 = ".insert(insert_";
  protected final String TEXT_692 = ".indexOf(\"INSERT\")+ \"INSERT\".length() + 1 , ";
  protected final String TEXT_693 = " + \" \");" + NL + "    insert_";
  protected final String TEXT_694 = " =insertStringBuffer_";
  protected final String TEXT_695 = ".toString(); ";
  protected final String TEXT_696 = "    " + NL + "\t    pstmtInsert_";
  protected final String TEXT_697 = " = conn_";
  protected final String TEXT_698 = ".prepareStatement(insert_";
  protected final String TEXT_699 = ");" + NL + "\t    ";
  protected final String TEXT_700 = NL + "\t    String delete_";
  protected final String TEXT_701 = " = \"DELETE  FROM `\" + ";
  protected final String TEXT_702 = " + \"` WHERE ";
  protected final String TEXT_703 = "\";" + NL + "\t    ";
  protected final String TEXT_704 = NL + "    StringBuffer deleteStringBuffer_";
  protected final String TEXT_705 = " = new StringBuffer(delete_";
  protected final String TEXT_706 = ");" + NL + "    deleteStringBuffer_";
  protected final String TEXT_707 = ".insert(delete_";
  protected final String TEXT_708 = ".indexOf(\"DELETE\")+ \"DELETE\".length()+1 , ";
  protected final String TEXT_709 = "  + \" \" );" + NL + "    delete_";
  protected final String TEXT_710 = " =deleteStringBuffer_";
  protected final String TEXT_711 = ".toString();  ";
  protected final String TEXT_712 = NL + "\t    pstmt_";
  protected final String TEXT_713 = " = conn_";
  protected final String TEXT_714 = ".prepareStatement(delete_";
  protected final String TEXT_715 = ");" + NL + "\t    ";
  protected final String TEXT_716 = NL + "\t    String replace_";
  protected final String TEXT_717 = " = \"REPLACE INTO `\" + ";
  protected final String TEXT_718 = " + \"` (";
  protected final String TEXT_719 = ") VALUES (";
  protected final String TEXT_720 = ")\";" + NL + "\t    pstmt_";
  protected final String TEXT_721 = " = conn_";
  protected final String TEXT_722 = ".prepareStatement(replace_";
  protected final String TEXT_723 = ");" + NL + "\t    ";
  protected final String TEXT_724 = NL + "\t    String insertIgnore_";
  protected final String TEXT_725 = " = \"INSERT IGNORE INTO `\" + ";
  protected final String TEXT_726 = " + \"` (";
  protected final String TEXT_727 = ") VALUES (";
  protected final String TEXT_728 = ") ON DUPLICATE KEY UPDATE ";
  protected final String TEXT_729 = "\";" + NL + "\t    pstmt_";
  protected final String TEXT_730 = " = conn_";
  protected final String TEXT_731 = ".prepareStatement(insertIgnore_";
  protected final String TEXT_732 = ");" + NL + "\t    ";
  protected final String TEXT_733 = NL + "\t    String insert_";
  protected final String TEXT_734 = " = \"INSERT IGNORE INTO `\" + ";
  protected final String TEXT_735 = " + \"` (";
  protected final String TEXT_736 = ") VALUES (";
  protected final String TEXT_737 = ")\";" + NL + "\t    ";
  protected final String TEXT_738 = "\t" + NL + "    StringBuffer insertStringBuffer_";
  protected final String TEXT_739 = " = new StringBuffer(insert_";
  protected final String TEXT_740 = ");" + NL + "    insertStringBuffer_";
  protected final String TEXT_741 = ".insert(insert_";
  protected final String TEXT_742 = ".indexOf(\"INSERT\")+ \"INSERT\".length() + 1 , ";
  protected final String TEXT_743 = " + \" \");" + NL + "    insert_";
  protected final String TEXT_744 = " =insertStringBuffer_";
  protected final String TEXT_745 = ".toString(); ";
  protected final String TEXT_746 = "    " + NL + "\t    pstmt_";
  protected final String TEXT_747 = " = conn_";
  protected final String TEXT_748 = ".prepareStatement(insert_";
  protected final String TEXT_749 = ");" + NL + "\t    ";
  protected final String TEXT_750 = NL + "       \t";
  protected final String TEXT_751 = NL + "\t\t \tinsertSQLSplits_";
  protected final String TEXT_752 = " = insert_";
  protected final String TEXT_753 = ".split(\"\\\\?\");";
  protected final String TEXT_754 = NL + "\t\t\tupdate_";
  protected final String TEXT_755 = " += \" \";" + NL + "\t    \tupdateSQLSplits_";
  protected final String TEXT_756 = " = update_";
  protected final String TEXT_757 = ".split(\"\\\\?\");";
  protected final String TEXT_758 = NL + "\t\t\tupdate_";
  protected final String TEXT_759 = " += \" \";" + NL + "\t\t\tupdateSQLSplits_";
  protected final String TEXT_760 = " = update_";
  protected final String TEXT_761 = ".split(\"\\\\?\");" + NL + "\t\t\tinsertSQLSplits_";
  protected final String TEXT_762 = " = insert_";
  protected final String TEXT_763 = ".split(\"\\\\?\");";
  protected final String TEXT_764 = NL + "\t\t\tdelete_";
  protected final String TEXT_765 = " += \" \";" + NL + "\t\t   \tdeleteSQLSplits_";
  protected final String TEXT_766 = " = delete_";
  protected final String TEXT_767 = ".split(\"\\\\?\");";
  protected final String TEXT_768 = NL + "\t\t\treplace_";
  protected final String TEXT_769 = " += \" \";" + NL + "\t\t\treplaceSQLSplits_";
  protected final String TEXT_770 = " = replace_";
  protected final String TEXT_771 = ".split(\"\\\\?\");";
  protected final String TEXT_772 = NL + "\t\t\tinsertIgnore_";
  protected final String TEXT_773 = " += \" \";" + NL + "\t\t\tinsertIgnoreSQLSplits_";
  protected final String TEXT_774 = " = insertIgnore_";
  protected final String TEXT_775 = ".split(\"\\\\?\");";
  protected final String TEXT_776 = NL + "\t\t \tinsertSQLSplits_";
  protected final String TEXT_777 = " = insert_";
  protected final String TEXT_778 = ".split(\"\\\\?\");";
  protected final String TEXT_779 = NL + "\t\t}" + NL + "\t";
  protected final String TEXT_780 = NL;
  protected final String TEXT_781 = NL + "                if(";
  protected final String TEXT_782 = ".";
  protected final String TEXT_783 = "==null){";
  protected final String TEXT_784 = NL + "                    ";
  protected final String TEXT_785 = ".setNull(counter";
  protected final String TEXT_786 = ",java.sql.Types.CHAR);";
  protected final String TEXT_787 = NL + "                if(";
  protected final String TEXT_788 = ".";
  protected final String TEXT_789 = "==null){";
  protected final String TEXT_790 = NL + "                    ";
  protected final String TEXT_791 = ".setNull(counter";
  protected final String TEXT_792 = ",java.sql.Types.DATE);";
  protected final String TEXT_793 = NL + "                if(";
  protected final String TEXT_794 = ".";
  protected final String TEXT_795 = "==null){";
  protected final String TEXT_796 = NL + "                    ";
  protected final String TEXT_797 = ".setNull(counter";
  protected final String TEXT_798 = ",java.sql.Types.ARRAY);";
  protected final String TEXT_799 = NL + "                if(";
  protected final String TEXT_800 = ".";
  protected final String TEXT_801 = "==null){";
  protected final String TEXT_802 = NL + "                    ";
  protected final String TEXT_803 = ".setNull(counter";
  protected final String TEXT_804 = ",java.sql.Types.INTEGER);";
  protected final String TEXT_805 = NL + "                if(";
  protected final String TEXT_806 = ".";
  protected final String TEXT_807 = "==null){";
  protected final String TEXT_808 = NL + "                    ";
  protected final String TEXT_809 = ".setNull(counter";
  protected final String TEXT_810 = ",java.sql.Types.VARCHAR);";
  protected final String TEXT_811 = NL + "                if(";
  protected final String TEXT_812 = ".";
  protected final String TEXT_813 = "==null){";
  protected final String TEXT_814 = NL + "                    ";
  protected final String TEXT_815 = ".setNull(counter";
  protected final String TEXT_816 = ",java.sql.Types.OTHER);";
  protected final String TEXT_817 = NL + "                if(";
  protected final String TEXT_818 = ".";
  protected final String TEXT_819 = "==null){";
  protected final String TEXT_820 = NL + "                    ";
  protected final String TEXT_821 = ".setNull(counter";
  protected final String TEXT_822 = ",java.sql.Types.BOOLEAN);";
  protected final String TEXT_823 = NL + "                if(";
  protected final String TEXT_824 = ".";
  protected final String TEXT_825 = "==null){";
  protected final String TEXT_826 = NL + "                    ";
  protected final String TEXT_827 = ".setNull(counter";
  protected final String TEXT_828 = ",java.sql.Types.DOUBLE);";
  protected final String TEXT_829 = NL + "                if(";
  protected final String TEXT_830 = ".";
  protected final String TEXT_831 = "==null){";
  protected final String TEXT_832 = NL + "                    ";
  protected final String TEXT_833 = ".setNull(counter";
  protected final String TEXT_834 = ",java.sql.Types.FLOAT);";
  protected final String TEXT_835 = NL + "                }else{";
  protected final String TEXT_836 = NL + "                    if(";
  protected final String TEXT_837 = ".";
  protected final String TEXT_838 = "==null){";
  protected final String TEXT_839 = NL + "                    if((\"null\").equals(String.valueOf(";
  protected final String TEXT_840 = ".";
  protected final String TEXT_841 = ").toLowerCase())){";
  protected final String TEXT_842 = NL + "                ";
  protected final String TEXT_843 = ".setNull(counter";
  protected final String TEXT_844 = ",java.sql.Types.CHAR);" + NL + "" + NL + "                }else if(";
  protected final String TEXT_845 = ".";
  protected final String TEXT_846 = " == '\\0'){" + NL;
  protected final String TEXT_847 = NL + "                    ";
  protected final String TEXT_848 = ".setString(counter";
  protected final String TEXT_849 = ",\"\");" + NL + "" + NL + "                }else{" + NL;
  protected final String TEXT_850 = NL + "                    ";
  protected final String TEXT_851 = ".setString(counter";
  protected final String TEXT_852 = ",String.valueOf(";
  protected final String TEXT_853 = ".";
  protected final String TEXT_854 = "));" + NL + "                }";
  protected final String TEXT_855 = NL + "                if(";
  protected final String TEXT_856 = ".";
  protected final String TEXT_857 = "!=null){" + NL + "                    // timestamp < min java date value (year 1) || timestamp > max mysql value (year 10000) => set 0000-00-00 as date in MySQL" + NL + "                    date_";
  protected final String TEXT_858 = " = ";
  protected final String TEXT_859 = ".";
  protected final String TEXT_860 = ".getTime();" + NL + "                    if (date_";
  protected final String TEXT_861 = " < year1_";
  protected final String TEXT_862 = " || date_";
  protected final String TEXT_863 = " >= year10000_";
  protected final String TEXT_864 = ") {";
  protected final String TEXT_865 = NL + "                        ";
  protected final String TEXT_866 = ".setString(counter";
  protected final String TEXT_867 = ", \"0000-00-00 00:00:00\");" + NL + "                    } else {";
  protected final String TEXT_868 = NL + "                        ";
  protected final String TEXT_869 = ".setTimestamp(counter";
  protected final String TEXT_870 = ", new java.sql.Timestamp(date_";
  protected final String TEXT_871 = "));" + NL + "                    }" + NL + "                }else{" + NL;
  protected final String TEXT_872 = NL + "                    ";
  protected final String TEXT_873 = ".setNull(counter";
  protected final String TEXT_874 = ",java.sql.Types.DATE);" + NL + "" + NL + "                }";
  protected final String TEXT_875 = NL + "                ";
  protected final String TEXT_876 = ".set";
  protected final String TEXT_877 = "(counter";
  protected final String TEXT_878 = ",";
  protected final String TEXT_879 = ".";
  protected final String TEXT_880 = ");";
  protected final String TEXT_881 = NL + NL + "                }" + NL;
  protected final String TEXT_882 = NL + "\t\tquery_";
  protected final String TEXT_883 = " = new StringBuffer(\"\");";
  protected final String TEXT_884 = NL + "\t\t\t\tcommitEvery_";
  protected final String TEXT_885 = " = buffersSize_";
  protected final String TEXT_886 = ";";
  protected final String TEXT_887 = NL + "\t\t\t\t\tbatchSize_";
  protected final String TEXT_888 = " = buffersSize_";
  protected final String TEXT_889 = ";";
  protected final String TEXT_890 = NL;
  protected final String TEXT_891 = NL + "        whetherReject_";
  protected final String TEXT_892 = " = false;";
  protected final String TEXT_893 = NL + "\t                \tint counter";
  protected final String TEXT_894 = " = rowCount";
  protected final String TEXT_895 = " * ";
  protected final String TEXT_896 = " + 1;" + NL + "\t                ";
  protected final String TEXT_897 = NL + "\t                        counter";
  protected final String TEXT_898 = "++;" + NL + "\t                        ";
  protected final String TEXT_899 = NL + "\t\t\t\t\t\t\tint count_dyn_";
  protected final String TEXT_900 = "=DynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_901 = ".";
  protected final String TEXT_902 = ", pstmt_";
  protected final String TEXT_903 = ", counter";
  protected final String TEXT_904 = "-1, \"";
  protected final String TEXT_905 = "\");" + NL + "\t\t\t\t\t\t\tcounter";
  protected final String TEXT_906 = "+=count_dyn_";
  protected final String TEXT_907 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_908 = NL + NL + "\t                exInsertColValue";
  protected final String TEXT_909 = " = new BufferLine_";
  protected final String TEXT_910 = "(" + NL + "\t                ";
  protected final String TEXT_911 = NL + "\t                            ," + NL + "\t                            ";
  protected final String TEXT_912 = NL + "\t                        ";
  protected final String TEXT_913 = ".";
  protected final String TEXT_914 = NL + "\t                        ";
  protected final String TEXT_915 = NL + "\t\t\t\t\t, ";
  protected final String TEXT_916 = ".";
  protected final String TEXT_917 = NL + "\t\t\t\t";
  protected final String TEXT_918 = NL + "\t                );" + NL + "" + NL + "\t                exInsertColValueList";
  protected final String TEXT_919 = ".add(exInsertColValue";
  protected final String TEXT_920 = ");" + NL + "" + NL + "\t                rowCount";
  protected final String TEXT_921 = "++;";
  protected final String TEXT_922 = NL + "\t\t\t\tnb_line_";
  protected final String TEXT_923 = "++;";
  protected final String TEXT_924 = NL + "\t                if(rowCount";
  protected final String TEXT_925 = " == ";
  protected final String TEXT_926 = "){" + NL + "\t                    insertedCount_";
  protected final String TEXT_927 = " = insertedCount_";
  protected final String TEXT_928 = " + pstmt_";
  protected final String TEXT_929 = ".executeUpdate();" + NL + "\t                    exInsertColValueList";
  protected final String TEXT_930 = ".clear();" + NL + "\t                    rowCount";
  protected final String TEXT_931 = " = 0;" + NL + "\t\t\t    counter";
  protected final String TEXT_932 = "=1;" + NL + "\t                }";
  protected final String TEXT_933 = NL + "\t                        ";
  protected final String TEXT_934 = NL + "\t                        ";
  protected final String TEXT_935 = NL + "\t                            query_";
  protected final String TEXT_936 = " = ";
  protected final String TEXT_937 = ";" + NL + "\t                            ";
  protected final String TEXT_938 = NL + "\t\t\t\t\t\t\troutines.system.DynamicUtils.debugDynamicSql(query_";
  protected final String TEXT_939 = ",";
  protected final String TEXT_940 = ".";
  protected final String TEXT_941 = ", ";
  protected final String TEXT_942 = ",insertSQLSplits_";
  protected final String TEXT_943 = ");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_944 = NL + "\t\t\t\t\t\t\tDynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_945 = ".";
  protected final String TEXT_946 = ", pstmt_";
  protected final String TEXT_947 = ", ";
  protected final String TEXT_948 = ", \"";
  protected final String TEXT_949 = "\");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_950 = NL + "\t                    globalMap.put(\"";
  protected final String TEXT_951 = "_QUERY\", query_";
  protected final String TEXT_952 = ".toString().trim());" + NL + "\t                    ";
  protected final String TEXT_953 = NL + "\t\t\t\t\t";
  protected final String TEXT_954 = NL + "\t\t    \t\tpstmt_";
  protected final String TEXT_955 = ".addBatch();" + NL + "\t\t    \t\tnb_line_";
  protected final String TEXT_956 = "++;" + NL + "" + NL + "\t\t    \t\t\t";
  protected final String TEXT_957 = NL + "\t\t    \t\t  \t";
  protected final String TEXT_958 = NL + "\t\t    \t\t  \t\tbatchSizeCounter_";
  protected final String TEXT_959 = "++;" + NL + "\t\t    \t\t  \t";
  protected final String TEXT_960 = NL + "\t\t    \t\t";
  protected final String TEXT_961 = NL + "\t                try {" + NL + "\t                    nb_line_";
  protected final String TEXT_962 = "++;" + NL + "\t                    insertedCount_";
  protected final String TEXT_963 = " = insertedCount_";
  protected final String TEXT_964 = " + pstmt_";
  protected final String TEXT_965 = ".executeUpdate();" + NL + "\t                    ";
  protected final String TEXT_966 = NL + "\t                } catch(java.lang.Exception e) {" + NL + "\t                    whetherReject_";
  protected final String TEXT_967 = " = true;" + NL + "\t                    ";
  protected final String TEXT_968 = NL + "\t                        throw(e);" + NL + "\t                        ";
  protected final String TEXT_969 = NL + "\t                            ";
  protected final String TEXT_970 = " = new ";
  protected final String TEXT_971 = "Struct();" + NL + "\t                            ";
  protected final String TEXT_972 = NL + "\t                                ";
  protected final String TEXT_973 = ".";
  protected final String TEXT_974 = " = ";
  protected final String TEXT_975 = ".";
  protected final String TEXT_976 = ";" + NL + "\t                            ";
  protected final String TEXT_977 = NL + "\t                            rejectedCount_";
  protected final String TEXT_978 = " =  rejectedCount_";
  protected final String TEXT_979 = "+ 1;" + NL + "\t                            ";
  protected final String TEXT_980 = ".errorCode = ((java.sql.SQLException)e).getSQLState();" + NL + "\t                            ";
  protected final String TEXT_981 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_982 = ";" + NL + "\t                            ";
  protected final String TEXT_983 = NL + "\t                            System.err.print(e.getMessage());" + NL + "\t                            ";
  protected final String TEXT_984 = NL + "\t                }" + NL + "\t\t\t\t";
  protected final String TEXT_985 = NL + "                        ";
  protected final String TEXT_986 = NL + "                            query_";
  protected final String TEXT_987 = " = ";
  protected final String TEXT_988 = ";";
  protected final String TEXT_989 = NL + "\t\t\t\t\troutines.system.DynamicUtils.debugDynamicSql(query_";
  protected final String TEXT_990 = ",";
  protected final String TEXT_991 = ".";
  protected final String TEXT_992 = ", ";
  protected final String TEXT_993 = ",insertSQLSplits_";
  protected final String TEXT_994 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_995 = NL + "\t\t\t\t\t\tDynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_996 = ".";
  protected final String TEXT_997 = ", pstmt_";
  protected final String TEXT_998 = ", ";
  protected final String TEXT_999 = ", \"";
  protected final String TEXT_1000 = "\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_1001 = NL + "                    globalMap.put(\"";
  protected final String TEXT_1002 = "_QUERY\", query_";
  protected final String TEXT_1003 = ".toString().trim());";
  protected final String TEXT_1004 = NL + "                try {" + NL + "                    nb_line_";
  protected final String TEXT_1005 = "++;" + NL + "                    insertedCount_";
  protected final String TEXT_1006 = " = insertedCount_";
  protected final String TEXT_1007 = " + pstmt_";
  protected final String TEXT_1008 = ".executeUpdate();";
  protected final String TEXT_1009 = NL + "                } catch(java.lang.Exception e) {" + NL + "                    whetherReject_";
  protected final String TEXT_1010 = " = true;";
  protected final String TEXT_1011 = NL + "                        throw(e);";
  protected final String TEXT_1012 = NL + "                            ";
  protected final String TEXT_1013 = " = new ";
  protected final String TEXT_1014 = "Struct();";
  protected final String TEXT_1015 = NL + "                                ";
  protected final String TEXT_1016 = ".";
  protected final String TEXT_1017 = " = ";
  protected final String TEXT_1018 = ".";
  protected final String TEXT_1019 = ";";
  protected final String TEXT_1020 = NL + "                            rejectedCount_";
  protected final String TEXT_1021 = " =  rejectedCount_";
  protected final String TEXT_1022 = "+ 1;";
  protected final String TEXT_1023 = NL + "                            ";
  protected final String TEXT_1024 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1025 = NL + "                            ";
  protected final String TEXT_1026 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1027 = ";";
  protected final String TEXT_1028 = NL + "                            System.err.print(e.getMessage());";
  protected final String TEXT_1029 = NL + "                }";
  protected final String TEXT_1030 = NL + "    \t\t\t    ";
  protected final String TEXT_1031 = NL + "    \t\t\t    ";
  protected final String TEXT_1032 = NL + "                        query_";
  protected final String TEXT_1033 = " = ";
  protected final String TEXT_1034 = ";";
  protected final String TEXT_1035 = NL + "\t\t\t\t\t    routines.system.DynamicUtils.debugDynamicSql(query_";
  protected final String TEXT_1036 = ",";
  protected final String TEXT_1037 = ".";
  protected final String TEXT_1038 = ", ";
  protected final String TEXT_1039 = ",updateSQLSplits_";
  protected final String TEXT_1040 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_1041 = NL + NL + "\t\t\t\t\tint count_";
  protected final String TEXT_1042 = "=DynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_1043 = ".";
  protected final String TEXT_1044 = ", pstmt_";
  protected final String TEXT_1045 = ", ";
  protected final String TEXT_1046 = ", \"";
  protected final String TEXT_1047 = "\");" + NL + "\t\t\t\t";
  protected final String TEXT_1048 = NL + NL + "\t\t\t\t\t";
  protected final String TEXT_1049 = NL + "\t\t\t   ";
  protected final String TEXT_1050 = NL + "\t\t\t";
  protected final String TEXT_1051 = NL + "\t\t\t   ";
  protected final String TEXT_1052 = NL + "\t\t\t";
  protected final String TEXT_1053 = NL + "\t\t\t\t\t\t\tquery_";
  protected final String TEXT_1054 = " = ";
  protected final String TEXT_1055 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1056 = NL + "\t\t\t\t\t\t\tquery_";
  protected final String TEXT_1057 = " = ";
  protected final String TEXT_1058 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1059 = NL + "    \t\t\t    ";
  protected final String TEXT_1060 = NL + "    \t\t\t    ";
  protected final String TEXT_1061 = NL + "\t\t\t\t\t   query_";
  protected final String TEXT_1062 = " = ";
  protected final String TEXT_1063 = ";" + NL + "\t\t\t\t    ";
  protected final String TEXT_1064 = NL + "\t\t\t\t\t   query_";
  protected final String TEXT_1065 = " = ";
  protected final String TEXT_1066 = ";" + NL + "\t\t\t\t    ";
  protected final String TEXT_1067 = NL + "                globalMap.put(\"";
  protected final String TEXT_1068 = "_QUERY\", query_";
  protected final String TEXT_1069 = ".toString().trim());";
  protected final String TEXT_1070 = NL + NL + "    \t\t";
  protected final String TEXT_1071 = NL + "        \t\tpstmt_";
  protected final String TEXT_1072 = ".addBatch();" + NL + "        \t\tnb_line_";
  protected final String TEXT_1073 = "++;" + NL + "    \t\t  \t";
  protected final String TEXT_1074 = NL + "    \t\t  \t\tbatchSizeCounter_";
  protected final String TEXT_1075 = "++;" + NL + "    \t\t";
  protected final String TEXT_1076 = NL + "            try {" + NL + "                nb_line_";
  protected final String TEXT_1077 = "++;" + NL + "                updatedCount_";
  protected final String TEXT_1078 = " = updatedCount_";
  protected final String TEXT_1079 = " + pstmt_";
  protected final String TEXT_1080 = ".executeUpdate();";
  protected final String TEXT_1081 = NL + "            } catch(java.lang.Exception e) {" + NL + "                whetherReject_";
  protected final String TEXT_1082 = " = true;";
  protected final String TEXT_1083 = NL + "                    throw(e);";
  protected final String TEXT_1084 = NL + "                        ";
  protected final String TEXT_1085 = " = new ";
  protected final String TEXT_1086 = "Struct();";
  protected final String TEXT_1087 = NL + "                            ";
  protected final String TEXT_1088 = ".";
  protected final String TEXT_1089 = " = ";
  protected final String TEXT_1090 = ".";
  protected final String TEXT_1091 = ";";
  protected final String TEXT_1092 = NL + "                        rejectedCount_";
  protected final String TEXT_1093 = " =  rejectedCount_";
  protected final String TEXT_1094 = "+ 1;";
  protected final String TEXT_1095 = NL + "                        ";
  protected final String TEXT_1096 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1097 = NL + "                        ";
  protected final String TEXT_1098 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1099 = ";";
  protected final String TEXT_1100 = NL + "                        System.err.print(e.getMessage());";
  protected final String TEXT_1101 = NL + "            }";
  protected final String TEXT_1102 = NL + "\t\t\t\t\t";
  protected final String TEXT_1103 = NL + "                    \t";
  protected final String TEXT_1104 = NL + "    \t\t\t    ";
  protected final String TEXT_1105 = NL + "    \t\t\t    ";
  protected final String TEXT_1106 = NL + NL + "    \t\tjava.sql.ResultSet rs_";
  protected final String TEXT_1107 = " = pstmt_";
  protected final String TEXT_1108 = ".executeQuery();" + NL + "    \t\tint checkCount_";
  protected final String TEXT_1109 = " = -1;" + NL + "    \t\twhile(rs_";
  protected final String TEXT_1110 = ".next()) {" + NL + "    \t\t\tcheckCount_";
  protected final String TEXT_1111 = " = rs_";
  protected final String TEXT_1112 = ".getInt(1);" + NL + "    \t\t}" + NL + "    \t\tif(checkCount_";
  protected final String TEXT_1113 = " > 0) {" + NL + "    \t\t\t";
  protected final String TEXT_1114 = NL + "    \t\t\t\t    ";
  protected final String TEXT_1115 = NL + "    \t\t\t\t    ";
  protected final String TEXT_1116 = NL + "                            query_";
  protected final String TEXT_1117 = " = ";
  protected final String TEXT_1118 = ";";
  protected final String TEXT_1119 = NL + "\t\t\t\t\t\t\troutines.system.DynamicUtils.debugDynamicSql(query_";
  protected final String TEXT_1120 = ",";
  protected final String TEXT_1121 = ".";
  protected final String TEXT_1122 = ", ";
  protected final String TEXT_1123 = ",updateSQLSplits_";
  protected final String TEXT_1124 = ");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1125 = NL + NL + "\t\t\t\t\t\tint count_";
  protected final String TEXT_1126 = "=DynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_1127 = ".";
  protected final String TEXT_1128 = ", pstmtUpdate_";
  protected final String TEXT_1129 = ", ";
  protected final String TEXT_1130 = ", \"";
  protected final String TEXT_1131 = "\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_1132 = NL + "\t\t\t\t\t";
  protected final String TEXT_1133 = NL + "\t\t\t\t";
  protected final String TEXT_1134 = NL + "\t\t\t\t\t";
  protected final String TEXT_1135 = NL + "\t\t\t\t";
  protected final String TEXT_1136 = NL + "\t\t\t\t\t\t\t\tquery_";
  protected final String TEXT_1137 = " = ";
  protected final String TEXT_1138 = ";" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_1139 = NL + "\t\t\t\t\t\t\t\tquery_";
  protected final String TEXT_1140 = " = ";
  protected final String TEXT_1141 = ";" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_1142 = NL + "    \t\t\t\t    ";
  protected final String TEXT_1143 = NL + "    \t\t\t\t    ";
  protected final String TEXT_1144 = NL + "\t\t\t\t\t\t\tquery_";
  protected final String TEXT_1145 = " = ";
  protected final String TEXT_1146 = ";" + NL + "\t\t\t\t    \t";
  protected final String TEXT_1147 = NL + "\t\t\t\t\t\t\tquery_";
  protected final String TEXT_1148 = " = ";
  protected final String TEXT_1149 = ";" + NL + "\t\t\t\t    \t";
  protected final String TEXT_1150 = NL + "                    globalMap.put(\"";
  protected final String TEXT_1151 = "_QUERY\", query_";
  protected final String TEXT_1152 = ".toString().trim());";
  protected final String TEXT_1153 = NL + "                try {" + NL + "                    updatedCount_";
  protected final String TEXT_1154 = " = updatedCount_";
  protected final String TEXT_1155 = " + pstmtUpdate_";
  protected final String TEXT_1156 = ".executeUpdate();" + NL + "                    nb_line_";
  protected final String TEXT_1157 = "++;" + NL + "        \t\t\t";
  protected final String TEXT_1158 = NL + "                } catch(java.lang.Exception e) {" + NL + "                    whetherReject_";
  protected final String TEXT_1159 = " = true;";
  protected final String TEXT_1160 = NL + "                        throw(e);";
  protected final String TEXT_1161 = NL + "                    \tnb_line_";
  protected final String TEXT_1162 = "++;" + NL + "                    \t";
  protected final String TEXT_1163 = NL + "                        ";
  protected final String TEXT_1164 = " = new ";
  protected final String TEXT_1165 = "Struct();";
  protected final String TEXT_1166 = NL + "                                ";
  protected final String TEXT_1167 = ".";
  protected final String TEXT_1168 = " = ";
  protected final String TEXT_1169 = ".";
  protected final String TEXT_1170 = ";";
  protected final String TEXT_1171 = NL + "                            rejectedCount_";
  protected final String TEXT_1172 = " =  rejectedCount_";
  protected final String TEXT_1173 = "+ 1;";
  protected final String TEXT_1174 = NL + "                            ";
  protected final String TEXT_1175 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1176 = NL + "                            ";
  protected final String TEXT_1177 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1178 = ";";
  protected final String TEXT_1179 = NL + "                            System.err.print(e.getMessage());";
  protected final String TEXT_1180 = NL + "                }" + NL + "    \t\t} else {" + NL + "    \t\t\t";
  protected final String TEXT_1181 = NL + "    \t\t\t\t    ";
  protected final String TEXT_1182 = NL + "    \t\t\t\t    ";
  protected final String TEXT_1183 = NL + "                            query_";
  protected final String TEXT_1184 = " = ";
  protected final String TEXT_1185 = ";";
  protected final String TEXT_1186 = NL + "\t\t\t\t\t\troutines.system.DynamicUtils.debugDynamicSql(query_";
  protected final String TEXT_1187 = ",";
  protected final String TEXT_1188 = ".";
  protected final String TEXT_1189 = ", ";
  protected final String TEXT_1190 = ",insertSQLSplits_";
  protected final String TEXT_1191 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_1192 = NL + "\t\t\t\t\t\tDynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_1193 = ".";
  protected final String TEXT_1194 = ", pstmtInsert_";
  protected final String TEXT_1195 = ", ";
  protected final String TEXT_1196 = ", \"";
  protected final String TEXT_1197 = "\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_1198 = NL + "                    globalMap.put(\"";
  protected final String TEXT_1199 = "_QUERY\", query_";
  protected final String TEXT_1200 = ".toString().trim());";
  protected final String TEXT_1201 = NL + "                try {" + NL + "                    insertedCount_";
  protected final String TEXT_1202 = " = insertedCount_";
  protected final String TEXT_1203 = " + pstmtInsert_";
  protected final String TEXT_1204 = ".executeUpdate();" + NL + "                    nb_line_";
  protected final String TEXT_1205 = "++;";
  protected final String TEXT_1206 = NL + "                } catch(java.lang.Exception e) {" + NL + "                    whetherReject_";
  protected final String TEXT_1207 = " = true;";
  protected final String TEXT_1208 = NL + "                        throw(e);";
  protected final String TEXT_1209 = NL + "                    \tnb_line_";
  protected final String TEXT_1210 = "++;" + NL + "                    \t";
  protected final String TEXT_1211 = NL + "                        ";
  protected final String TEXT_1212 = " = new ";
  protected final String TEXT_1213 = "Struct();";
  protected final String TEXT_1214 = NL + "                                ";
  protected final String TEXT_1215 = ".";
  protected final String TEXT_1216 = " = ";
  protected final String TEXT_1217 = ".";
  protected final String TEXT_1218 = ";";
  protected final String TEXT_1219 = NL + "                            rejectedCount_";
  protected final String TEXT_1220 = " =  rejectedCount_";
  protected final String TEXT_1221 = "+ 1;";
  protected final String TEXT_1222 = NL + "                            ";
  protected final String TEXT_1223 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1224 = NL + "                            ";
  protected final String TEXT_1225 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1226 = ";";
  protected final String TEXT_1227 = NL + "                            System.err.print(e.getMessage());";
  protected final String TEXT_1228 = NL + "                }" + NL + "    \t\t}" + NL + "    \t\t";
  protected final String TEXT_1229 = NL + "    \t    int updateFlag_";
  protected final String TEXT_1230 = "=0;" + NL + "    \t    ";
  protected final String TEXT_1231 = NL + "    \t\t\t    ";
  protected final String TEXT_1232 = NL + "    \t\t\t    ";
  protected final String TEXT_1233 = NL + "                        query_";
  protected final String TEXT_1234 = " = ";
  protected final String TEXT_1235 = ";";
  protected final String TEXT_1236 = NL + "\t\t\t\t\t\troutines.system.DynamicUtils.debugDynamicSql(query_";
  protected final String TEXT_1237 = ",";
  protected final String TEXT_1238 = ".";
  protected final String TEXT_1239 = ", ";
  protected final String TEXT_1240 = ",updateSQLSplits_";
  protected final String TEXT_1241 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_1242 = NL + NL + "\t\t\t\t\tint count_";
  protected final String TEXT_1243 = "=DynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_1244 = ".";
  protected final String TEXT_1245 = ", pstmtUpdate_";
  protected final String TEXT_1246 = ", ";
  protected final String TEXT_1247 = ", \"";
  protected final String TEXT_1248 = "\");" + NL + "\t\t\t\t";
  protected final String TEXT_1249 = NL + "\t\t\t\t\t";
  protected final String TEXT_1250 = NL + "    \t\t\t\t\t";
  protected final String TEXT_1251 = NL + "\t\t\t\t\t";
  protected final String TEXT_1252 = NL + "    \t\t\t\t\t";
  protected final String TEXT_1253 = NL + "\t\t\t\t\t";
  protected final String TEXT_1254 = NL + "\t\t\t\t\t\tquery_";
  protected final String TEXT_1255 = " = ";
  protected final String TEXT_1256 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1257 = NL + "\t\t\t\t\t\tquery_";
  protected final String TEXT_1258 = " = ";
  protected final String TEXT_1259 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1260 = NL + NL + "    \t\t\t    ";
  protected final String TEXT_1261 = NL + "    \t\t\t    ";
  protected final String TEXT_1262 = NL + "\t\t\t\t\t\tquery_";
  protected final String TEXT_1263 = " = ";
  protected final String TEXT_1264 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_1265 = NL + "\t\t\t\t\t\tquery_";
  protected final String TEXT_1266 = " = ";
  protected final String TEXT_1267 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_1268 = NL + "                globalMap.put(\"";
  protected final String TEXT_1269 = "_QUERY\", query_";
  protected final String TEXT_1270 = ".toString().trim());";
  protected final String TEXT_1271 = NL + NL + "            try {" + NL + "                updateFlag_";
  protected final String TEXT_1272 = "=pstmtUpdate_";
  protected final String TEXT_1273 = ".executeUpdate();" + NL + "                updatedCount_";
  protected final String TEXT_1274 = " = updatedCount_";
  protected final String TEXT_1275 = "+updateFlag_";
  protected final String TEXT_1276 = ";" + NL + "" + NL + "            if(updateFlag_";
  protected final String TEXT_1277 = " == 0) {" + NL + "" + NL + "            \t";
  protected final String TEXT_1278 = NL + "\t\t\t\tquery_";
  protected final String TEXT_1279 = " = new StringBuffer(\"\");" + NL + "        \t\t";
  protected final String TEXT_1280 = NL + "        \t\t\t    ";
  protected final String TEXT_1281 = NL + "        \t\t\t    ";
  protected final String TEXT_1282 = NL + "                            query_";
  protected final String TEXT_1283 = " = ";
  protected final String TEXT_1284 = ";";
  protected final String TEXT_1285 = NL + "\t\t\t\t\t\t\troutines.system.DynamicUtils.debugDynamicSql(query_";
  protected final String TEXT_1286 = ",";
  protected final String TEXT_1287 = ".";
  protected final String TEXT_1288 = ", ";
  protected final String TEXT_1289 = ",insertSQLSplits_";
  protected final String TEXT_1290 = ");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1291 = NL + "\t\t\t\t\t\tDynamicUtils.writeColumnsToDatabse(";
  protected final String TEXT_1292 = ".";
  protected final String TEXT_1293 = ", pstmtInsert_";
  protected final String TEXT_1294 = ", ";
  protected final String TEXT_1295 = ", \"";
  protected final String TEXT_1296 = "\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_1297 = NL + "                    globalMap.put(\"";
  protected final String TEXT_1298 = "_QUERY\", query_";
  protected final String TEXT_1299 = ".toString().trim());";
  protected final String TEXT_1300 = NL + "                    insertedCount_";
  protected final String TEXT_1301 = " = insertedCount_";
  protected final String TEXT_1302 = " + pstmtInsert_";
  protected final String TEXT_1303 = ".executeUpdate();" + NL + "             \t\tnb_line_";
  protected final String TEXT_1304 = "++;";
  protected final String TEXT_1305 = NL + "    \t\t\t}else{" + NL + "    \t\t\t\tnb_line_";
  protected final String TEXT_1306 = "++;" + NL + "    \t\t\t\t";
  protected final String TEXT_1307 = NL + "    \t\t\t}" + NL + "                } catch(java.lang.Exception e) {" + NL + "                    whetherReject_";
  protected final String TEXT_1308 = " = true;";
  protected final String TEXT_1309 = NL + "                        throw(e);";
  protected final String TEXT_1310 = NL + "                    \tnb_line_";
  protected final String TEXT_1311 = "++;" + NL + "                    \t";
  protected final String TEXT_1312 = NL + "                        ";
  protected final String TEXT_1313 = " = new ";
  protected final String TEXT_1314 = "Struct();";
  protected final String TEXT_1315 = NL + "                                ";
  protected final String TEXT_1316 = ".";
  protected final String TEXT_1317 = " = ";
  protected final String TEXT_1318 = ".";
  protected final String TEXT_1319 = ";";
  protected final String TEXT_1320 = NL + "                            rejectedCount_";
  protected final String TEXT_1321 = " =  rejectedCount_";
  protected final String TEXT_1322 = "+ 1;";
  protected final String TEXT_1323 = NL + "                            ";
  protected final String TEXT_1324 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1325 = NL + "                            ";
  protected final String TEXT_1326 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1327 = ";";
  protected final String TEXT_1328 = NL + "                            System.err.print(e.getMessage());";
  protected final String TEXT_1329 = NL + "                }";
  protected final String TEXT_1330 = NL + "\t\t\t\t\t";
  protected final String TEXT_1331 = NL + "                    \t";
  protected final String TEXT_1332 = NL + "\t                        query_";
  protected final String TEXT_1333 = " = ";
  protected final String TEXT_1334 = ";" + NL + "\t                        ";
  protected final String TEXT_1335 = NL + "    \t\t\t    ";
  protected final String TEXT_1336 = NL + "    \t\t\t    ";
  protected final String TEXT_1337 = NL + "                        query_";
  protected final String TEXT_1338 = " = ";
  protected final String TEXT_1339 = ";";
  protected final String TEXT_1340 = NL + "                globalMap.put(\"";
  protected final String TEXT_1341 = "_QUERY\", query_";
  protected final String TEXT_1342 = ".toString().trim());";
  protected final String TEXT_1343 = NL + "        \t";
  protected final String TEXT_1344 = NL + "        \t\tpstmt_";
  protected final String TEXT_1345 = ".addBatch();" + NL + "    \t\t\tnb_line_";
  protected final String TEXT_1346 = "++;" + NL + "        \t\t";
  protected final String TEXT_1347 = NL + "    \t\t  \t\tbatchSizeCounter_";
  protected final String TEXT_1348 = "++;" + NL + "    \t\t";
  protected final String TEXT_1349 = NL + "            try {" + NL + "        \t    deletedCount_";
  protected final String TEXT_1350 = " = deletedCount_";
  protected final String TEXT_1351 = " + pstmt_";
  protected final String TEXT_1352 = ".executeUpdate();" + NL + "            \tnb_line_";
  protected final String TEXT_1353 = "++;" + NL + "            \t";
  protected final String TEXT_1354 = NL + "            } catch(java.lang.Exception e) {" + NL + "                whetherReject_";
  protected final String TEXT_1355 = " = true;";
  protected final String TEXT_1356 = NL + "                    throw(e);";
  protected final String TEXT_1357 = NL + "                \tnb_line_";
  protected final String TEXT_1358 = "++;" + NL + "                \t";
  protected final String TEXT_1359 = NL + "                        ";
  protected final String TEXT_1360 = " = new ";
  protected final String TEXT_1361 = "Struct();";
  protected final String TEXT_1362 = NL + "                            ";
  protected final String TEXT_1363 = ".";
  protected final String TEXT_1364 = " = ";
  protected final String TEXT_1365 = ".";
  protected final String TEXT_1366 = ";" + NL;
  protected final String TEXT_1367 = NL + "                        rejectedCount_";
  protected final String TEXT_1368 = " =  rejectedCount_";
  protected final String TEXT_1369 = "+ 1;";
  protected final String TEXT_1370 = NL + "                        ";
  protected final String TEXT_1371 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1372 = NL + "                        ";
  protected final String TEXT_1373 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1374 = ";" + NL;
  protected final String TEXT_1375 = NL + "                        System.err.print(e.getMessage());";
  protected final String TEXT_1376 = NL + "            }";
  protected final String TEXT_1377 = NL + "        \t";
  protected final String TEXT_1378 = NL + "                    ";
  protected final String TEXT_1379 = NL + "                        query_";
  protected final String TEXT_1380 = " = ";
  protected final String TEXT_1381 = ";";
  protected final String TEXT_1382 = NL + "                globalMap.put(\"";
  protected final String TEXT_1383 = "_QUERY\", query_";
  protected final String TEXT_1384 = ".toString().trim());";
  protected final String TEXT_1385 = NL + "            int replaceCount_";
  protected final String TEXT_1386 = " = 0;" + NL + "            try {" + NL + "                replaceCount_";
  protected final String TEXT_1387 = " = pstmt_";
  protected final String TEXT_1388 = ".executeUpdate();";
  protected final String TEXT_1389 = NL + "            } catch(java.lang.Exception e) {" + NL + "                whetherReject_";
  protected final String TEXT_1390 = " = true;";
  protected final String TEXT_1391 = NL + "                    throw(e);";
  protected final String TEXT_1392 = NL + "                        ";
  protected final String TEXT_1393 = " = new ";
  protected final String TEXT_1394 = "Struct();";
  protected final String TEXT_1395 = NL + "                            ";
  protected final String TEXT_1396 = ".";
  protected final String TEXT_1397 = " = ";
  protected final String TEXT_1398 = ".";
  protected final String TEXT_1399 = ";";
  protected final String TEXT_1400 = NL + "                        rejectedCount_";
  protected final String TEXT_1401 = " =  rejectedCount_";
  protected final String TEXT_1402 = "+ 1;";
  protected final String TEXT_1403 = NL + "                        ";
  protected final String TEXT_1404 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1405 = NL + "                        ";
  protected final String TEXT_1406 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1407 = ";";
  protected final String TEXT_1408 = NL + "                        System.err.print(e.getMessage());";
  protected final String TEXT_1409 = NL + "            }" + NL + "            if(replaceCount_";
  protected final String TEXT_1410 = " == 1) {" + NL + "                insertedCount_";
  protected final String TEXT_1411 = " += replaceCount_";
  protected final String TEXT_1412 = ";" + NL + "            } else {" + NL + "                insertedCount_";
  protected final String TEXT_1413 = " += 1;" + NL + "                deletedCount_";
  protected final String TEXT_1414 = " += replaceCount_";
  protected final String TEXT_1415 = " - 1;" + NL + "            }";
  protected final String TEXT_1416 = NL + "                    ";
  protected final String TEXT_1417 = NL + "                        query_";
  protected final String TEXT_1418 = " = ";
  protected final String TEXT_1419 = ";";
  protected final String TEXT_1420 = NL + "                    ";
  protected final String TEXT_1421 = NL + "                        query_";
  protected final String TEXT_1422 = " = ";
  protected final String TEXT_1423 = ";";
  protected final String TEXT_1424 = NL + "                globalMap.put(\"";
  protected final String TEXT_1425 = "_QUERY\", query_";
  protected final String TEXT_1426 = ".toString().trim());";
  protected final String TEXT_1427 = NL + "            int count_on_duplicate_key_";
  protected final String TEXT_1428 = " = 0;" + NL + "            try {" + NL + "                count_on_duplicate_key_";
  protected final String TEXT_1429 = " = pstmt_";
  protected final String TEXT_1430 = ".executeUpdate();";
  protected final String TEXT_1431 = NL + "            } catch(java.lang.Exception e) {" + NL + "                whetherReject_";
  protected final String TEXT_1432 = " = true;";
  protected final String TEXT_1433 = NL + "                    throw(e);";
  protected final String TEXT_1434 = NL + "                        ";
  protected final String TEXT_1435 = " = new ";
  protected final String TEXT_1436 = "Struct();";
  protected final String TEXT_1437 = NL + "                            ";
  protected final String TEXT_1438 = ".";
  protected final String TEXT_1439 = " = ";
  protected final String TEXT_1440 = ".";
  protected final String TEXT_1441 = ";";
  protected final String TEXT_1442 = NL + "                        rejectedCount_";
  protected final String TEXT_1443 = " =  rejectedCount_";
  protected final String TEXT_1444 = "+ 1;";
  protected final String TEXT_1445 = NL + "                        ";
  protected final String TEXT_1446 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1447 = NL + "                        ";
  protected final String TEXT_1448 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1449 = ";";
  protected final String TEXT_1450 = NL + "                        System.err.print(e.getMessage());";
  protected final String TEXT_1451 = NL + "            }" + NL + "            if(count_on_duplicate_key_";
  protected final String TEXT_1452 = " == 1) {" + NL + "                insertedCount_";
  protected final String TEXT_1453 = " += count_on_duplicate_key_";
  protected final String TEXT_1454 = ";" + NL + "            } else {" + NL + "                insertedCount_";
  protected final String TEXT_1455 = " += 1;" + NL + "                updatedCount_";
  protected final String TEXT_1456 = " += count_on_duplicate_key_";
  protected final String TEXT_1457 = " - 1;" + NL + "            }";
  protected final String TEXT_1458 = NL + "                        ";
  protected final String TEXT_1459 = NL + "                            query_";
  protected final String TEXT_1460 = " = ";
  protected final String TEXT_1461 = ";";
  protected final String TEXT_1462 = NL + "                    globalMap.put(\"";
  protected final String TEXT_1463 = "_QUERY\", query_";
  protected final String TEXT_1464 = ".toString().trim());";
  protected final String TEXT_1465 = NL + "                try {" + NL + "                    nb_line_";
  protected final String TEXT_1466 = "++;" + NL + "                    insertedCount_";
  protected final String TEXT_1467 = " = insertedCount_";
  protected final String TEXT_1468 = " + pstmt_";
  protected final String TEXT_1469 = ".executeUpdate();";
  protected final String TEXT_1470 = NL + "                } catch(java.lang.Exception e) {" + NL + "                    whetherReject_";
  protected final String TEXT_1471 = " = true;";
  protected final String TEXT_1472 = NL + "                        throw(e);";
  protected final String TEXT_1473 = NL + "                            ";
  protected final String TEXT_1474 = " = new ";
  protected final String TEXT_1475 = "Struct();";
  protected final String TEXT_1476 = NL + "                                ";
  protected final String TEXT_1477 = ".";
  protected final String TEXT_1478 = " = ";
  protected final String TEXT_1479 = ".";
  protected final String TEXT_1480 = ";";
  protected final String TEXT_1481 = NL + "                            rejectedCount_";
  protected final String TEXT_1482 = " =  rejectedCount_";
  protected final String TEXT_1483 = "+ 1;";
  protected final String TEXT_1484 = NL + "                            ";
  protected final String TEXT_1485 = ".errorCode = ((java.sql.SQLException)e).getSQLState();";
  protected final String TEXT_1486 = NL + "                            ";
  protected final String TEXT_1487 = ".errorMessage = e.getMessage() + \" - Line: \" + tos_count_";
  protected final String TEXT_1488 = ";";
  protected final String TEXT_1489 = NL + "                            System.err.print(e.getMessage());";
  protected final String TEXT_1490 = NL + "                }";
  protected final String TEXT_1491 = NL + "            if(!whetherReject_";
  protected final String TEXT_1492 = ") {";
  protected final String TEXT_1493 = NL + "                            ";
  protected final String TEXT_1494 = " = new ";
  protected final String TEXT_1495 = "Struct();";
  protected final String TEXT_1496 = NL + "                                ";
  protected final String TEXT_1497 = ".";
  protected final String TEXT_1498 = " = ";
  protected final String TEXT_1499 = ".";
  protected final String TEXT_1500 = ";";
  protected final String TEXT_1501 = NL + "            }";
  protected final String TEXT_1502 = NL + "    \t\t\tif ( batchSize_";
  protected final String TEXT_1503 = " <= batchSizeCounter_";
  protected final String TEXT_1504 = ") {";
  protected final String TEXT_1505 = NL + "                try {" + NL + "\t\t\t\t\t\tint countSum_";
  protected final String TEXT_1506 = " = 0;" + NL + "                \t\t";
  protected final String TEXT_1507 = NL + "\t\t\t\t\t\tfor(int countEach_";
  protected final String TEXT_1508 = ": pstmt_";
  protected final String TEXT_1509 = ".executeBatch()) {" + NL + "\t\t\t\t\t\t\tcountSum_";
  protected final String TEXT_1510 = " += (countEach_";
  protected final String TEXT_1511 = " < 0 ? 0 : 1);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1512 = NL + "            \t    \t";
  protected final String TEXT_1513 = NL + "            \t    \tinsertedCount_";
  protected final String TEXT_1514 = " += countSum_";
  protected final String TEXT_1515 = ";" + NL + "            \t    \t";
  protected final String TEXT_1516 = NL + "                }catch (java.sql.BatchUpdateException e){" + NL + "                \t";
  protected final String TEXT_1517 = NL + "                \t\tthrow(e);" + NL + "                \t";
  protected final String TEXT_1518 = NL + "                \tint countSum_";
  protected final String TEXT_1519 = " = 0;" + NL + "\t\t\t\t\tfor(int countEach_";
  protected final String TEXT_1520 = ": e.getUpdateCounts()) {" + NL + "\t\t\t\t\t\tcountSum_";
  protected final String TEXT_1521 = " += (countEach_";
  protected final String TEXT_1522 = " < 0 ? 0 : countEach_";
  protected final String TEXT_1523 = ");" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_1524 = NL + "            \t    insertedCount_";
  protected final String TEXT_1525 = " += countSum_";
  protected final String TEXT_1526 = ";" + NL + "\t    \t    \t";
  protected final String TEXT_1527 = NL + "                \tSystem.err.println(e.getMessage());" + NL + "                \t";
  protected final String TEXT_1528 = NL + "                }";
  protected final String TEXT_1529 = NL + NL + "    \t\t\tbatchSizeCounter_";
  protected final String TEXT_1530 = " = 0;" + NL + "    \t\t}" + NL + "    \t\t";
  protected final String TEXT_1531 = NL + "    \t\t\tif ((batchSize_";
  protected final String TEXT_1532 = " > 0) && (batchSize_";
  protected final String TEXT_1533 = " <= batchSizeCounter_";
  protected final String TEXT_1534 = ")) {" + NL + "                try {" + NL + "\t\t\t\t\t\tint countSum_";
  protected final String TEXT_1535 = " = 0;" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1536 = NL + "\t\t\t\t\t\tfor(int countEach_";
  protected final String TEXT_1537 = ": pstmt_";
  protected final String TEXT_1538 = ".executeBatch()) {" + NL + "\t\t\t\t\t\t\tcountSum_";
  protected final String TEXT_1539 = " += (countEach_";
  protected final String TEXT_1540 = " < 0 ? 0 : countEach_";
  protected final String TEXT_1541 = ");" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1542 = NL + "            \t    \t";
  protected final String TEXT_1543 = NL + "            \t    \tupdatedCount_";
  protected final String TEXT_1544 = " += countSum_";
  protected final String TEXT_1545 = ";" + NL + "            \t    \t";
  protected final String TEXT_1546 = NL + "            \t    \tdeletedCount_";
  protected final String TEXT_1547 = " += countSum_";
  protected final String TEXT_1548 = ";" + NL + "            \t    \t";
  protected final String TEXT_1549 = NL + "            \t    \tbatchSizeCounter_";
  protected final String TEXT_1550 = " = 0;" + NL + "                }catch (java.sql.BatchUpdateException e){" + NL + "                \t";
  protected final String TEXT_1551 = NL + "                \t\tthrow(e);" + NL + "                \t";
  protected final String TEXT_1552 = NL + "                \tint countSum_";
  protected final String TEXT_1553 = " = 0;" + NL + "\t\t\t\t\tfor(int countEach_";
  protected final String TEXT_1554 = ": e.getUpdateCounts()) {" + NL + "\t\t\t\t\t\tcountSum_";
  protected final String TEXT_1555 = " += (countEach_";
  protected final String TEXT_1556 = " < 0 ? 0 : countEach_";
  protected final String TEXT_1557 = ");" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_1558 = NL + "            \t    updatedCount_";
  protected final String TEXT_1559 = " += countSum_";
  protected final String TEXT_1560 = ";" + NL + "            \t    ";
  protected final String TEXT_1561 = NL + "            \t    deletedCount_";
  protected final String TEXT_1562 = " += countSum_";
  protected final String TEXT_1563 = ";" + NL + "            \t    ";
  protected final String TEXT_1564 = NL + "                \tSystem.err.println(e.getMessage());" + NL + "                \t";
  protected final String TEXT_1565 = NL + "                }" + NL + "    \t\t\t}" + NL + "    \t\t";
  protected final String TEXT_1566 = NL + "        \t    commitCounter_";
  protected final String TEXT_1567 = "++;" + NL + "                if(commitEvery_";
  protected final String TEXT_1568 = " <= commitCounter_";
  protected final String TEXT_1569 = ") {";
  protected final String TEXT_1570 = NL + "                if ((batchSize_";
  protected final String TEXT_1571 = " > 0) && (batchSizeCounter_";
  protected final String TEXT_1572 = " > 0)) {" + NL + "                try {" + NL + "                \t\tint countSum_";
  protected final String TEXT_1573 = " = 0;" + NL + "                \t\t";
  protected final String TEXT_1574 = NL + "\t\t\t\t\t\tfor(int countEach_";
  protected final String TEXT_1575 = ": pstmt_";
  protected final String TEXT_1576 = ".executeBatch()) {" + NL + "\t\t\t\t\t\t\tcountSum_";
  protected final String TEXT_1577 = " += (countEach_";
  protected final String TEXT_1578 = " < 0 ? 0 : ";
  protected final String TEXT_1579 = ");" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_1580 = NL + "            \t    \t";
  protected final String TEXT_1581 = NL + "            \t    \tinsertedCount_";
  protected final String TEXT_1582 = " += countSum_";
  protected final String TEXT_1583 = ";" + NL + "            \t    \t";
  protected final String TEXT_1584 = NL + "            \t    \tupdatedCount_";
  protected final String TEXT_1585 = " += countSum_";
  protected final String TEXT_1586 = ";" + NL + "            \t    \t";
  protected final String TEXT_1587 = NL + "            \t    \tdeletedCount_";
  protected final String TEXT_1588 = " += countSum_";
  protected final String TEXT_1589 = ";" + NL + "            \t    \t";
  protected final String TEXT_1590 = NL + "                        batchSizeCounter_";
  protected final String TEXT_1591 = " = 0;" + NL + "                }catch (java.sql.BatchUpdateException e){" + NL + "                \t";
  protected final String TEXT_1592 = NL + "\t\t\t\t\t\tthrow(e);" + NL + "                \t";
  protected final String TEXT_1593 = NL + "                \tint countSum_";
  protected final String TEXT_1594 = " = 0;" + NL + "\t\t\t\t\tfor(int countEach_";
  protected final String TEXT_1595 = ": e.getUpdateCounts()) {" + NL + "\t\t\t\t\t\tcountSum_";
  protected final String TEXT_1596 = " += (countEach_";
  protected final String TEXT_1597 = " < 0 ? 0 : countEach_";
  protected final String TEXT_1598 = ");" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_1599 = NL + "        \t    \tinsertedCount_";
  protected final String TEXT_1600 = " += countSum_";
  protected final String TEXT_1601 = ";" + NL + "        \t    \t";
  protected final String TEXT_1602 = NL + "        \t    \tupdatedCount_";
  protected final String TEXT_1603 = " += countSum_";
  protected final String TEXT_1604 = ";" + NL + "        \t    \t";
  protected final String TEXT_1605 = NL + "        \t    \tdeletedCount_";
  protected final String TEXT_1606 = " += countSum_";
  protected final String TEXT_1607 = ";" + NL + "        \t    \t";
  protected final String TEXT_1608 = NL + "                    System.err.println(e.getMessage());" + NL + "                \t";
  protected final String TEXT_1609 = NL + "                }" + NL + "                }";
  protected final String TEXT_1610 = NL + "                \t";
  protected final String TEXT_1611 = NL + "                \tconn_";
  protected final String TEXT_1612 = ".commit();" + NL + "            \t\t";
  protected final String TEXT_1613 = NL + "                \tcommitCounter_";
  protected final String TEXT_1614 = "=0;" + NL + "                }";
  protected final String TEXT_1615 = NL;

    public static final String INSERT_COLUMN_NAME = "insertColName";
    public static final String INSERT_VALUE_STMT = "insertValueStmt";
    public static final String UPDATE_SET_STMT = "updateSetStmt";
    public static final String UPDATE_WHERE_STMT = "updateWhereStmt";
    public static final String DELETE_WHERE_STMT = "deleteWhereStmt";
    public static final String FIRST_UPDATE_KEY = "firstUpdateKeyColumn";
    public static final String FIRST_DELETE_KEY = "firstDeleteKeyColumn";
    public static final String FIRST_INSERT_COLUMN = "firstInsertColumn";
    public static final String FIRST_UPDATE_COLUMN = "firstUpdateColumn";
    public static final int NORMAL_TYPE = 0;
    public static final int INSERT_TYPE = 1;
    public static final int UPDATE_TYPE = 2;
    public static final String ACCESS = "access_id";
    public static final String AS400 = "as400_id";
    public static final String DB2 = "ibmdb2_id";
    public static final String FIREBIRD = "firebird_id";
    public static final String GREENPLUM = "greenplum_id";
    public static final String HSQLDB = "hsqldb_id";
    public static final String HIVE = "hive_id";
    public static final String INFORMIX = "informix_id";
    public static final String INGRES = "ingres_id";
    public static final String VECTORWISE = "vectorwise_id";
    public static final String INTERBASE = "interbase_id";
    public static final String JAVADB = "javadb_id";
    public static final String MAXDB = "maxdb_id";
    public static final String MSSQL = "id_MSSQL";
    public static final String MYSQL = "mysql_id";
    public static final String NETEZZA = "netezza_id";
    public static final String ORACLE = "oracle_id";
    public static final String PARACCEL = "paraccel_id";
    public static final String POSTGRESQL = "postgres_id";
    public static final String REDSHIFT = "redshift_id";
    public static final String POSTGREPLUS = "postgresplus_id";
    public static final String SQLITE = "sqlite_id";
    public static final String SYBASE = "sybase_id";
    public static final String TERADATA = "teradata_id";
    public static final String VERTICA = "vertica_id";
    public static final String ODBC = "MSODBC";
    public static final String JDBC = "JDBC";
    public static final String EXASOL = "Exasol_id";
    public static final String SAPHANA = "saphana_id";
    private static Map<String, Manager> managerMap = new HashMap<String, Manager>();
    public class Column {
        IMetadataColumn column;
        String name;
        String dataType;
        String operator;
        String columnName;
        String sqlStmt;
        String value;
        boolean addCol;
        boolean isKey;
        boolean isAutoIncrement;
        int startValue;
        int step;
        boolean isUpdateKey;
        boolean isDeleteKey;
        boolean insertable = true;
        boolean updatable = true;
        List<Column> replacement = new ArrayList<Column>();
        
        boolean isDynamic = false;
        
        public Column(String colName, String sqlStmt, boolean addCol) {
            this.column = null;
            this.name = colName;
            this.columnName = colName;
            this.sqlStmt = sqlStmt;
            this.value = "?";
            this.addCol = addCol;
        }
        public Column(IMetadataColumn column) {
            this.column = column;
            this.name = column.getLabel();
            this.sqlStmt = "?";
            this.value = "?";
            this.addCol = false;
            this.columnName = column.getOriginalDbColumnName();
        }
        public Column(IMetadataColumn column, boolean isKey, boolean useFieldOptions, Map<String, String> fieldOption, boolean isSpecifyIdentityKey, String identityKey, int startValue, int step) {
            this(column, isKey, useFieldOptions, fieldOption);
            if(isSpecifyIdentityKey) {
                if(column.getLabel().equals(identityKey)) {
                    isAutoIncrement = false;
                    this.startValue = startValue;
                    this.step = step;
                }
            }
        }
        public Column(IMetadataColumn column, boolean isKey, boolean useFieldOptions, Map<String, String> fieldOption) {
            this(column);
            this.isKey = isKey;
            if(useFieldOptions) {
                this.isUpdateKey = fieldOption.get("UPDATE_KEY").equals("true");
                this.isDeleteKey = fieldOption.get("DELETE_KEY").equals("true");
                this.insertable = fieldOption.get("INSERTABLE").equals("true");
                this.updatable = fieldOption.get("UPDATABLE").equals("true");                
            } else {
                this.insertable = true;
                if (isKey) {
                    this.isUpdateKey = true;
                    this.isDeleteKey = true;
                    this.updatable = false;
                }
                else {
                    this.isUpdateKey = false;
                    this.isDeleteKey = false;
                    this.updatable = true;
                }                
            }
        }
        public boolean isReplaced() {
            return replacement.size() > 0;
        }
        public void replace(Column column) {
            this.replacement.add(column);
        }
        public List<Column> getReplacement() {
            return this.replacement;
        }
        public void setColumn(IMetadataColumn column) {
            this.column = column;
        }
        public IMetadataColumn getColumn() {
            return this.column;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }
        public String getColumnName() {
            return this.columnName;
        }
        public void setIsAddCol(boolean isadd) {
            this.addCol = isadd;
        }
        public boolean isAddCol() {
            return this.addCol;
        }
        public void setSqlStmt(String sql) {
            this.sqlStmt = sql;
        }
        public String getSqlStmt() {
            if(this.getColumn()!=null) {
                if (this.getColumn().getTalendType().equals("id_Geometry")) {
                    
                    if ("MDSYS.SDO_GEOMETRY".equalsIgnoreCase(this.getColumn().getType())) {
                        return "?";
                    } else {
                        return "GeomFromText(?, ?)";    // For PostGIS
                    }
                } else {
                    return this.sqlStmt;
                }
            } else {
                return this.sqlStmt;
            }
        }
        public void setValue(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
        public void setDataType(String dataType) {
            this.dataType = dataType;
        }
        public String getDataType() {
            return dataType;
        }
        public void setOperator(String operator) {
            this.operator = operator;
        }
        public String getOperator() {
            return operator;
        }
        public boolean isAutoIncrement() {
            return this.isAutoIncrement;
        }
        public void setAutoIncrement(boolean isAutoIncrement) {
            this.isAutoIncrement = isAutoIncrement;
        }
        public int getStartValue() {
            return this.startValue;
        }
        public void setStartValue(int startValue) {
            this.startValue = startValue;
        }
        public int getStep() {
            return this.step;
        }
        public void setStep(int step) {
            this.step = step;
        }
        public boolean isKey() {
            return this.isKey;
        }
        public void setKey(boolean isKey) {
            this.isKey = isKey;
        }
        public boolean isUpdateKey() {
            return this.isUpdateKey;
        }
        public void setUpdateKey(boolean isUpdateKey) {
            this.isUpdateKey = isUpdateKey;
        }
        public boolean isDeleteKey() {
            return this.isDeleteKey;
        }
        public void setDeleteKey(boolean isDeleteKey) {
            this.isDeleteKey = isDeleteKey;
        }
        public boolean isInsertable() {
            return this.insertable;
        }
        public void setInsertable(boolean insertable) {
            this.insertable = insertable;
        }
        public boolean isUpdatable() {
            return this.updatable;
        }
        public void setUpdatable(boolean updatable) {
            this.updatable = updatable;
        }
        
        public boolean isDynamic() {
            return isDynamic;
        }
        
        public void setDynamic(boolean isDynamic) {
            this.isDynamic = isDynamic;
        }
    }
        
    public Column getColumn(IMetadataColumn column) {
        return new Column(column);
    }

    public Column getColumn(String colName, String sqlStmt, boolean addCol) {
        return new Column(colName, sqlStmt, addCol);
    }
    
    public Column getColumn(IMetadataColumn column, boolean isKey, boolean useFieldsOptions, Map<String, String> fieldOption) {
        return new Column(column, isKey, useFieldsOptions, fieldOption);
    }

    public abstract class Manager {
        
        protected INode node;// add the Node, it will be more convenient
        public void setNode(INode node) {
           this.node = node;
        }
        
        protected String cid;        
        protected abstract String getDBMSId();
        protected abstract String getLProtectedChar();
        protected abstract String getRProtectedChar();        
        public Manager() {}
        public Manager(String cid) {
            this.cid = cid;
        }
      protected  String getLProtectedChar(String columName) {
          return getLProtectedChar();
      }
      protected  String getRProtectedChar(String columName) {
          return getRProtectedChar();        
      }
      protected boolean contaionsSpaces(String columnName) {
          if (columnName != null) {
              if (columnName.startsWith("\" + ") && columnName.endsWith(" + \"")) {
                  return false;
              }
              
              if (columnName.contains(" ")) {
                  return true;
              }
              // minus are also a problem
              if (columnName.contains("-")) {
                  return true;
              }
          }
          return false;
      }

        public String getSelectionSQL() {
            StringBuilder selectionSQL = new StringBuilder();
            selectionSQL.append("SELECT COUNT(1) FROM " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar());
            return selectionSQL.toString();
        }
        public String getDeleteTableSQL() {
            StringBuilder deleteTableSQL = new StringBuilder();
            deleteTableSQL.append("DELETE FROM " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar());
            return deleteTableSQL.toString();
        }
        public String getTruncateTableSQL() {
            StringBuilder truncateTableSQL = new StringBuilder();
            truncateTableSQL.append("TRUNCATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar());
            return truncateTableSQL.toString();
        }
        public String getTruncateReuseStroageTableSQL() {
            StringBuilder truncate_reuse_stroage_TableSQL = new StringBuilder();
            truncate_reuse_stroage_TableSQL.append("TRUNCATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + " REUSE STORAGE " + getRProtectedChar());
            return truncate_reuse_stroage_TableSQL.toString();
        }
        public String getDropTableSQL() {
            StringBuilder dropTableSQL = new StringBuilder();
            dropTableSQL.append("DROP TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar());
            return dropTableSQL.toString();
        }
        
        public String getCreateTableSQL(List<Column> columnList) {
            MappingTypeRetriever mappingType = MetadataTalendType.getMappingTypeRetriever(getDBMSId());
            StringBuilder createSQL = new StringBuilder();
            createSQL.append("CREATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "(");
            List<String> pkList = new ArrayList<String>();
            int count = 0;
            String ending = ",";
            
            for (Column column : columnList) {
                if (column.isReplaced()) {
                    List<Column> replacedColumns = column.getReplacement();
                    if (column.isKey()) {
                        for (Column replacedColumn : replacedColumns) {
                            pkList.add(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()));
                        }
                    }
                    int replacedCount = 0;
                    for (Column replacedColumn : replacedColumns) {
                        if (count == columnList.size() - 1 && replacedCount == replacedColumns.size() - 1) {
                            ending = "";
                        }
                        createSQL.append(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()) + " ");
                        createSQL.append(replacedColumn.getDataType() + ending);
                        replacedCount++;
                    }
                } else {
                    if (count == columnList.size() - 1) {
                        ending = "";
                    }
                    
                    if (column.isAddCol()) {
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        createSQL.append(column.getDataType() + ending);
                    } else if(column.isDynamic()) {
                        createSQL.append(" {TALEND_DYNAMIC_COLUMN} ").append(ending);
                    } else {
                        if (column.isKey()) {
                            pkList.add(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ));
                        }
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        String dataType = null;
                        if (column.getColumn().getType() == null || column.getColumn().getType().trim().equals("")) {
                            dataType = mappingType.getDefaultSelectedDbType(column.getColumn().getTalendType());
                        } else {
                            dataType = column.getColumn().getType();
                        }
                        Integer length = column.getColumn().getLength() == null ? 0 : column.getColumn().getLength();
                        if ("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {                            
                            createSQL.append(dataType.substring(0,dataType.indexOf("UNSIGNED"))) ;                            
                        }else if("oracle_id".equalsIgnoreCase(getDBMSId()) && dataType.matches("TIMESTAMP WITH TIME ZONE")){
                            createSQL.append("TIMESTAMP("+length+") WITH TIME ZONE");
                        }else{                            
                            createSQL.append(dataType);
                        }
                        Integer precision = column.getColumn().getPrecision() == null ? 0 : column.getColumn().getPrecision();
                        boolean lengthIgnored = mappingType.isLengthIgnored(getDBMSId(), dataType);
                        boolean precisionIgnored = mappingType.isPrecisionIgnored(getDBMSId(), dataType);
                        String prefix = "";
                        String suffix = "";
                        String comma = "";
                        
                        if ( ("oracle_id".equalsIgnoreCase(getDBMSId()))
                                && (("NUMBER".equalsIgnoreCase(dataType)) || ("CHAR".equalsIgnoreCase(dataType)) || ("NCHAR".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ){} 
                        else if (("mysql_id".equalsIgnoreCase(getDBMSId()))
                                && (("DECIMAL".equalsIgnoreCase(dataType)) || ("NUMERIC".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ) {}
                        else {
                            if (mappingType.isPreBeforeLength(getDBMSId(), dataType)) {
                                if (!precisionIgnored) {
                                    prefix = "(";
                                    suffix = ") ";
                                    createSQL.append(prefix + precision);
                                }
                                if (!lengthIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (precisionIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + length);
                                }
                                createSQL.append(suffix);
                            } else {
                                if (!lengthIgnored) {
                                    if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                    
                                    } else { 
                                        prefix = "(";
                                        suffix = ") ";
                                        createSQL.append(prefix + length);                                    
                                    }
                                }
                                if (!precisionIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (lengthIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + precision);
                                }
                                if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                
                                } else {
                                    createSQL.append(suffix);
                                }
                                if("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {
                                    createSQL.append("UNSIGNED");
                                }
                            }                            
                            
                        }
                        if(column.isAutoIncrement()) {
                            // move the autoincrease key column to the first index in the primary defination. Otherwise, it will throw exception
                            if("mysql_id".equalsIgnoreCase(getDBMSId()) ) {
                                String columnStr = getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() );
                                int index = pkList.indexOf(columnStr);
                                if(index !=-1){
                                    for (int i=index;i>0;i--) {
                                        pkList.set(i, pkList.get(i-1));
                                    }
                                    pkList.set(0, columnStr);
                                }
                            }
                            createSQL.append(getAutoIncrement(column.getStartValue(), column.getStep()));
                        } else {
                            createSQL.append(setDefaultValue(column.getColumn().getDefault(), dataType));
                            createSQL.append(setNullable(column.getColumn().isNullable()));
                        }

                        createSQL.append(ending);
                    }
                }
                count++;
            }
            
            if (pkList.size() > 0) {
                createSQL.append(",primary key(");
                int i = 0;
                for (String pk : pkList) {
                    createSQL.append(pk);
                    if (i != pkList.size() - 1) {
                        createSQL.append(",");
                    }
                    i++;
                }
                createSQL.append(")");
            }
            return createSQL.toString();
        }
        protected String getAutoIncrement(int startValue, int step) {
            if("sybase_id".equalsIgnoreCase(getDBMSId())){
                return " IDENTITY NOT NULL";
            } else if("mysql_id".equalsIgnoreCase(getDBMSId()) ) {
                return " AUTO_INCREMENT";
            } else if("ibmdb2_id".equalsIgnoreCase(getDBMSId())){
                return " Generated by default AS IDENTITY(START WITH "+startValue+", INCREMENT BY "+step+", NO CACHE )";
            } else if("teradata_id".equalsIgnoreCase(getDBMSId())){
                return " generated by default as identity (start with " + startValue + " increment by " + step + " no cycle) not null";
            }else {
                return " IDENTITY (" + startValue + ", " + step + ") NOT NULL";
            }
        }
        protected String setNullable(boolean nullable) {
            if(!nullable) {
                return " not null ";
            } else {
                return "";
            }
        }
        protected String setDefaultValue(String defaultValue, String columnType) {
            if (defaultValue == null || defaultValue.equals("\"\"") || defaultValue.equals("")) {
                return " ";
            } else if ((defaultValue.startsWith("\"") || defaultValue.startsWith("'"))
                    && (defaultValue.endsWith("\"") || defaultValue.endsWith("'"))) {
                return " default '" + defaultValue.substring(1, defaultValue.length() - 1) + "' ";
            } else if (defaultValue.equalsIgnoreCase("null")) {
                return " default null ";
            } else {
                return " default " + defaultValue + " ";
            }
        }
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateWhereStmt = new StringBuilder();
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar() + ", " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar());
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            String keySeparator = null;
            String updateSeparator = null;
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereStmt.append(" WHERE \" + \"");
                    } else {
                        keySeparator = " AND ";
                    }
                    updateWhereStmt.append(keySeparator);                    
                    updateWhereStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                } else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \"");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                }
            }
            return updateBulkSQL.toString() + updateSetStmt.toString() + updateWhereStmt.toString();
        }

        public List<Column> createColumnList(List<IMetadataColumn> columnList, boolean useFieldOptions, List<Map<String, String>> fieldOptions, List<Map<String, String>> addCols, boolean isSpecifyIdentityKey, String identityKey, int startValue, int step) {
            List<Column> stmtStructure = createColumnList(columnList, useFieldOptions, fieldOptions, addCols);
            if(isSpecifyIdentityKey) {
                for(Column column : stmtStructure) {
                    if(column.name.equals(identityKey)) {
                        column.setAutoIncrement(true);
                        column.setStartValue(startValue);
                        column.setStep(step);
                        break;
                    }
                }
            }
            return stmtStructure;
        }
        
        private boolean dynamicColumnIsReplaced = false;
        
        public List<Column> createColumnList(List<IMetadataColumn> columnList, boolean useFieldOptions, List<Map<String, String>> fieldOptions, List<Map<String, String>> addCols) {
            List<Column> stmtStructure = new ArrayList<Column>();            
            for(IMetadataColumn column : columnList) {
                Map<String, String> fieldOption = null;
                if(fieldOptions != null && fieldOptions.size() > 0) {
                    for(Map<String, String> tmpFieldOption : fieldOptions) {
                        if(column.getLabel().equals(tmpFieldOption.get("SCHEMA_COLUMN"))) {
                            fieldOption = tmpFieldOption;
                            break;
                        }
                    }
                }
                
                Column skeletonColumn = getColumn(column, column.isKey(), useFieldOptions, fieldOption);
                skeletonColumn.setOperator("=");
                skeletonColumn.setDataType(column.getType());
                stmtStructure.add(skeletonColumn);
                
                if("id_Dynamic".equals(column.getTalendType())) {
                    skeletonColumn.setDynamic(true);
                }
            }
            
            dynamicColumnIsReplaced = false;
            
            if(addCols != null && addCols.size() > 0) {
                for(IMetadataColumn column : columnList) {
                    for(Map<String, String> additionColumn : addCols) {
                        if(additionColumn.get("REFCOL").equals(column.getLabel())) {
                            int stmtIndex = 0;
                            for(Column stmtStr : stmtStructure){          
                                if(stmtStr.getName().equals(additionColumn.get("REFCOL"))) {
                                    break;
                                }
                                stmtIndex++;
                            }           
                            if(additionColumn.get("POS").equals("AFTER")) {
                                Column insertAfter = getColumn("\" + " + additionColumn.get("NAME") + " + \"", "\" + " + additionColumn.get("SQL") + " + \"", true);
                                insertAfter.setDataType(additionColumn.get("DATATYPE"));
                                insertAfter.setOperator("=");
                                stmtStructure.add(stmtIndex+1, insertAfter);
                            } else if(additionColumn.get("POS").equals("BEFORE")) {
                                Column insertBefore = getColumn("\" + " + additionColumn.get("NAME") + " + \"", "\" + " + additionColumn.get("SQL") + " + \"", true);
                                insertBefore.setDataType(additionColumn.get("DATATYPE"));
                                insertBefore.setOperator("=");
                                stmtStructure.add(stmtIndex, insertBefore);
                            } else if(additionColumn.get("POS").equals("REPLACE")) {
                                Column replacementCol = getColumn("\" + " + additionColumn.get("NAME") + " + \"", "\" + " + additionColumn.get("SQL") + " + \"", true);
                                replacementCol.setDataType(additionColumn.get("DATATYPE"));
                                replacementCol.setOperator("=");                                
                                Column replacedCol = (Column) stmtStructure.get(stmtIndex);
                                replacementCol.setKey(replacedCol.isKey());
                                replacementCol.setUpdateKey(replacedCol.isUpdateKey());
                                replacementCol.setDeleteKey(replacedCol.isDeleteKey());
                                replacementCol.setUpdatable(replacedCol.isUpdatable());
                                replacementCol.setInsertable(replacedCol.isInsertable());
                                replacedCol.replace(replacementCol);
                                
                                if(replacedCol.isDynamic()) {
                                    dynamicColumnIsReplaced = true;
                                }
                            }                            
                        }
                    }
                }
            }
            
            return stmtStructure;
        }
        
        public boolean isDynamicColumnReplaced() {
            return dynamicColumnIsReplaced;
        }
        
        public Map<String, StringBuilder> createProcessSQL(List<Column> stmtStructure) {
            Map<String, StringBuilder> actionSQLMap = new HashMap<String, StringBuilder>();
            if(stmtStructure==null || stmtStructure.size() < 1) {
                actionSQLMap.put(INSERT_COLUMN_NAME, new StringBuilder());
                actionSQLMap.put(INSERT_VALUE_STMT, new StringBuilder());
                actionSQLMap.put(UPDATE_SET_STMT, new StringBuilder());
                actionSQLMap.put(UPDATE_WHERE_STMT, new StringBuilder());
                actionSQLMap.put(DELETE_WHERE_STMT, new StringBuilder());
                actionSQLMap.put(FIRST_UPDATE_KEY, new StringBuilder());
                actionSQLMap.put(FIRST_DELETE_KEY, new StringBuilder());
                actionSQLMap.put(FIRST_INSERT_COLUMN, new StringBuilder());
                actionSQLMap.put(FIRST_UPDATE_COLUMN, new StringBuilder());
            } else {
                for(Column column : stmtStructure) {
                    if(column.isReplaced()) {
                        List<Column> replacedColumns = column.getReplacement();
                        for(Column replacedColumn : replacedColumns) {
                            actionSQLMap = processSQLClause(replacedColumn, actionSQLMap);
                        }
                    } else {
                        actionSQLMap = processSQLClause(column, actionSQLMap);        
                    }
                }
            }
            return actionSQLMap;
        }
        
        private boolean isSpecifyIdentityKey = false;
        
        public void setIsSpecifyIdentityKey(boolean isSpecifyIdentityKey) {
            this.isSpecifyIdentityKey = isSpecifyIdentityKey;
        }
        
        private Map<String, StringBuilder> processSQLClause(Column column, Map<String, StringBuilder> actionSQLMap) {
            StringBuilder insertColName = actionSQLMap.get(INSERT_COLUMN_NAME);
            if(insertColName == null) {
                insertColName = new StringBuilder();
            }
            StringBuilder insertValueStmt = actionSQLMap.get(INSERT_VALUE_STMT);
            if(insertValueStmt == null) {
                insertValueStmt = new StringBuilder();
            }
            StringBuilder updateSetStmt = actionSQLMap.get(UPDATE_SET_STMT);
            if(updateSetStmt == null) {
                updateSetStmt = new StringBuilder(); 
            }
            StringBuilder updateWhereStmt = actionSQLMap.get(UPDATE_WHERE_STMT);
            if(updateWhereStmt == null) {
                updateWhereStmt = new StringBuilder();
            }
            StringBuilder deleteWhereStmt = actionSQLMap.get(DELETE_WHERE_STMT);
            if(deleteWhereStmt == null) {
                deleteWhereStmt = new StringBuilder();
            }
            StringBuilder firstUpdateKeyColumn = actionSQLMap.get(FIRST_UPDATE_KEY);
            if(firstUpdateKeyColumn == null) {
                firstUpdateKeyColumn = new StringBuilder("true");
            }
            StringBuilder firstDeleteKeyColumn = actionSQLMap.get(FIRST_DELETE_KEY);
            if(firstDeleteKeyColumn == null) {
                firstDeleteKeyColumn = new StringBuilder("true");
            }
            StringBuilder firstInsertColumn = actionSQLMap.get(FIRST_INSERT_COLUMN);
            if(firstInsertColumn == null) {
                firstInsertColumn = new StringBuilder("true");
            }
            StringBuilder firstUpdateColumn = actionSQLMap.get(FIRST_UPDATE_COLUMN);
            if(firstUpdateColumn == null) {
                firstUpdateColumn = new StringBuilder("true");
            }
            String suffix = null;
            String separate = null;
            String identityKey = ElementParameterParser.getValue(node, "__IDENTITY_FIELD__");
            if(!(isSpecifyIdentityKey && (column.getName().equals(identityKey))) && column.isInsertable() && !column.isDynamic()) {
                if(firstInsertColumn.toString().equals("true")) {
                    suffix = "";
                    firstInsertColumn = new StringBuilder("false");
                } else {
                    suffix = ",";
                }
                insertColName.append(suffix);
                insertColName.append(getLProtectedChar(column.getColumnName()) + column.getColumnName() + getRProtectedChar(column.getColumnName()));
                insertValueStmt.append(suffix);
                insertValueStmt.append(column.getSqlStmt());
            }
            if(column.isUpdatable() && !column.isDynamic()) {
                if(firstUpdateColumn.toString().equals("true")) {
                    suffix = "";
                    firstUpdateColumn = new StringBuilder("false");
                } else {
                    suffix = ",";
                }
                updateSetStmt.append(suffix);
                updateSetStmt.append(getLProtectedChar(column.getColumnName()) + column.getColumnName() + getRProtectedChar(column.getColumnName()) + " " + column.getOperator() + " " + column.getSqlStmt());
            }
            if(column.isDeleteKey() && !column.isDynamic()) {
                if(firstDeleteKeyColumn.toString().equals("true")) {
                    separate = "";
                    firstDeleteKeyColumn = new StringBuilder("false");
                } else {
                    separate = " AND ";
                }
                deleteWhereStmt.append(separate);
                
                //feature:2880
                whereStmtSupportNull(deleteWhereStmt, column);                 
            }
            if(column.isUpdateKey() && !column.isDynamic()) {
                if(firstUpdateKeyColumn.toString().equals("true")) {
                    separate = "";
                    firstUpdateKeyColumn = new StringBuilder("false");
                } else {
                    separate = " AND ";
                }
                updateWhereStmt.append(separate);
                
                //feature:2880
                whereStmtSupportNull(updateWhereStmt, column);                
                                            
            }
            actionSQLMap.put(INSERT_COLUMN_NAME, insertColName);
            actionSQLMap.put(INSERT_VALUE_STMT, insertValueStmt);
            actionSQLMap.put(UPDATE_SET_STMT, updateSetStmt);
            actionSQLMap.put(UPDATE_WHERE_STMT, updateWhereStmt);
            actionSQLMap.put(DELETE_WHERE_STMT, deleteWhereStmt);
            actionSQLMap.put(FIRST_UPDATE_KEY, firstUpdateKeyColumn);
            actionSQLMap.put(FIRST_DELETE_KEY, firstDeleteKeyColumn);
            actionSQLMap.put(FIRST_INSERT_COLUMN, firstInsertColumn);
            actionSQLMap.put(FIRST_UPDATE_COLUMN, firstUpdateColumn);
            return actionSQLMap;
        }
        public String getGenerateType(String typeToGenerate) {
            if(typeToGenerate.equals("byte[]")) {
                typeToGenerate = "Bytes";
            } else if(typeToGenerate.equals("java.util.Date")) {
                typeToGenerate = "Date";
            } else if(typeToGenerate.equals("Integer")) {
                typeToGenerate = "Int";
            } else if(typeToGenerate.equals("List")) {  
                typeToGenerate = "Object";                 
            } else {
                typeToGenerate=typeToGenerate.substring(0,1).toUpperCase()+typeToGenerate.substring(1);
            }
            return typeToGenerate;
        }
        
        public String generateSetStmt(String typeToGenerate, String dbType, Column column, int index, String incomingConnName, String cid, int actionType) {
            return generateSetStmt(typeToGenerate, dbType, column, index, incomingConnName, cid, actionType, null); 
        }
        
        public String generateSetStmt(String typeToGenerate, String dbType, Column column, int index, String incomingConnName, String cid, int actionType, String dynamic) {
            
            if(dynamic==null) {
                dynamic="";
            } else {
                dynamic+=cid;
            }
            
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(dbType != null && (dbType.equals("LONG RAW") || dbType.equals("RAW"))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.ARRAY);\r\n");                    
                }                
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(dbType != null && dbType.equals("CLOB")) {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CLOB);\r\n");                    
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.VARCHAR);\r\n");                    
                }                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(dbType != null && dbType.equals("BLOB")) {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.BLOB);\r\n");
                } else if("CLOB".equals(dbType)){
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CLOB);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.OTHER);\r\n");                    
                }               
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + dynamic + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else if(typeToGenerate.equals("Bytes") && (dbType != null && (dbType.equals("LONG RAW") || dbType.equals("RAW")))) {
                setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            } else if(typeToGenerate.equals("String") && (dbType != null && dbType.equals("CLOB"))) {
                setStmt.append(prefix + cid + ".setCharacterStream(" + index + dynamic + ", new java.io.StringReader(" + incomingConnName + "." + column.getName() + "), " + incomingConnName + "." + column.getName() + ".length());\r\n");                
            } else if (typeToGenerate.equals("Bytes") && (dbType != null && dbType.equals("BLOB"))) {
                setStmt.append(prefix + cid + ".setBinaryStream(" + index + dynamic + ", new java.io.ByteArrayInputStream((byte[])" + incomingConnName + "." + column.getName() + "), ((byte[])" + incomingConnName + "." + column.getName() + ").length);\r\n");
            }
            else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();            
        }
        
        public String generateSetStmt(String typeToGenerate, Column column, int index, String incomingConnName, String cid, int actionType) {
            return generateSetStmt(typeToGenerate, column, index, incomingConnName, cid, actionType, null); 
        }
        
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType, String dynamic) {
            
            if(dynamic==null) {
                dynamic="";
            } else {
                dynamic+=cid;
            }
            
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.ARRAY);\r\n");                
                }
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.OTHER);\r\n");                
                }               
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + dynamic + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
        
        // @Deprecated : see bug8551
        public String retrieveSQL(String generatedType, Column column, String incomingConnName, String cid, String stmt) {
            String replaceStr = null;
            if(generatedType.equals("char") || generatedType.equals("Character")) {
                replaceStr = "\"'\" + String.valueOf(" + incomingConnName + "." + column.getName() + ") + \"'\"";
            } else if(generatedType.equals("String")) {
                replaceStr = "\"'\" + " + incomingConnName + "." + column.getName() + " + \"'\"";
            } else if(generatedType.equals("java.util.Date")) {
                replaceStr = "\"'\" + new java.text.SimpleDateFormat(" + column.getColumn().getPattern() + ").format(" + incomingConnName + "." + column.getName() + ") + \"'\"";
                
            } else {
                replaceStr = "String.valueOf(" + incomingConnName + "." + column.getName() + ")";
            }
            
            
            if (generatedType.equals("int") || generatedType.equals("float") || generatedType.equals("double") ||generatedType.equals("long") 
                    || generatedType.equals("short") || generatedType.equals("boolean") || generatedType.equals("byte") || generatedType.equals("char")) {
                return stmt + cid + ".replaceFirst(\"\\\\?\", " +  replaceStr + ")";
            }else {
                return stmt + cid + ".replaceFirst(\"\\\\?\", " + incomingConnName + "." + column.getName() +"== null ?  \"null\" :" + replaceStr + ")";
            }
            
                
        }
        
        public String retrieveSQL(String generatedType, Column column, String incomingConnName, String cid, String stmt, int index, String sqlSplit) {
            return retrieveSQL(null,generatedType, column, incomingConnName, cid, stmt, index, sqlSplit);
        }
        public String retrieveSQL(String dynCol,String generatedType, Column column, String incomingConnName, String cid, String stmt, int index, String sqlSplit) {
            String replaceStr = null;
            String dynamicIndex=""+index;
            if(dynCol!=null){
                dynamicIndex = incomingConnName+"."+dynCol+".getColumnCount()+"+index;
            }
            if(generatedType.equals("char") || generatedType.equals("Character")) {
                replaceStr = "\"'\" + String.valueOf(" + incomingConnName + "." + column.getName() + ") + \"'\"";
            } else if(generatedType.equals("String")) {
                replaceStr = "\"'\" + " + incomingConnName + "." + column.getName() + " + \"'\"";
            } else if(generatedType.equals("java.util.Date")) {
                replaceStr = "\"'\" + new java.text.SimpleDateFormat(" + column.getColumn().getPattern() + ").format(" + incomingConnName + "." + column.getName() + ") + \"'\"";
                
            } else {
                replaceStr = "String.valueOf(" + incomingConnName + "." + column.getName() + ")";
            }
            
            if (generatedType.equals("int") || generatedType.equals("float") || generatedType.equals("double") ||generatedType.equals("long") 
                    || generatedType.equals("short") || generatedType.equals("boolean") || generatedType.equals("byte") || generatedType.equals("char")) {
                    if (index == 1 && dynCol == null) {
                        return  stmt + cid + ".append("+sqlSplit+cid+"[0]).append(" +  replaceStr + ").append("+sqlSplit+cid+"["+index+"])";
                    } else {
                        return  stmt + cid + ".append(" +  replaceStr + ").append("+sqlSplit+cid+"["+dynamicIndex+"])";
                    }
            }else {
                if (index == 1 && dynCol == null) {
                    return stmt + cid + ".append("+sqlSplit+cid+"[0]).append(" + incomingConnName + "." + column.getName() +"== null ?  \"null\" :" + replaceStr + ").append("+sqlSplit+cid+"["+index+"])";
                } else {
                    return stmt + cid + ".append(" + incomingConnName + "." + column.getName() +"== null ?  \"null\" :" + replaceStr + ").append("+sqlSplit+cid+"["+dynamicIndex+"])";
                }
            }
        }
        
        //feature:2880 @6980 in debug mode
        public String retrieveSQL(String generatedType, Column column, String incomingConnName, String cid, String stmt, int index, String sqlSplit, String replaceFixedStr) {
            return retrieveSQL(null,generatedType, column, incomingConnName, cid, stmt, index, sqlSplit, replaceFixedStr);
        }
        
        public String retrieveSQL(String dynCol,String generatedType, Column column, String incomingConnName, String cid, String stmt, int index, String sqlSplit, String replaceFixedStr) {
            String dynamicIndex=""+index;
            if(dynCol!=null){
                dynamicIndex = incomingConnName+"."+dynCol+".getColumnCount()+"+index;
            }
            if (index == 1 && dynCol == null) {
                return stmt + cid + ".append("+sqlSplit+cid+"[0]).append(" +replaceFixedStr+ ").append("+sqlSplit+cid+"["+index+"])";
            } else {
                return stmt + cid + ".append(" +replaceFixedStr+").append("+sqlSplit+cid+"["+dynamicIndex+"])";
            }
        }
        
        //extract a method for feature:2880, it is a default implement, need every tDBOutput to implement it, if it really want to support the "whereNULL" issue
        //@see: the implement of MSSQLManager
        //feature:2880 @6980
        //i.e: 
        //1.select * FROM user where ((true = true AND name is NULL) OR name = ?);
        //2.select * FROM user where ((true = false AND name is NULL) OR name = ?);
        
        public void whereStmtSupportNull(StringBuilder updateWhereStmt, Column column) {
            boolean whereSupportNull = false;

            //if node = null, it means some components have not support the "whereNULL" issue yet.
            if (node != null) {
                whereSupportNull = ElementParameterParser.getValue(node, "__SUPPORT_NULL_WHERE__").equals("true");
            }
            if (whereSupportNull && column.getColumn()!=null && column.getColumn().isNullable()) {
                updateWhereStmt.append("((" + getLProtectedChar(column.getColumnName()) + column.getColumnName() + getRProtectedChar(column.getColumnName())
                        + " IS NULL AND " + getColumnIsNullCondition() +" " + column.getOperator() + " " + column.getSqlStmt() + ") ");
                updateWhereStmt.append("OR " + getLProtectedChar(column.getColumnName()) + column.getColumnName() + getRProtectedChar(column.getColumnName())
                        + column.getOperator() + column.getSqlStmt() + ")");
            } else {
                //if node = null, go this branch as the old behave
                updateWhereStmt.append(getLProtectedChar(column.getColumnName()) + column.getColumnName() + getRProtectedChar(column.getColumnName()) + " "
                        + column.getOperator() + " " + column.getSqlStmt());
            }
        }
        
        //feature:2880 @6980
        //need all db to implement, return the column whether is null(in java) prefix condition.
        protected String getColumnIsNullCondition() {
            return "1";
        }
        
        // for feature:2880, it will consider the "whereNULL" issue in the generated code.
        // @Deprecated: because the "index" with a small problem when increase it.
        private String generateSetStmt_4_whereSupportNull(String typeToGenerate, Column column, int index,
                String incomingConnName, String cid, int actionType) {

            boolean whereSupportNull = false;

            // if node = null, it means some components have not support the "whereNULL" issue yet.
            if (node != null) {
                whereSupportNull = ElementParameterParser.getValue(node, "__SUPPORT_NULL_WHERE__").equals("true");
            }

            StringBuilder setStmt = new StringBuilder();

            // the 3 conditions are important
            if (column.isUpdateKey() && whereSupportNull && column.getColumn().isNullable()) {
                setStmt.append(generateSetBooleanForNullableKeyStmt(column, index, incomingConnName, cid, NORMAL_TYPE));
            }

            // the old behave
            setStmt.append(generateSetStmt(typeToGenerate, column, index, incomingConnName, cid, NORMAL_TYPE));

            return setStmt.toString();
        }

        protected String generateSetBooleanForNullableKeyStmt(String dynCol,Column column, int index, String incomingConnName, String cid,
                int actionType) {
            String dynamicIndex=""+index;
            if(dynCol!=null){
                dynamicIndex = incomingConnName+"."+dynCol+".getColumnCount()+"+index;
            }
            String prefix = null;
            if (actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if (actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if (actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            //TODO generate setXXXX code according to each db .
            setStmt.append(prefix + cid + ".setInt(" + dynamicIndex + ",  ((" + incomingConnName + "." + column.getName() + "==null)?1:0));\r\n");
            return setStmt.toString();
        } 
        
        // for feature:2880 @6980, generate the "set XXXX" java code.thie code is about  the column whether is null(in java) prefix condition.
        //@see:getColumnIsNullCondition()
        //need all db to implement.
        protected String generateSetBooleanForNullableKeyStmt(Column column, int index, String incomingConnName, String cid,
                int actionType) {
            return generateSetBooleanForNullableKeyStmt(null, column, index, incomingConnName, cid, actionType);
        }     
        
        public String getCopyFromCSVSQL(List<IMetadataColumn> columnList, 
                String fieldDelimiter, 
                String newLineChar,
                String nullIndicator) {
        return null;
            
        }
        
        public String generateCode4TabelExist() {
            boolean useExistingConnection = "true".equals(ElementParameterParser.getValue(node,"__USE_EXISTING_CONNECTION__"));
            String connection = ElementParameterParser.getValue(node,"__CONNECTION__");
            StringBuilder code = new StringBuilder();  
            code.append("String tableNameForSearch_" + cid + "= " + getTableName4Search(useExistingConnection, connection) + ";\r\n");
            if (hasSchema()) {
                code.append("String dbschemaForSearch_" + cid + "= null;\r\n");
                code.append("if(dbschema_" + cid + "== null || dbschema_" + cid + ".trim().length() == 0) {\r\n");
                code.append("dbschemaForSearch_" + cid + "= " + getUserName4Search(useExistingConnection, connection)+ ";\r\n");
                code.append("} else {\r\n");
                code.append("dbschemaForSearch_" + cid + "= " + getShemaName4Search(useExistingConnection, connection)+ ";\r\n");
                code.append("}\r\n");
            }
            return code.toString();
        }
        
        protected String getTableName4Search(boolean useExistingConnection, String connection) {
            return "\""+getLProtectedChar()+ "\" + " + ElementParameterParser.getValue(node,"__TABLE__") +" + \"" + getRProtectedChar() + "\""; 
        }
        
        protected String getUserName4Search(boolean useExistingConnection, String connection) {
            return "";   
        }

        /*
         * maybe some db need add getLProtectedChar() and getRProtectedChar() to schema name.
         * this because of some db default add getLProtectedChar() and getRProtectedChar() to schaem when create table. e.g:db2
         * 
         * in fact the db add getLProtectedChar() and getRProtectedChar() to scheam when create table that is wrong
        */
        protected String getShemaName4Search(boolean useExistingConnection, String connection) {
            return "";   
        }   
        
        protected boolean hasSchema() {
            return false;
        }
        
    }
    
    public class AS400Manager extends Manager {
        public AS400Manager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return AS400;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }
        
        //feature:2880 @6980
        //need all db to implement, return the column whether is null(in java) prefix condition.
        protected String getColumnIsNullCondition() {
            return "1";
        }
        
    }
    
    public class AccessManager extends Manager {
        public AccessManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return ACCESS;
        }
        protected String getLProtectedChar() {
            return "[";
        }
        protected String getRProtectedChar() {
            return "]";
        }   
        
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType) {
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.ARRAY);\r\n");                
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.OTHER);\r\n");                
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else {
                if (typeToGenerate.equals("Long")) {
                    setStmt.append(prefix + cid + ".setBigDecimal(" + index + ",new BigDecimal(" + incomingConnName + "." + column.getName() + "));\r\n");
                } else {
                    setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + ", " + incomingConnName + "." + column.getName() + ");\r\n");
                }
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
        
        //feature:2880 @6980
        //need all db to implement, return the column whether is null(in java) prefix condition.
        protected String getColumnIsNullCondition() {
            return "1";
        }
        
    }
    
    public class DB2Manager extends Manager {
        public DB2Manager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return DB2;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        }       
        
        public String getTruncateTableSQL() {
            StringBuilder truncateTableSQL = new StringBuilder();
            truncateTableSQL.append("TRUNCATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + " IMMEDIATE");
            return truncateTableSQL.toString();
        }
        
        public String getTruncateReuseStroageTableSQL() {
            StringBuilder truncate_reuse_stroage_TableSQL = new StringBuilder();
            truncate_reuse_stroage_TableSQL.append("TRUNCATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + " REUSE STORAGE IMMEDIATE");
            return truncate_reuse_stroage_TableSQL.toString();
        }
        
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            // try to build a sql like 
            // update customers a 
            // set (city_name,customer_type)=(select b.city_name,b.customer_type 
            //        from tmp_cust_city b 
            //        where b.customer_id=a.customer_id) // wheresub
            //        where exists (select 1 
            //        from tmp_cust_city b
            //        where b.customer_id=a.customer_id
            //        )
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateSetSelectStmt= new StringBuilder();           
            StringBuilder updateWhereSubStmt = new StringBuilder();
            StringBuilder updateWhereMainStmt = new StringBuilder();
            String keySeparator = null;
            String updateSeparator = null;
            
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar() );
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereSubStmt.append(" WHERE \" + \"");
                        updateWhereMainStmt.append(" WHERE EXISTS ( SELECT 1 FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() );
                    }else {
                        keySeparator = " AND ";
                    }
                    updateWhereSubStmt.append(keySeparator);                    
                    updateWhereSubStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());                        

                }else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \" ( ");
                        updateSetSelectStmt.append(" = (SELECT ");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                    updateSetSelectStmt.append(updateSeparator);
                    updateSetSelectStmt.append(getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar()) ;
                }
            }
            updateSetStmt.append(" )");
            updateSetSelectStmt.append(" FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar());
            updateWhereSubStmt.append(")");
            
            return updateBulkSQL.append(updateSetStmt).append(updateSetSelectStmt).append(updateWhereSubStmt).append(updateWhereMainStmt).append(updateWhereSubStmt).toString();
        }
        
        //feature:2880 @6980
        //need all db to implement, return the column whether is null(in java) prefix condition.
        protected String getColumnIsNullCondition() {
            return "1";
        }
        
    }
    
    public class FirebirdManager extends Manager {
        public FirebirdManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return FIREBIRD;
        }
        protected String getLProtectedChar() {
            return " ";
        }
        protected String getRProtectedChar() {
            return " ";
        }
        public String getDropTableSQL() {
            StringBuilder dropTableSQL = new StringBuilder();
            dropTableSQL.append("DROP TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar());
            return dropTableSQL.toString();
        }
        
         public String getCreateTableSQL(List<Column> columnList) {
            MappingTypeRetriever mappingType = MetadataTalendType.getMappingTypeRetriever(getDBMSId());
            StringBuilder createSQL = new StringBuilder();
            createSQL.append("CREATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "(");
            List<String> pkList = new ArrayList<String>();
            int count = 0;
            String ending = ",";
            
            for (Column column : columnList) {
                if (column.isReplaced()) {
                    List<Column> replacedColumns = column.getReplacement();
                    if (column.isKey()) {
                        for (Column replacedColumn : replacedColumns) {
                            pkList.add(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()));
                        }
                    }
                    int replacedCount = 0;
                    for (Column replacedColumn : replacedColumns) {
                        if (count == columnList.size() - 1 && replacedCount == replacedColumns.size() - 1) {
                            ending = "";
                        }
                        createSQL.append(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()) + " ");
                        createSQL.append(replacedColumn.getDataType() + ending);
                        replacedCount++;
                    }
                } else {
                    if (count == columnList.size() - 1) {
                        ending = "";
                    }
                    
                    if (column.isAddCol()) {
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        createSQL.append(column.getDataType() + ending);
                    } else if(column.isDynamic()) {
                        createSQL.append(" {TALEND_DYNAMIC_COLUMN} ").append(ending);
                    } else {
                        if (column.isKey()) {
                            pkList.add(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ));
                        }
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        String dataType = null;
                        if (column.getColumn().getType() == null || column.getColumn().getType().trim().equals("")) {
                            dataType = mappingType.getDefaultSelectedDbType(column.getColumn().getTalendType());
                        } else {
                            dataType = column.getColumn().getType();
                        }
                        if ("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {                            
                            createSQL.append(dataType.substring(0,dataType.indexOf("UNSIGNED"))) ;                            
                        }else {                            
                            createSQL.append(dataType);
                        }
                        Integer length = column.getColumn().getLength() == null ? 0 : column.getColumn().getLength();
                        Integer precision = column.getColumn().getPrecision() == null ? 0 : column.getColumn().getPrecision();
                        boolean lengthIgnored = mappingType.isLengthIgnored(getDBMSId(), dataType);
                        boolean precisionIgnored = mappingType.isPrecisionIgnored(getDBMSId(), dataType);
                        String prefix = "";
                        String suffix = "";
                        String comma = "";
                        
                        if ( ("oracle_id".equalsIgnoreCase(getDBMSId()))
                                && (("NUMBER".equalsIgnoreCase(dataType)) || ("CHAR".equalsIgnoreCase(dataType)) || ("NCHAR".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ){} 
                        else if (("mysql_id".equalsIgnoreCase(getDBMSId()))
                                && (("DECIMAL".equalsIgnoreCase(dataType)) || ("NUMERIC".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ) {}
                        else {
                            if (mappingType.isPreBeforeLength(getDBMSId(), dataType)) {
                                if (!precisionIgnored) {
                                    prefix = "(";
                                    suffix = ") ";
                                    createSQL.append(prefix + precision);
                                }
                                if (!lengthIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (precisionIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + length);
                                }
                                createSQL.append(suffix);
                            } else {
                                if (!lengthIgnored) {
                                    if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                    
                                    } else { 
                                        prefix = "(";
                                        suffix = ") ";
                                        createSQL.append(prefix + length);                                    
                                    }
                                }
                                if (!precisionIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (lengthIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + precision);
                                }
                                if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                
                                } else {
                                    createSQL.append(suffix);
                                }
                                if("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {
                                    createSQL.append("UNSIGNED");
                                }
                            }                            
                            
                        }
                        if(column.isAutoIncrement()) {
                            createSQL.append(getAutoIncrement(column.getStartValue(), column.getStep()));
                        } else {
                            createSQL.append(setDefaultValue(column.getColumn().getDefault(), dataType));
                            createSQL.append(setNullable(column.getColumn().isNullable()));
                        }
                        
                        createSQL.append(ending);
                    }
                }
                count++;
            }
            
            if (pkList.size() > 0) {
                createSQL.append(",primary key(");
                int i = 0;
                for (String pk : pkList) {
                    createSQL.append(pk);
                    if (i != pkList.size() - 1) {
                        createSQL.append(",");
                    }
                    i++;
                }
                createSQL.append(")");
            }
            
            // add VectorWise option
            if ("vectorwise_id".equalsIgnoreCase(getDBMSId())){
                createSQL.append("WITH STRUCTURE = VECTORWISE");
            }
            
            return createSQL.toString();
        }
                
    }
    
    public class HSQLDBManager extends Manager {
        String [] hsqldbKeyWords = {};
        public HSQLDBManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return HSQLDB;
        }   
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }     
        protected boolean isHSQLDBKeyword (String keyword) {
            for (int i=0 ; i < hsqldbKeyWords.length ; i++){
                if (hsqldbKeyWords[i].equalsIgnoreCase(keyword)) {
                    return true;
                }
            }
            return false;
        }
        protected String getLProtectedChar(String keyword) {
            if (isHSQLDBKeyword(keyword)){
                return "\\\"";
            }
            return getLProtectedChar();
        }
        protected String getRProtectedChar(String keyword) {
            if (isHSQLDBKeyword(keyword)){
                return "\\\"";
            }
            return getRProtectedChar();
        }  
    }
    
    public class HiveManager extends Manager {
        String [] hiveKeyWords = {};
        public HiveManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return HIVE;
        }   
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }     
        protected boolean isHiveKeyword (String keyword) {
            for (int i=0 ; i < hiveKeyWords.length ; i++){
                if (hiveKeyWords[i].equalsIgnoreCase(keyword)) {
                    return true;
                }
            }
            return false;
        }
        protected String getLProtectedChar(String keyword) {
            if (isHiveKeyword(keyword)){
                return "\\\"";
            }
            return getLProtectedChar();
        }
        protected String getRProtectedChar(String keyword) {
            if (isHiveKeyword(keyword)){
                return "\\\"";
            }
            return getRProtectedChar();
        }  
    }
    
    public class InformixManager extends Manager {
        public InformixManager(String cid) {
            super(cid);
        }
        public String getSelectionSQL() {
            StringBuilder selectionSQL = new StringBuilder();
            selectionSQL.append("SELECT COUNT(*) FROM " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar());
            return selectionSQL.toString();
        }        
        protected String getDBMSId() {
            return INFORMIX;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }        
    }
    
    public class IngresManager extends Manager {
        boolean isTrimSpace = true;
        public IngresManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return INGRES;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        }  
        protected boolean getTrimSpace() {
            return isTrimSpace;
        }
        protected boolean setTrimSpace(boolean isTrimSpace) {
            this.isTrimSpace = isTrimSpace;
            return isTrimSpace;
        }
        
        public String getCopyFromCSVSQL(List<IMetadataColumn> columnList, String fieldDelimiter, 
                String recordDelimiter, String nullIndicator) {     
            StringBuilder copyBulkSQL = new StringBuilder();
            copyBulkSQL.append("COPY TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar());
            copyBulkSQL.append(" (\"+");                
            int counter = 0;
            for(IMetadataColumn column : columnList) {
                counter++;
                // add each table field and separator
                copyBulkSQL.append( 
                "\n\"\\n" +
                  column.getOriginalDbColumnName() 
                + "="
                + (!getTrimSpace() && ("VARCHAR".equalsIgnoreCase(column.getType()) || "NVARCHAR".equalsIgnoreCase(column.getType()) || "TEXT".equalsIgnoreCase(column.getType())) ? "text(0)" : "char(0)"));
            
                // add these only if not last entry
                if (counter < columnList.size()){
                    copyBulkSQL.append(
                    //convertDelim(fieldDelimiter)
                    "\"+field_delimiter_"+cid +"+\""
                    + (column.isNullable() ? " WITH NULL ('" + nullIndicator + "')" : "")
                    + " ,"
                    + "\""
                    + "+"
                    );
                } else {
                    copyBulkSQL.append(
                    recordDelimiter
                    + (column.isNullable() ? " WITH NULL ('" + nullIndicator + "')" : "")
                    );
                    copyBulkSQL.append(")");
                }       
            } 
            return copyBulkSQL.toString();
        } 

        public String getTruncateTableSQL() {
            StringBuilder truncateTableSQL = new StringBuilder();
            truncateTableSQL.append("MODIFY " + getLProtectedChar() + "\" + tableName_" 
            + cid + " + \"\\\" TO TRUNCATED");
            return truncateTableSQL.toString();
        }                       
    }
    
    public class VectorWiseManager extends IngresManager {
        public VectorWiseManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return VECTORWISE;
        }
    }   
    
    public class InterbaseManager extends Manager {
        public InterbaseManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return INTERBASE;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        }        
    }
    
    public class JavaDBManager extends Manager {
        public JavaDBManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return JAVADB;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        }        
    }
    
    public class MaxDBManager extends Manager {
        public MaxDBManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return MAXDB;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }
    }
    
    public class MSSQLManager extends Manager {
        public MSSQLManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return MSSQL;
        }
        protected String getLProtectedChar() {
            return "[";
        }
        protected String getRProtectedChar() {
            return "]";
        }
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateWhereStmt = new StringBuilder();
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar());
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            String keySeparator = null;
            String updateSeparator = null;
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereStmt.append(" FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + " WHERE \" + \"");
                    } else {
                        keySeparator = " AND ";
                    }
                    updateWhereStmt.append(keySeparator);                    
                    updateWhereStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                } else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \"");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                }
            }
            return updateBulkSQL.toString() + updateSetStmt.toString() + updateWhereStmt.toString();            
        } 
       
        protected String getColumnIsNullCondition() {
            return "0x1";
        }
        
        protected String generateSetBooleanForNullableKeyStmt(String dynCol,Column column, int index, String incomingConnName, String cid,
                int actionType) {
            String dynamicIndex=""+index;
            if(dynCol!=null){
                dynamicIndex = incomingConnName+"."+dynCol+".getColumnCount()+"+index;
            }
            String prefix = null;
            if (actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if (actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if (actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            setStmt.append(prefix + cid + ".setBoolean(" + dynamicIndex + ", (" + incomingConnName + "." + column.getName()
                    + "==null));\r\n");
            return setStmt.toString();
        } 
        
        public String generateSetStmt(String typeToGenerate, String ignoreDateOutOfRange, Column column, int index, 
                String incomingConnName, String cid, int actionType, String dynamic) {
            
            if(dynamic==null) {
                dynamic="";
            } else {
                dynamic+=cid;
            }
            
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.ARRAY);\r\n");                
                }
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.OTHER);\r\n");                
                }               
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                String dbType = column.getColumn().getType();
                if(dbType==null || "".equals(dbType)){
                    MappingTypeRetriever mappingType = MetadataTalendType.getMappingTypeRetriever(getDBMSId());
                    dbType = mappingType.getDefaultSelectedDbType(column.getColumn().getTalendType());
                }
                boolean isMSSQL = "id_MSSQL".equals(this.getDBMSId());
                if("true".equals(ignoreDateOutOfRange) &&("DATE".equals(dbType) || "DATETIME2".equals(dbType) || "DATETIMEOFFSET".equals(dbType))){                    
                    String pattern = column.getColumn().getPattern();
                    setStmt.append("if(" + incomingConnName + "." + column.getName() +"!=null && "+ incomingConnName + "." + column.getName() + ".getTime() < year2_"+cid+"){");
                    if("DATETIMEOFFSET".equals(dbType)) {
                       setStmt.append(prefix + cid + ".setString(" + index + dynamic + ",TalendDate.formatDatetimeoffset("+incomingConnName+"."+column.getName()+"));\r\n");
                    } else {
                       setStmt.append(prefix + cid + ".setString(" + index + dynamic + ",TalendDate.formatDate("+pattern+", "+incomingConnName+"."+column.getName()+"));\r\n");
                    }
                    setStmt.append("}else{\r\n");
                    setStmt.append(prefix + cid + ".setTimestamp(" + index + dynamic + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime())");
                    if("DATETIMEOFFSET".equals(dbType)) {
                        setStmt.append(",calendar_datetimeoffset_").append(cid);
                    }
                    setStmt.append(");\r\n");
                    setStmt.append("}\r\n");
                }else if(isMSSQL && "TIME".equals(dbType)){//TDI-30431 begin
                    String timePattern = column.getColumn().getPattern();
                    //Compatible with Time,Date and String,it will fail if Time contain fractional seconds.(Solution:Use sqljdbc.jar and setTime() instead)
                    //setStmt.append(prefix + cid + ".setString(" + index + dynamic + "," + incomingConnName + "." + column.getName()+".toString()");// For Time and String
                    setStmt.append(prefix + cid + ".setString(" + index + dynamic + ","
                                    + incomingConnName + "." + column.getName()
                                    +" instanceof java.util.Date ? new java.text.SimpleDateFormat("+timePattern+").format("
                                    + incomingConnName + "." + column.getName()+") : "
                                    + incomingConnName + "." + column.getName()+".toString()");//Compatible with tFileInputDelimiter Date Type and Time and String
                    setStmt.append(");\r\n");
                }else{//TDI-30431 end
                    setStmt.append(prefix + cid + ".setTimestamp(" + index + dynamic + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime())");
                    if("DATETIMEOFFSET".equals(dbType)) {
                        setStmt.append(",calendar_datetimeoffset_").append(cid);
                    }
                    setStmt.append(");\r\n");
                }
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
        
        public String getCreateTableSQL(List<Column> columnList) {
            MappingTypeRetriever mappingType = MetadataTalendType.getMappingTypeRetriever(getDBMSId());
            StringBuilder createSQL = new StringBuilder();
            createSQL.append("CREATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "(");
            List<String> pkList = new ArrayList<String>();
            int count = 0;
            String ending = ",";
            
            for (Column column : columnList) {
                if (column.isReplaced()) {
                    List<Column> replacedColumns = column.getReplacement();
                    if (column.isKey()) {
                        for (Column replacedColumn : replacedColumns) {
                            pkList.add(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()));
                        }
                    }
                    int replacedCount = 0;
                    for (Column replacedColumn : replacedColumns) {
                        if (count == columnList.size() - 1 && replacedCount == replacedColumns.size() - 1) {
                            ending = "";
                        }
                        createSQL.append(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()) + " ");
                        createSQL.append(replacedColumn.getDataType() + ending);
                        replacedCount++;
                    }
                } else {
                    if (count == columnList.size() - 1) {
                        ending = "";
                    }
                    
                    if (column.isAddCol()) {
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        createSQL.append(column.getDataType() + ending);
                    } else if(column.isDynamic()) {
                        createSQL.append(" {TALEND_DYNAMIC_COLUMN} ").append(ending);
                    } else {
                        if (column.isKey()) {
                            pkList.add(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ));
                        }
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        String dataType = null;
                        if (column.getColumn().getType() == null || column.getColumn().getType().trim().equals("")) {
                            dataType = mappingType.getDefaultSelectedDbType(column.getColumn().getTalendType());
                        } else {
                            dataType = column.getColumn().getType();
                        }
                        if ("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {                            
                            createSQL.append(dataType.substring(0,dataType.indexOf("UNSIGNED"))) ;                            
                        }else {                            
                            createSQL.append(dataType);
                        }
                        Integer length = column.getColumn().getLength() == null ? 0 : column.getColumn().getLength();
                        Integer precision = column.getColumn().getPrecision() == null ? 0 : column.getColumn().getPrecision();
                        boolean lengthIgnored = mappingType.isLengthIgnored(getDBMSId(), dataType);
                        boolean precisionIgnored = mappingType.isPrecisionIgnored(getDBMSId(), dataType);
                        String prefix = "";
                        String suffix = "";
                        String comma = "";
                        
                        //bug 0016707 fixed:when set INT IDENTITY in schema and use "Specify identity field". the INT IDENTITY in schema by ignored  
                        if(column.isAutoIncrement()) {
                            length = column.getStartValue();
                            precision =  column.getStep();
                            if ("INT IDENTITY".equals(column.column.getType())) {
                                column.setAutoIncrement(false);
                            } 
                        }
                        // end bug0016707
                        
                        if ( ("oracle_id".equalsIgnoreCase(getDBMSId()))
                                && (("NUMBER".equalsIgnoreCase(dataType)) || ("CHAR".equalsIgnoreCase(dataType)) || ("NCHAR".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ){} 
                        else if (("mysql_id".equalsIgnoreCase(getDBMSId()))
                                && (("DECIMAL".equalsIgnoreCase(dataType)) || ("NUMERIC".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ) {}
                        else {
                            if (mappingType.isPreBeforeLength(getDBMSId(), dataType)) {
                                if (!precisionIgnored) {
                                    prefix = "(";
                                    suffix = ") ";
                                    createSQL.append(prefix + precision);
                                }
                                if (!lengthIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (precisionIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + length);
                                }
                                createSQL.append(suffix);
                            } else {
                                if (!lengthIgnored) {
                                    if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                    
                                    } else { 
                                        prefix = "(";
                                        suffix = ") ";
                                        createSQL.append(prefix + length);                                    
                                    }
                                }
                                if (!precisionIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (lengthIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + precision);
                                }
                                if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                
                                } else {
                                    createSQL.append(suffix);
                                }
                                if("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {
                                    createSQL.append("UNSIGNED");
                                }
                            }                            
                            
                        }
                        if(column.isAutoIncrement()) {
                            createSQL.append(getAutoIncrement(column.getStartValue(), column.getStep()));
                        } else {
                            createSQL.append(setDefaultValue(column.getColumn().getDefault(), dataType));
                            createSQL.append(setNullable(column.getColumn().isNullable()));
                        }
                        
                        createSQL.append(ending);
                    }
                }
                count++;
            }
            
            if (pkList.size() > 0) {
                createSQL.append(",primary key(");
                int i = 0;
                for (String pk : pkList) {
                    createSQL.append(pk);
                    if (i != pkList.size() - 1) {
                        createSQL.append(",");
                    }
                    i++;
                }
                createSQL.append(")");
            }
            return createSQL.toString();
        }
    }
    
    public class MysqlManager extends Manager {
        public MysqlManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return MYSQL;
        }
        protected String getLProtectedChar() {
            return "`";
        }
        protected String getRProtectedChar() {
            return "`";
        }
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType) {
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE){
                prefix = "pstmt_";
            }else if(actionType == INSERT_TYPE){
                prefix = "pstmtInsert_";
            }else if(actionType == UPDATE_TYPE){
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.ARRAY);\r\n");                
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.OTHER);\r\n");                
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append("date_" + cid + " = " + incomingConnName + "." + column.getName() + ".getTime();\r\n");
                setStmt.append("if(date_" + cid + " < year1_" + cid + " || date_" + cid + " >= year10000_" + cid + ") {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", \"0000-00-00 00:00:00\");\r\n");
                setStmt.append("} else {");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + ", new java.sql.Timestamp(date_" + cid + "));\r\n");
                setStmt.append("}\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }        
    }

    public class NetezzaManager extends Manager {
        public NetezzaManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return NETEZZA;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType, String dynamic) {
            
            if(dynamic==null) {
                dynamic="";
            } else {
                dynamic+=cid;
            }
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.ARRAY);\r\n");                
                }
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.OTHER);\r\n");                
                }               
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                String dateType="Timestamp";
                if("TIME".equalsIgnoreCase(column.getColumn().getType())){
                    dateType = "Time";
                }
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".set"+dateType+"(" + index + dynamic + ", new java.sql."+dateType+"(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
    }
    
    public class OracleManager extends Manager {
          private String[] oracleKeyWords= {
                    "ACCESS" ,"AUDIT","COMPRESS","DESC" , 
                    "ADD","CONNECT","DISTINCT" ,
                    "ALL","BY","CREATE","DROP",
                    "ALTER","CHAR","CURRENT","ELSE",
                    "AND","CHECK","DATE","EXCLUSIVE",
                    "ANY","CLUSTER","DECIMAL"," EXISTS",
                    "AS","COLUMN","DEFAULT","FILE",
                    "ASC","COMMENT","DELETE","FLOAT",
                    "FOR","LONG","PCTFREE","SUCCESSFUL",
                    "FROM","MAXEXTENTS","PRIOR","SYNONYM",
                    "GRANT","MINUS","PRIVILEGES","SYSDATE",
                    "GROUP","MODE","PUBLIC","TABLE",
                    "HAVING","MODIFY","RAW","THEN",
                    "IDENTIFIED","NETWORK","RENAME","TO",
                    "IMMEDIATE","NOAUDIT","RESOURCE","TRIGGER",
                    "IN","NOCOMPRESS","REVOKE","UID",
                    "INCREMENT","NOT","ROW","UNION",
                    "INDEX","NOWAIT","ROWID","UNIQUE",
                    "INITIAL","NULL","ROWNUM","UPDATE",
                    "INSERT","NUMBER","ROWS","USER",
                    "INTEGER","OF","SELECT","VALIDATE",
                    "INTERSECT","OFFLINE","SESSION","VALUES",
                    "INTO","ON","SET","VARCHAR",
                    "IS","ONLINE","SHARE","VARCHAR2",
                    "LEVEL","OPTION","SIZE","VIEW",
                    "LIKE","OR","SMALLINT","WHENEVER",
                    "LOCK","ORDER","START","WHERE","WITH"
                    };
        public OracleManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return ORACLE;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }   
        protected boolean isOracleKeyword (String keyword) {
            for (int i=0 ; i < oracleKeyWords.length ; i++){
                if (oracleKeyWords[i].equalsIgnoreCase(keyword)) {
                    return true;
                }
            }
            return false;
        }
        protected String getLProtectedChar(String keyword) {
            if (isOracleKeyword(keyword) || contaionsSpaces(keyword)){
                return "\\\"";
            }
            return getLProtectedChar();
        }
        protected String getRProtectedChar(String keyword) {
            if (isOracleKeyword(keyword) || contaionsSpaces(keyword)){
                return "\\\"";
            }
            return getRProtectedChar();
        }  
        private String dbVersion = "";
        public void setDbVersion(String dbVersion){
            this.dbVersion = dbVersion;  
        }
        
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateSetSelectStmt= new StringBuilder();           
            StringBuilder updateWhereSubStmt = new StringBuilder();
            StringBuilder updateWhereMainStmt = new StringBuilder();
            String keySeparator = null;
            String updateSeparator = null;
            
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar() );
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereSubStmt.append(" WHERE \" + \"");
                        updateWhereMainStmt.append(" WHERE EXISTS ( SELECT 1 FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() );
                    }else {
                        keySeparator = " AND ";
                    }
                    updateWhereSubStmt.append(keySeparator);                    
                    updateWhereSubStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());                        

                }else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \" ( ");
                        updateSetSelectStmt.append(" = (SELECT ");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                    updateSetSelectStmt.append(updateSeparator);
                    updateSetSelectStmt.append(getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar()) ;
                }
            }
            updateSetStmt.append(" )");
            updateSetSelectStmt.append(" FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar());
            updateWhereSubStmt.append(")");
            
            return updateBulkSQL.append(updateSetStmt).append(updateSetSelectStmt).append(updateWhereSubStmt).append(updateWhereMainStmt).append(updateWhereSubStmt).toString();
        }        
        
        public String generateSetStmt(String typeToGenerate, Column column, int index, String incomingConnName, String cid, int actionType, String dynamic) {
        	return generateSetStmt(typeToGenerate, column.getColumn().getType(), column, index, incomingConnName, cid, actionType, dynamic);
        }
        
        public String generateSetStmt(String typeToGenerate, String dbType, Column column, int index, String incomingConnName, String cid, int actionType, String dynamic) {
            if(dynamic==null) {
                dynamic="";
            } else {
                dynamic+=cid;
            }
            if(dbType == null){
            	dbType = "";
            }
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(dbType != null && (dbType.equals("LONG RAW") || dbType.equals("RAW"))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.ARRAY);\r\n");
                }
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.INTEGER);\r\n");
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(dbType != null && dbType.equals("CLOB")) {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CLOB);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.VARCHAR);\r\n");
                }
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(dbType != null && dbType.equals("BLOB")) {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.BLOB);\r\n");
                } else if("CLOB".equals(dbType)){
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CLOB);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.OTHER);\r\n");
                }
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.INTEGER);\r\n");
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DOUBLE);\r\n");
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.FLOAT);\r\n");
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if( typeToGenerate.equals("String")&& dbType.toLowerCase().equals("char")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == \"\0\"){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            }
            else if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                boolean isTSWithTZ = dbType.matches("TIMESTAMP WITH TIME ZONE");
                if(isTSWithTZ && ("ORACLE_11".equals(dbVersion) || "ORACLE_11-6".equals(dbVersion) || "ORACLE_12".equals(dbVersion) || "ORACLE_10".equals(dbVersion))){
                    setStmt.append("if("+ incomingConnName + "." + column.getName() + " instanceof TalendTimestampWithTZ){\r\n");
                    setStmt.append("((oracle.jdbc.OraclePreparedStatement)" + prefix + cid + ").setTIMESTAMPTZ(" + index + dynamic +  ", new oracle.sql.TIMESTAMPTZ(conn_" + cid + ", ((TalendTimestampWithTZ)"+ incomingConnName + "." + column.getName() +").getTimestamp(),((TalendTimestampWithTZ)"+ incomingConnName + "." + column.getName() +").getCalendar()));\r\n");
                    setStmt.append("}else{");
                    setStmt.append(prefix + cid + ".setObject(" + index + dynamic +  ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                    setStmt.append("}");
                }else if ("Date".equalsIgnoreCase(dbType)) {
                    if (!"true".equals(ElementParameterParser.getValue(node, "__USE_TIMESTAMP_FOR_DATE_TYPE__"))) {
                        setStmt.append(prefix + cid + ".setDate(" + index + dynamic +  ", new java.sql.Date(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                    } else {
                        setStmt.append(prefix + cid + ".setObject(" + index + dynamic +  ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()),java.sql.Types.DATE);\r\n");
                    }
                } else {
                    setStmt.append(prefix + cid + ".setTimestamp(" + index + dynamic +  ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n"); 
                }
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic +  ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else if(typeToGenerate.equals("Bytes") && (dbType != null && (dbType.equals("LONG RAW") || dbType.equals("RAW")))) {
                setStmt.append(prefix + cid + ".setBytes(" + index + dynamic +  ", " + incomingConnName + "." + column.getName() + ");\r\n");
            } else if(typeToGenerate.equals("String") && (dbType != null && dbType.equals("CLOB"))) {
                setStmt.append(prefix + cid + ".setCharacterStream(" + index + dynamic +  ", new java.io.StringReader(" + incomingConnName + "." + column.getName() + "), " + incomingConnName + "." + column.getName() + ".length());\r\n");
            } else if (typeToGenerate.equals("Bytes") && (dbType != null && dbType.equals("BLOB"))) {
                setStmt.append(prefix + cid + ".setBinaryStream(" + index + dynamic +  ", new java.io.ByteArrayInputStream((byte[])" + incomingConnName + "." + column.getName() + "), ((byte[])" + incomingConnName + "." + column.getName() + ").length);\r\n");
            }else if (typeToGenerate.equals("Object") && (dbType != null && (dbType.equals("XMLTYPE")||dbType.equals("CLOB")))) {
                setStmt.append(prefix + cid + ".setObject(" + index + dynamic +  ",  clobTypeUtil_" + cid + ".getCLOB(" + incomingConnName + "." + column.getName() + ", conn_" + cid + "));\r\n");
            }else if (typeToGenerate.equals("Object") && (dbType != null && dbType.equals("BLOB"))) {
                setStmt.append(prefix + cid + ".setObject(" + index + dynamic +  ",  blobTypeUtil_" + cid + ".getBLOB(" + incomingConnName + "." + column.getName() + ", conn_" + cid + "));\r\n");
            }else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic +  ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
        
        protected String getTableName4Search(boolean useExistingConnection, String connection) {
            boolean convertToUppercase = ("true").equals(ElementParameterParser.getValue(node, "__CONVERT_COLUMN_TABLE_TO_UPPERCASE__"));
            if(convertToUppercase){
                return "\""+getLProtectedChar()+ "\" + ((String)" + ElementParameterParser.getValue(node,"__TABLE__") + ").toUpperCase()" +" + \"" + getRProtectedChar() + "\"";
            }else{
                return "\""+getLProtectedChar()+ "\" + ((String)" + ElementParameterParser.getValue(node,"__TABLE__") + ")" +" + \"" + getRProtectedChar() + "\""; 
            }
        }
        
        protected String getUserName4Search(boolean useExistingConnection, String connection) {
            if (useExistingConnection) {
                return "((String)globalMap.get(\"username_" + connection + "\")).toUpperCase()";
            } else {
                return "((String)" + ElementParameterParser.getValue(node,"__USER__") + ").toUpperCase()";
            }    
        }

        protected String getShemaName4Search(boolean useExistingConnection, String connection) {
            return "dbschema_" + cid + ".toUpperCase()"; 
        }   
        
        protected boolean hasSchema() {
            return true;
        }
        
        public void whereStmtSupportNull(StringBuilder updateWhereStmt, Column column) {
            boolean whereSupportNull = false;
            String columnName = column.getColumnName();
            String dataType = column.getDataType();
            if(dataType!=null)
            {
            boolean trimChar = ("true").equals(ElementParameterParser.getValue(node,"__TRIM_CHAR__"));
            if(trimChar && "char".equals(dataType.toLowerCase()))
            {
                columnName = "trim("+columnName+")";
            }
            }
            //if node = null, it means some components have not support the "whereNULL" issue yet.
            if (node != null) {
                whereSupportNull = ElementParameterParser.getValue(node, "__SUPPORT_NULL_WHERE__").equals("true");
            }
            if (whereSupportNull && column.getColumn()!=null && column.getColumn().isNullable()) {
                updateWhereStmt.append("((" + getLProtectedChar(columnName) + columnName + getRProtectedChar(columnName)
                        + " IS NULL AND " + getColumnIsNullCondition() +" " + column.getOperator() + " " + column.getSqlStmt() + ") ");
                updateWhereStmt.append("OR " + getLProtectedChar(columnName) + columnName + getRProtectedChar(columnName)
                        + column.getOperator() + column.getSqlStmt() + ")");
            } else {
                //if node = null, go this branch as the old behave
                updateWhereStmt.append(getLProtectedChar(columnName) + columnName + getRProtectedChar(columnName) + " "
                        + column.getOperator() + " " + column.getSqlStmt());
            }
        }
    }
    
    public class PostgreManager extends Manager {
        public PostgreManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return POSTGRESQL;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        }
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType) {
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.TIMESTAMP);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.ARRAY);\r\n");                
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.OTHER);\r\n");                
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.TIMESTAMP);\r\n");
                setStmt.append("}\r\n");
            } else if(typeToGenerate.equals("Geometry")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                // Load geometry
                setStmt.append(
                                prefix +
                                cid +
                                ".setString(" + 
                                    index +
                                    ", ((org.talend.sdi.geometry.Geometry)(" +
                                    incomingConnName + "." + column.getName() + ")).toString()" +
                                    ");\r\n");
                // TODO : should use forceCoordinate first, then getSRID method or -1 if it's null.
                setStmt.append(
                                prefix +
                                cid +
                                ".setInt(" + 
                                    index + 
                                    " + 1, ((org.talend.sdi.geometry.Geometry)(" + 
                                    incomingConnName + "." + column.getName() + ")).getSRID()" +
                                    ");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + " + 1 , java.sql.Types.INTEGER);\r\n");
                setStmt.append("}\r\n");    
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateWhereStmt = new StringBuilder();
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar());
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            String keySeparator = null;
            String updateSeparator = null;
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereStmt.append(" FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + " WHERE \" + \"");
                    } else {
                        keySeparator = " AND ";
                    }
                    updateWhereStmt.append(keySeparator);                    
                    updateWhereStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                } else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \"");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                }
            }
            return updateBulkSQL.toString() + updateSetStmt.toString() + updateWhereStmt.toString();            
        }        
    }
    
    public class RedshiftManager extends PostgreManager {
         public RedshiftManager(String cid) {
             super(cid);
         }
         
         protected String getDBMSId() {
             return REDSHIFT;
         }
         
         public String getCreateTableSQL(List<Column> columnList) {
            MappingTypeRetriever mappingType = MetadataTalendType.getMappingTypeRetriever(getDBMSId());
            StringBuilder createSQL = new StringBuilder();
            createSQL.append("CREATE TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "(");
            List<String> pkList = new ArrayList<String>();
            int count = 0;
            String ending = ",";
            
            for (Column column : columnList) {
                if (column.isReplaced()) {
                    List<Column> replacedColumns = column.getReplacement();
                    if (column.isKey()) {
                        for (Column replacedColumn : replacedColumns) {
                            pkList.add(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()));
                        }
                    }
                    int replacedCount = 0;
                    for (Column replacedColumn : replacedColumns) {
                        if (count == columnList.size() - 1 && replacedCount == replacedColumns.size() - 1) {
                            ending = "";
                        }
                        createSQL.append(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()) + " ");
                        createSQL.append(replacedColumn.getDataType() + ending);
                        replacedCount++;
                    }
                } else {
                    if (count == columnList.size() - 1) {
                        ending = "";
                    }
                    
                    if (column.isAddCol()) {
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        createSQL.append(column.getDataType() + ending);
                    } else if(column.isDynamic()) {
                        createSQL.append(" {TALEND_DYNAMIC_COLUMN} ").append(ending);
                    } else {
                        if (column.isKey()) {
                            pkList.add(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ));
                        }
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        String dataType = null;
                        if (column.getColumn().getType() == null || column.getColumn().getType().trim().equals("")) {
                            dataType = mappingType.getDefaultSelectedDbType(column.getColumn().getTalendType());
                        } else {
                            dataType = column.getColumn().getType();
                        }
                        Integer length = column.getColumn().getLength() == null ? 0 : column.getColumn().getLength();
                        createSQL.append(dataType);
                        Integer precision = column.getColumn().getPrecision() == null ? 0 : column.getColumn().getPrecision();
                        boolean lengthIgnored = mappingType.isLengthIgnored(getDBMSId(), dataType);
                        boolean precisionIgnored = mappingType.isPrecisionIgnored(getDBMSId(), dataType);
                        String prefix = "";
                        String suffix = "";
                        String comma = "";
                        
                        if (mappingType.isPreBeforeLength(getDBMSId(), dataType)) {
                            if (!precisionIgnored) {
                                prefix = "(";
                                suffix = ") ";
                                createSQL.append(prefix + precision);
                            }
                            if (!lengthIgnored) {
                                prefix = (prefix.equals("") ? "(" : prefix);
                                suffix = (suffix.equals("") ? ") " : suffix);
                                if (precisionIgnored) {
                                    createSQL.append(prefix);
                                    comma = "";
                                } else {
                                    comma = ",";
                                }
                                createSQL.append(comma + length);
                            }
                            createSQL.append(suffix);
                        } else {
                            if (!lengthIgnored) {
                                if (column.getColumn().getLength() == null) {                                  
                                } else { 
                                    prefix = "(";
                                    suffix = ") ";
                                    createSQL.append(prefix + length);                                    
                                }
                            }
                            if (!precisionIgnored) {
                                prefix = (prefix.equals("") ? "(" : prefix);
                                suffix = (suffix.equals("") ? ") " : suffix);
                                if (lengthIgnored) {
                                    createSQL.append(prefix);
                                    comma = "";
                                } else {
                                    comma = ",";
                                }
                                createSQL.append(comma + precision);
                            }
                            if (column.getColumn().getLength() == null) {
                            } else {
                                createSQL.append(suffix);
                            }
                        }
                            
                        if(column.isAutoIncrement()) {
                            // move the autoincrease key column to the first index in the primary defination. Otherwise, it will throw exception
                            createSQL.append(getAutoIncrement(column.getStartValue(), column.getStep()));
                        } else {
                            createSQL.append(setDefaultValue(column.getColumn().getDefault(), dataType));
                            createSQL.append(setNullable(column.getColumn().isNullable()));
                        }

                        createSQL.append(ending);
                    }
                }
                count++;
            }
            
            if (pkList.size() > 0) {
                createSQL.append(",primary key(");
                int i = 0;
                for (String pk : pkList) {
                    createSQL.append(pk);
                    if (i != pkList.size() - 1) {
                        createSQL.append(",");
                    }
                    i++;
                }
                createSQL.append(")");
            }
            return createSQL.toString();
        }
    }
    
    public class GreenplumManager extends PostgrePlusManager {
         public GreenplumManager(String cid) {
             super(cid);
         }
         protected String getDBMSId() {
             return GREENPLUM;
         }
    }
    public class PostgrePlusManager extends Manager {
        public PostgrePlusManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return POSTGREPLUS;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        }
        
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType) {
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.TIMESTAMP);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.ARRAY);\r\n");                
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.OTHER);\r\n");                
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.TIMESTAMP);\r\n");
                setStmt.append("}\r\n");
            } else if(typeToGenerate.equals("Geometry")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                // Load geometry
                setStmt.append(
                                prefix +
                                cid +
                                ".setString(" + 
                                    index +
                                    ", ((org.talend.sdi.geometry.Geometry)(" +
                                    incomingConnName + "." + column.getName() + ")).toString()" +
                                    ");\r\n");
                // TODO : should use forceCoordinate first, then getSRID method or -1 if it's null.
                setStmt.append(
                                prefix +
                                cid +
                                ".setInt(" + 
                                    index + 
                                    " + 1, ((org.talend.sdi.geometry.Geometry)(" + 
                                    incomingConnName + "." + column.getName() + ")).getSRID()" +
                                    ");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + " + 1 , java.sql.Types.INTEGER);\r\n");
                setStmt.append("}\r\n");    
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
        
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateWhereStmt = new StringBuilder();
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar());
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            String keySeparator = null;
            String updateSeparator = null;
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereStmt.append(" FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + " WHERE \" + \"");
                    } else {
                        keySeparator = " AND ";
                    }
                    updateWhereStmt.append(keySeparator);                    
                    updateWhereStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                } else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \"");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                }
            }
            return updateBulkSQL.toString() + updateSetStmt.toString() + updateWhereStmt.toString();            
        }        
    }
    
    public class SQLiteManager extends Manager {
        public SQLiteManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return SQLITE;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        }        
    }
    
    public class SybaseManager extends Manager {
         private String[] sybaseKeyWords= {
                 "ACCESS" ,"AUDIT","COMPRESS","DESC" , 
                "ADD","CONNECT","COUNT","DISTINCT" ,
                "ALL","BY","CREATE","DROP",
                "ALTER","CHAR","CURRENT","ELSE",
                "AND","CHECK","DATE","EXCLUSIVE",
                "ANY","CLUSTER","DECIMAL"," EXISTS",
                "AS","COLUMN","DEFAULT","FILE",
                "ASC","COMMENT","DELETE","FLOAT",
                "FOR","LONG","PCTFREE","SUCCESSFUL",
                "FROM","FALSE","MAXEXTENTS","PRIOR","SYNONYM",
                "GRANT","MINUS","PRIVILEGES","SYSDATE",
                "GROUP","MODE","PUBLIC","TABLE",
                "HAVING","MODIFY","RAW","THEN",
                "IDENTIFIED","NETWORK","RENAME","TO",
                "IMMEDIATE","NOAUDIT","RESOURCE","TRIGGER",
                "IN","NOCOMPRESS","REVOKE","UID",
                "INCREMENT","NOT","ROW","UNION",
                "INDEX","NOWAIT","ROWID","UNIQUE",
                "INITIAL","NULL","ROWNUM","UPDATE",
                "INSERT","NUMBER","ROWS","USER",
                "INTEGER","OF","SELECT","VALIDATE",
                "INTERSECT","OFFLINE","SESSION","VALUES",
                "INTO","ON","SET","VARCHAR",
                "IS","ONLINE","SHARE",
                "LEVEL","OPTION","SIZE","VIEW",
                "LIKE","OR","SMALLINT","WHENEVER",
                "LOCK","ORDER","START","WHERE","WITH"
                 
         };
        public SybaseManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return SYBASE;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }
        protected boolean isSybaseKeyword (String keyword) {
            for (int i=0 ; i < sybaseKeyWords.length ; i++){
                if (sybaseKeyWords[i].equalsIgnoreCase(keyword)) {
                    return true;
                }
            }
            return false;
        }
        protected String getLProtectedChar(String keyword) {
            if (isSybaseKeyword(keyword)){
                return "\\\"";
            }
            return getLProtectedChar();
        }
        protected String getRProtectedChar(String keyword) {
            if (isSybaseKeyword(keyword)){
                return "\\\"";
            }
            return getRProtectedChar();
        }  
        protected String setNullable(boolean nullable) {
            if(!nullable) {
                return " not null ";
            } else {
                return " null ";
            }
        }        
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateWhereStmt = new StringBuilder();
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar());
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            String keySeparator = null;
            String updateSeparator = null;
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereStmt.append(" FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + " WHERE \" + \"");
                    } else {
                        keySeparator = " AND ";
                    }
                    updateWhereStmt.append(keySeparator);                    
                    updateWhereStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                } else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \"");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                }
            }
            return updateBulkSQL.toString() + updateSetStmt.toString() + updateWhereStmt.toString();            
        }        

        /**
         * This method is added for differences between sybase and common databases on BigDecimal.
         * Reference issue is TDI-7505.
         * */
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType, String dynamic) {
            
            if(dynamic==null) {
                dynamic="";
            } else {
                dynamic+=cid;
            }
            
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.ARRAY);\r\n");                
                }
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(column.column != null && ("BINARY".equals(column.column.getType()) || "VARBINARY".equals(column.column.getType()))) {
                    setStmt.append(prefix + cid + ".setBytes(" + index + dynamic + ", null);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.OTHER);\r\n");                
                }               
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + dynamic + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + dynamic + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + dynamic + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else if(typeToGenerate.equals("BigDecimal")){
                if(column.getColumn().getPrecision()!=null && column.getColumn().getLength()!=null){
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                    setStmt.append("((com.sybase.jdbc3.jdbc.SybPreparedStatement)"+prefix + cid + ").set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() +","+column.getColumn().getLength() +","+column.getColumn().getPrecision()+ ");\r\n");
                    setStmt.append("} else {\r\n");
                    setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
                    setStmt.append("}\r\n");
                }else{
                    setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
                }
                
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + dynamic + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
    }
    
    public class TeradataManager extends Manager {
        public TeradataManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return TERADATA;
        }
        protected String getLProtectedChar() {
            return "\\\"";
        }
        protected String getRProtectedChar() {
            return "\\\"";
        } 
                
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType) {
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            String dbType = column.getColumn().getType();
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.TIMESTAMP);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if("BLOB".equals(dbType)) {
                    setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BLOB);\r\n");                    
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BINARY);\r\n");                
                }
            } else if(typeToGenerate.equals("Byte")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.TINYINT);\r\n");                
            } else if(typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.SMALLINT);\r\n");                
            } else if(typeToGenerate.equals("Long")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BIGINT);\r\n");                
            } else if(typeToGenerate.equals("Integer")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if(dbType != null && dbType.equals("CLOB")) {
                    setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CLOB);\r\n");                    
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");                
                }
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                if("BLOB".equals(dbType)) {
                    setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BLOB);\r\n");
                } else if("CLOB".equals(dbType)){
                    setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CLOB);\r\n");
                } else {
                    setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.OTHER);\r\n");                    
                }
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.TIMESTAMP);\r\n");
                setStmt.append("}\r\n");
            } else if ((typeToGenerate.equals("String")) && (dbType != null && dbType.equals("CLOB"))) {
                setStmt.append(prefix + cid + ".setAsciiStream(" + index + ", new java.io.ByteArrayInputStream(" + incomingConnName + "." + column.getName() + ".toString().getBytes()), (" + incomingConnName + "." + column.getName() + ".toString().getBytes()).length);\r\n");                
            } else if ((typeToGenerate.equals("Bytes")) && (dbType != null && dbType.equals("BLOB"))) {
                setStmt.append(prefix + cid + ".setBinaryStream(" + index + ", new java.io.ByteArrayInputStream((byte[])" + incomingConnName + "." + column.getName() + "), ((byte[])" + incomingConnName + "." + column.getName() + ").length);\r\n");    
            } else if(typeToGenerate.equals("Geometry")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                // Load geometry
                setStmt.append(
                                prefix +
                                cid +
                                ".setString(" + 
                                    index +
                                    ", ((org.talend.sdi.geometry.Geometry)(" +
                                    incomingConnName + "." + column.getName() + ")).toString()" +
                                    ");\r\n");
                // TODO : should use forceCoordinate first, then getSRID method or -1 if it's null.
                setStmt.append(
                                prefix +
                                cid +
                                ".setInt(" + 
                                    index + 
                                    " + 1, ((org.talend.sdi.geometry.Geometry)(" + 
                                    incomingConnName + "." + column.getName() + ")).getSRID()" +
                                    ");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + " + 1 , java.sql.Types.INTEGER);\r\n");
                setStmt.append("}\r\n");    
            } else {
                setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + ", " + incomingConnName + "." + column.getName() + ");\r\n");
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }
        public String getCreateTableSQL(List<Column> columnList) {
            MappingTypeRetriever mappingType = MetadataTalendType.getMappingTypeRetriever(getDBMSId());
            StringBuilder createSQL = new StringBuilder();
            
            String tableType = ElementParameterParser.getValue(node, "__CREATE_TABLE_TYPE__");
            
            createSQL.append("CREATE " + tableType + " TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "(");
            List<String> pkList = new ArrayList<String>();
            int count = 0;
            String ending = ",";
            
            for (Column column : columnList) {
                if (column.isReplaced()) {
                    List<Column> replacedColumns = column.getReplacement();
                    if (column.isKey()) {
                        for (Column replacedColumn : replacedColumns) {
                            pkList.add(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()));
                        }
                    }
                    int replacedCount = 0;
                    for (Column replacedColumn : replacedColumns) {
                        if (count == columnList.size() - 1 && replacedCount == replacedColumns.size() - 1) {
                            ending = "";
                        }
                        createSQL.append(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()) + " ");
                        createSQL.append(replacedColumn.getDataType() + ending);
                        replacedCount++;
                    }
                } else {
                    if (count == columnList.size() - 1) {
                        ending = "";
                    }
                    
                    if (column.isAddCol()) {
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        createSQL.append(column.getDataType() + ending);
                    } else if(column.isDynamic()) {
                        createSQL.append(" {TALEND_DYNAMIC_COLUMN} ").append(ending);
                    } else {
                        if (column.isKey()) {
                            pkList.add(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ));
                        }
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        String dataType = null;
                        if (column.getColumn().getType() == null || column.getColumn().getType().trim().equals("")) {
                            dataType = mappingType.getDefaultSelectedDbType(column.getColumn().getTalendType());
                        } else {
                            dataType = column.getColumn().getType();
                        }
                        if ("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {                            
                            createSQL.append(dataType.substring(0,dataType.indexOf("UNSIGNED"))) ;                            
                        }else {                            
                            createSQL.append(dataType);
                        }
                        Integer length = column.getColumn().getLength() == null ? 0 : column.getColumn().getLength();
                        Integer precision = column.getColumn().getPrecision() == null ? 0 : column.getColumn().getPrecision();
                        boolean lengthIgnored = mappingType.isLengthIgnored(getDBMSId(), dataType);
                        boolean precisionIgnored = mappingType.isPrecisionIgnored(getDBMSId(), dataType);
                        String prefix = "";
                        String suffix = "";
                        String comma = "";
                        
                        if ( ("oracle_id".equalsIgnoreCase(getDBMSId()))
                                && (("NUMBER".equalsIgnoreCase(dataType)) || ("CHAR".equalsIgnoreCase(dataType)) || ("NCHAR".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ){} 
                        else if (("mysql_id".equalsIgnoreCase(getDBMSId()))
                                && (("DECIMAL".equalsIgnoreCase(dataType)) || ("NUMERIC".equalsIgnoreCase(dataType)))
                                && (column.getColumn().getLength() == null || 0 == column.getColumn().getLength())
                                && (column.getColumn().getPrecision() == null || 0 == column.getColumn().getPrecision())
                        ) {}
                        else {
                            if (mappingType.isPreBeforeLength(getDBMSId(), dataType)) {
                                if (!precisionIgnored) {
                                    prefix = "(";
                                    suffix = ") ";
                                    createSQL.append(prefix + precision);
                                }
                                if (!lengthIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (precisionIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + length);
                                }
                                createSQL.append(suffix);
                            } else {
                                if (!lengthIgnored) {
                                    if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                    
                                    } else { 
                                        prefix = "(";
                                        suffix = ") ";
                                        createSQL.append(prefix + length);                                    
                                    }
                                }
                                if (!precisionIgnored) {
                                    prefix = (prefix.equals("") ? "(" : prefix);
                                    suffix = (suffix.equals("") ? ") " : suffix);
                                    if (lengthIgnored) {
                                        createSQL.append(prefix);
                                        comma = "";
                                    } else {
                                        comma = ",";
                                    }
                                    createSQL.append(comma + precision);
                                }
                                if (("postgres_id".equalsIgnoreCase(getDBMSId()) || "postgresplus_id".equalsIgnoreCase(getDBMSId()) ) && column.getColumn().getLength() == null) {                                
                                } else {
                                    createSQL.append(suffix);
                                }
                                if("mysql_id".equalsIgnoreCase(getDBMSId()) && dataType.endsWith("UNSIGNED")) {
                                    createSQL.append("UNSIGNED");
                                }
                            }                            
                            
                        }
                        if(column.isAutoIncrement()) {
                            createSQL.append(getAutoIncrement(column.getStartValue(), column.getStep()));
                        } else {
                            createSQL.append(setDefaultValue(column.getColumn().getDefault(), dataType));
                            createSQL.append(setNullable(column.getColumn().isNullable()));
                        }
                        
                        createSQL.append(ending);
                    }
                }
                count++;
            }
            
            if (pkList.size() > 0) {
                createSQL.append(",primary key(");
                int i = 0;
                for (String pk : pkList) {
                    createSQL.append(pk);
                    if (i != pkList.size() - 1) {
                        createSQL.append(",");
                    }
                    i++;
                }
                createSQL.append(")");
            }
            return createSQL.toString();
        }
    }
    
    public class VerticaManager extends Manager {
        public VerticaManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return VERTICA;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }
        public String getUpdateBulkSQL(List<IMetadataColumn> columnList) {
            StringBuilder updateBulkSQL = new StringBuilder();
            StringBuilder updateSetStmt = new StringBuilder();
            StringBuilder updateWhereStmt = new StringBuilder();
            updateBulkSQL.append("UPDATE " + getLProtectedChar() + "\" +  tableName_" + cid + " + \"" + getRProtectedChar());
            boolean firstKeyColumn = true;
            boolean firstUpdateColumn = true;
            String keySeparator = null;
            String updateSeparator = null;
            for(IMetadataColumn column : columnList) {
                if(column.isKey()) {
                    if(firstKeyColumn) {
                        keySeparator = "";
                        firstKeyColumn = false;
                        updateWhereStmt.append(" FROM " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + " WHERE \" + \"");
                    } else {
                        keySeparator = " AND ";
                    }
                    updateWhereStmt.append(keySeparator);                    
                    updateWhereStmt.append(getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                } else {
                    if(firstUpdateColumn) {
                        updateSeparator = "";
                        firstUpdateColumn = false;
                        updateSetStmt.append(" SET \" + \"");
                    } else {
                        updateSeparator = ", ";
                    }
                    updateSetStmt.append(updateSeparator);
                    updateSetStmt.append(getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar() + " = " + getLProtectedChar() + "\" + tmpTableName_" + cid + " + \"" + getRProtectedChar() + "." + getLProtectedChar() + "\" + \"" + column.getOriginalDbColumnName()  + "\" + \"" + getRProtectedChar());
                }
            }
            return updateBulkSQL.toString() + updateSetStmt.toString() + updateWhereStmt.toString();            
        }
        public String generateSetStmt(String typeToGenerate, Column column, int index, 
                String incomingConnName, String cid, int actionType) {
            boolean isObject = false;
            String prefix = null;
            if(actionType == NORMAL_TYPE) {
                prefix = "pstmt_";
            } else if(actionType == INSERT_TYPE) {
                prefix = "pstmtInsert_";
            } else if(actionType == UPDATE_TYPE) {
                prefix = "pstmtUpdate_";
            }
            StringBuilder setStmt = new StringBuilder();
            if(typeToGenerate.equals("Character")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");                
            } else if(typeToGenerate.equals("Date")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DATE);\r\n");                
            } else if(typeToGenerate.equals("byte[]")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.ARRAY);\r\n");                
            } else if(typeToGenerate.equals("Long") || typeToGenerate.equals("Byte") || typeToGenerate.equals("Integer") || typeToGenerate.equals("Short")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.INTEGER);\r\n");                
            } else if(typeToGenerate.equals("String")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.VARCHAR);\r\n");                
            } else if(typeToGenerate.equals("Object")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.OTHER);\r\n");                
            } else if(typeToGenerate.equals("Boolean")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.BOOLEAN);\r\n");                
            } else if(typeToGenerate.equals("Double")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DOUBLE);\r\n");                
            } else if(typeToGenerate.equals("Float")) {
                isObject = true;
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.FLOAT);\r\n");                
            }
            if(isObject) {
                setStmt.append("} else {");
            }
            typeToGenerate = getGenerateType(typeToGenerate);
            if(typeToGenerate.equals("Char") || typeToGenerate.equals("Character")) {
                if(isObject) {
                    setStmt.append("if(" + incomingConnName + "." + column.getName() + " == null) {\r\n"); 
                } else {
                    setStmt.append("if(String.valueOf(" + incomingConnName + "." + column.getName() + ").toLowerCase().equals(\"null\")) {\r\n");
                }
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.CHAR);\r\n");
                setStmt.append("} else if(" + incomingConnName + "." + column.getName() + " == '\0'){\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", \"\");\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setString(" + index + ", String.valueOf(" + incomingConnName + "." + column.getName() + "));\r\n");
                setStmt.append("}");
            } else if(typeToGenerate.equals("Date")) {
                setStmt.append("if(" + incomingConnName + "." + column.getName() + " != null) {\r\n");
                setStmt.append(prefix + cid + ".setTimestamp(" + index + ", new java.sql.Timestamp(" + incomingConnName + "." + column.getName() + ".getTime()));\r\n");
                setStmt.append("} else {\r\n");
                setStmt.append(prefix + cid + ".setNull(" + index + ", java.sql.Types.DATE);\r\n");
                setStmt.append("}\r\n");
            } else {
                if(typeToGenerate.equals("Int")) {
                    setStmt.append(prefix + cid + ".setLong(" + index + ", " + incomingConnName + "." + column.getName() + ");\r\n");
                } else {
                    setStmt.append(prefix + cid + ".set" + typeToGenerate + "(" + index + ", " + incomingConnName + "." + column.getName() + ");\r\n");                 
                }
            }
            if(isObject) {
                setStmt.append("}\r\n");
            }
            return setStmt.toString();
        }        
    }
    
    public class ODBCManager extends Manager {
        public ODBCManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return ODBC;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }        
    }
    
    public class JDBCManager extends Manager {
        String lChar = "";
        String rChar = "";
        public JDBCManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return JDBC;
        }
        protected String getLProtectedChar() {
            return lChar;
        }
        protected String getRProtectedChar() {
            return rChar;
        }        
        public void setLProtectedChar(String lChar){
            this.lChar = lChar;
        }
        public void setRProtectedChar(String rChar){
            this.rChar = rChar;
        }
    }    
    public class SAPHanaManager extends Manager {

        private String[] sapHanaReservedWords = { "ALL", "ALTER", "AS", "BEFORE", "BEGIN", "BOTH", "CASE", "CHAR", "CONDITION",
                "CONNECT", "CROSS", "CUBE", "CURRENT_CONNECTION", "CURRENT_DATE", "CURRENT_SCHEMA", "CURRENT_TIME",
                "CURRENT_TIMESTAMP", "CURRENT_USER", "CURRENT_UTCDATE", "CURRENT_UTCTIME", "CURRENT_UTCTIMESTAMP", "CURRVAL",
                "CURSOR", "DECLARE", "DISTINCT", "ELSE", "ELSEIF", "ELSIF", "END", "EXCEPT", "EXCEPTION", "EXEC", "FOR", "FROM",
                "FULL", "GROUP", "HAVING", "IF", "IN", "INNER", "INOUT", "INTERSECT", "INTO", "IS", "JOIN", "LEADING", "LEFT",
                "LIMIT", "LOOP", "MINUS", "NATURAL", "NEXTVAL", "NULL", "ON", "ORDER", "OUT", "PRIOR", "RETURN", "RETURNS",
                "REVERSE", "RIGHT", "ROLLUP", "ROWID", "SELECT", "SET", "SQL", "START", "SYSDATE", "SYSTIME", "SYSTIMESTAMP",
                "SYSUUID", "TOP", "TRAILING", "UNION", "USING", "UTCDATE", "UTCTIME", "UTCTIMESTAMP", "VALUES", "WHEN", "WHERE",
                "WHILE", "WITH" };

        public SAPHanaManager(String cid) {
            super(cid);
        }
        protected String getDBMSId() {
            return SAPHANA;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }   
        protected boolean isSapHanaReservedWords (String keyword) {
            for (int i=0 ; i < sapHanaReservedWords.length ; i++){
                if (sapHanaReservedWords[i].equalsIgnoreCase(keyword)) {
                    return true;
                }
            }
            return false;
        }
        protected String getLProtectedChar(String keyword) {
            if (isSapHanaReservedWords(keyword) || contaionsSpaces(keyword)){
                return "\\\"";
            }
            return getLProtectedChar();
        }
        protected String getRProtectedChar(String keyword) {
            return getLProtectedChar(keyword);
        }    
        protected String getTableName4Search(boolean useExistingConnection, String connection) {
            return "\""+getLProtectedChar()+ "\" + ((String)" + ElementParameterParser.getValue(node,"__TABLE__") + ")" +" + \"" + getRProtectedChar() + "\""; 
        }
        
        protected String getUserName4Search(boolean useExistingConnection, String connection) {
            if (useExistingConnection) {
                return "((String)globalMap.get(\"username_" + connection + "\")).toUpperCase()";
            } else {
                return "((String)" + ElementParameterParser.getValue(node,"__USER__") + ").toUpperCase()";
            }    
        }

        protected String getShemaName4Search(boolean useExistingConnection, String connection) {
            return "dbschema_" + cid + ".toUpperCase()"; 
        }   
        
        protected boolean hasSchema() {
            return true;
        }
        
        public String getCreateTableSQL(List<Column> columnList) {
            MappingTypeRetriever mappingType = MetadataTalendType.getMappingTypeRetriever(getDBMSId());
            StringBuilder createSQL = new StringBuilder();
            String table_type = ElementParameterParser.getValue(node,"__TABLE_TYPE__");
            createSQL.append("CREATE "+table_type+" TABLE " + getLProtectedChar() + "\" + tableName_" + cid + " + \"" + getRProtectedChar() + "(");
            List<String> pkList = new ArrayList<String>();
            int count = 0;
            String ending = ",";
            
            for (Column column : columnList) {
                if (column.isReplaced()) {
                    List<Column> replacedColumns = column.getReplacement();
                    if (column.isKey()) {
                        for (Column replacedColumn : replacedColumns) {
                            pkList.add(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()));
                        }
                    }
                    int replacedCount = 0;
                    for (Column replacedColumn : replacedColumns) {
                        if (count == columnList.size() - 1 && replacedCount == replacedColumns.size() - 1) {
                            ending = "";
                        }
                        createSQL.append(getLProtectedChar(replacedColumn.getColumnName()) + replacedColumn.getColumnName() + getRProtectedChar(replacedColumn.getColumnName()) + " ");
                        createSQL.append(replacedColumn.getDataType() + ending);
                        replacedCount++;
                    }
                } else {
                    if (count == columnList.size() - 1) {
                        ending = "";
                    }
                    
                    if (column.isAddCol()) {
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        createSQL.append(column.getDataType() + ending);
                    } else if(column.isDynamic()) {
                        createSQL.append(" {TALEND_DYNAMIC_COLUMN} ").append(ending);
                    } else {
                        if (column.isKey()) {
                            pkList.add(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ));
                        }
                        createSQL.append(getLProtectedChar( column.getColumnName() ) + column.getColumnName() + getRProtectedChar( column.getColumnName() ) + " ");
                        String dataType = null;
                        if (column.getColumn().getType() == null || column.getColumn().getType().trim().equals("")) {
                            dataType = mappingType.getDefaultSelectedDbType(column.getColumn().getTalendType());
                        } else {
                            dataType = column.getColumn().getType();
                        }
                        Integer length = column.getColumn().getLength() == null ? 0 : column.getColumn().getLength();
                        createSQL.append(dataType);
                        Integer precision = column.getColumn().getPrecision() == null ? 0 : column.getColumn().getPrecision();
                        boolean lengthIgnored = mappingType.isLengthIgnored(getDBMSId(), dataType);
                        boolean precisionIgnored = mappingType.isPrecisionIgnored(getDBMSId(), dataType);
                        String prefix = "";
                        String suffix = "";
                        String comma = "";
                        if (mappingType.isPreBeforeLength(getDBMSId(), dataType)) {
                            if (!precisionIgnored) {
                                prefix = "(";
                                suffix = ") ";
                                createSQL.append(prefix + precision);
                            }
                            if (!lengthIgnored) {
                                prefix = (prefix.equals("") ? "(" : prefix);
                                suffix = (suffix.equals("") ? ") " : suffix);
                                if (precisionIgnored) {
                                    createSQL.append(prefix);
                                    comma = "";
                                } else {
                                    comma = ",";
                                }
                                createSQL.append(comma + length);
                            }
                            createSQL.append(suffix);
                        } else {
                            if (!lengthIgnored) {
                                prefix = "(";
                                suffix = ") ";
                                createSQL.append(prefix + length);                                    
                            }
                            if (!precisionIgnored) {
                                prefix = (prefix.equals("") ? "(" : prefix);
                                suffix = (suffix.equals("") ? ") " : suffix);
                                if (lengthIgnored) {
                                    createSQL.append(prefix);
                                    comma = "";
                                } else {
                                    comma = ",";
                                }
                                createSQL.append(comma + precision);
                            }
                            createSQL.append(suffix);
                        }                            
                        if(column.isAutoIncrement()) {
                            createSQL.append(getAutoIncrement(column.getStartValue(), column.getStep()));
                        } else {
                            createSQL.append(setDefaultValue(column.getColumn().getDefault(), dataType));
                            createSQL.append(setNullable(column.getColumn().isNullable()));
                        }
                        
                        createSQL.append(ending);
                    }
                }
                count++;
            }
            
            if (pkList.size() > 0) {
                createSQL.append(",primary key(");
                int i = 0;
                for (String pk : pkList) {
                    createSQL.append(pk);
                    if (i != pkList.size() - 1) {
                        createSQL.append(",");
                    }
                    i++;
                }
                createSQL.append(")");
            }
            return createSQL.toString();
        }

    }    
    
    public class ExasolManager extends Manager{
    
		private String[] keywords = { "ABS", "ACOS", "ADD_DAYS", "ADD_HOURS",
				"ADD_MINUTES", "ADD_MONTHS", "ADD_SECONDS", "ADD_WEEKS",
				"ADD_YEARS", "ADMIN", "ALIGN", "ALWAYS", "ANALYZE", "ANSI",
				"ASCII", "ASIN", "ASSIGNMENT", "ASYMMETRIC", "ATAN", "ATAN2",
				"ATOMIC", "AUDIT", "AUTHENTICATED", "AUTO", "AVG", "BACKUP",
				"BERNOULLI", "BIT_AND", "BIT_CHECK", "BIT_LENGTH", "BIT_NOT",
				"BIT_OR", "BIT_SET", "BIT_TO_NUM", "BIT_XOR", "BREADTH",
				"CEIL", "CEILING", "CHANGE", "CHARACTERS", "CHARACTER_LENGTH",
				"CHR", "CLEAR", "COBOL", "COLOGNE_PHONETIC", "COMMENT",
				"COMMENTS", "COMMITTED", "CONCAT", "CONNECT", "CONVERT_TZ",
				"CORR", "COS", "COSH", "COT", "COUNT", "COVAR_POP",
				"COVAR_SAMP", "CREATED", "CROSS", "CURDATE", "DATABASE",
				"DATE_TRUNC", "DAYS_BETWEEN", "DECODE", "DEFAULTS", "DEGREES",
				"DELIMIT", "DELIMITER", "DENSE_RANK", "DEPTH", "DIAGNOSTICS",
				"DICTIONARY", "DISTRIBUTE", "DISTRIBUTION", "DIV", "DOWN",
				"DUMP", "EDIT_DISTANCE", "EMITS", "ENCODING", "ESTIMATE",
				"EVALUATE", "EXA", "EXCLUDE", "EXCLUDING", "EXP", "EXPRESSION",
				"FIRST_VALUE", "FLOOR", "FLUSH", "FOREIGN", "FORTRAN",
				"FROM_POSIX_TIME", "GREATEST", "GROUPING_ID", "HANDLER", "HAS",
				"HASH", "HASH_MD5", "HASH_SHA", "HASH_SHA1", "HASH_TIGER",
				"HIERARCHY", "HOURS_BETWEEN", "IDENTIFIED", "IGNORE",
				"INCLUDING", "INITIALLY", "INSTR", "INVALID", "ISOLATION",
				"IS_BOOLEAN", "IS_DATE", "IS_DSINTERVAL", "IS_NUMBER",
				"IS_TIMESTAMP", "IS_YMINTERVAL", "JAVA", "JAVASCRIPT", "KEEP",
				"KEY", "KEYS", "KILL", "LAG", "LANGUAGE", "LAST_VALUE",
				"LCASE", "LEAD", "LEAST", "LENGTH", "LINK", "LN", "LOCATE",
				"LOCK", "LOG10", "LOG2", "LOGS", "LONG", "LOWER", "LPAD",
				"LTRIM", "LUA", "MAX", "MAXIMAL", "MEDIAN", "MID", "MIN",
				"MINUTES_BETWEEN", "MONTHS_BETWEEN", "MUMPS", "NEVER", "NICE",
				"NORMALIZED", "NOW", "NULLIFZERO", "NULLS", "NUMTODSINTERVAL",
				"NUMTOYMINTERVAL", "NVL", "OCTETS", "OCTET_LENGTH", "OFFSET",
				"OPTIMIZE", "ORA", "OWNER", "PADDING", "PARTITION", "PASCAL",
				"PERCENTILE_CONT", "PERCENTILE_DISC", "PI", "PLI",
				"POSIX_TIME", "POWER", "PRECISION", "PRELOAD", "PRIMARY",
				"PRIORITY", "PRIVILEGE", "PYTHON", "QUERY_CACHE",
				"QUERY_TIMEOUT", "R", "RADIANS", "RAND", "RANK",
				"RATIO_TO_REPORT", "RECOMPRESS", "RECORD", "REGEXP_INSTR",
				"REGEXP_REPLACE", "REGEXP_SUBSTR", "REGR_AVGX", "REGR_AVGY",
				"REGR_COUNT", "REGR_INTERCEPT", "REGR_R2", "REGR_SLOPE",
				"REGR_SXX", "REGR_SXY", "REGR_SYY", "REJECT", "REORGANIZE",
				"REPEATABLE", "REVERSE", "ROLE", "ROUND", "ROWID",
				"ROW_NUMBER", "RPAD", "RTRIM", "SCALAR", "SCHEMAS", "SCHEME",
				"SECONDS_BETWEEN", "SECURE", "SERIALIZABLE", "SHUT", "SIGN",
				"SIMPLE", "SIN", "SINH", "SIZE", "SKIP", "SOUNDEX", "SQRT",
				"STATISTICS", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "ST_AREA",
				"ST_BOUNDARY", "ST_BUFFER", "ST_CENTROID", "ST_CONTAINS",
				"ST_CONVEXHULL", "ST_CROSSES", "ST_DIFFERENCE", "ST_DIMENSION",
				"ST_DISJOINT", "ST_DISTANCE", "ST_ENDPOINT", "ST_ENVELOPE",
				"ST_EQUALS", "ST_EXTERIORRING", "ST_FORCE2D", "ST_GEOMETRYN",
				"ST_GEOMETRYTYPE", "ST_INTERIORRINGN", "ST_INTERSECTION",
				"ST_INTERSECTS", "ST_ISCLOSED", "ST_ISEMPTY", "ST_ISRING",
				"ST_ISSIMPLE", "ST_LENGTH", "ST_NUMGEOMETRIES",
				"ST_NUMINTERIORRINGS", "ST_NUMPOINTS", "ST_OVERLAPS",
				"ST_POINTN", "ST_SETSRID", "ST_STARTPOINT", "ST_SYMDIFFERENCE",
				"ST_TOUCHES", "ST_TRANSFORM", "ST_UNION", "ST_WITHIN", "ST_X",
				"ST_Y", "SUBSTR", "SUM", "SYMMETRIC", "SYS_CONNECT_BY_PATH",
				"SYS_GUID", "TABLES", "TABLESAMPLE", "TAN", "TANH", "TASKS",
				"TIES", "TIME_ZONE", "TIME_ZONE_BEHAVIOR", "TO_CHAR",
				"TO_DATE", "TO_DSINTERVAL", "TO_NUMBER", "TO_TIMESTAMP",
				"TO_YMINTERVAL", "TRANSLATE", "TRUNC", "TYPE", "UCASE",
				"UNBOUNDED", "UNCOMMITTED", "UNDO", "UNICODE", "UNICODECHR",
				"UNLIMITED", "UPPER", "UTF8", "VARIANCE", "VARYING", "VAR_POP",
				"VAR_SAMP", "WEEK", "WRITE", "YEARS_BETWEEN", "ZEROIFNULL" };
				
        public ExasolManager(String cid) {
            super(cid);
        }

        protected boolean isReservedWord(String keyword) {
            for (int i=0 ; i < keywords.length ; i++){
                if (keywords[i].equalsIgnoreCase(keyword)) {
                    return true;
                }
            }
            return false;
        }

        protected String getDBMSId() {
            return EXASOL;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }
        protected String getLProtectedChar(String name) {
        	if (contaionsSpaces(name) || isReservedWord(name)) {
	            return "\\\"";
        	} else {
        		return "";
        	}
        }
        protected String getRProtectedChar(String name) {
        	if (contaionsSpaces(name) || isReservedWord(name)) {
	            return "\\\"";
        	} else {
        		return "";
        	}
        }  
    }
    public class UnDefinedManager extends Manager{
        
        private String dbmsId = "";
        
        public UnDefinedManager(String cid) {
            super(cid);
        }
        public void setDBMSId(String dbmsId){
            this.dbmsId = dbmsId;
        }
        protected String getDBMSId() {
            return this.dbmsId;
        }
        protected String getLProtectedChar() {
            return "";
        }
        protected String getRProtectedChar() {
            return "";
        }
    }
    public Manager getManager(String dbmsId, String cid) {
        Manager manager = managerMap.get(dbmsId + cid);
        if(manager == null) {
            if(dbmsId.equalsIgnoreCase(AS400)) {
                manager = new AS400Manager(cid);
            } else if(dbmsId.equalsIgnoreCase(ACCESS)) {
                manager = new AccessManager(cid);
            } else if(dbmsId.equalsIgnoreCase(DB2)) {
                manager = new DB2Manager(cid);
            } else if(dbmsId.equalsIgnoreCase(FIREBIRD)) {
                manager = new FirebirdManager(cid);
            } else if(dbmsId.equalsIgnoreCase(HSQLDB)) {
                manager = new HSQLDBManager(cid);
            } else if(dbmsId.equalsIgnoreCase(HIVE)) {
                manager = new HiveManager(cid);
            } else if(dbmsId.equalsIgnoreCase(INFORMIX)) {
                manager = new InformixManager(cid);
            } else if(dbmsId.equalsIgnoreCase(INGRES)) {
                manager = new IngresManager(cid);         
            } else if(dbmsId.equalsIgnoreCase(VECTORWISE)) {
                manager = new VectorWiseManager(cid);
            } else if(dbmsId.equalsIgnoreCase(INTERBASE)) {
                manager = new InterbaseManager(cid);
            } else if(dbmsId.equalsIgnoreCase(JAVADB)) {
                manager = new JavaDBManager(cid);
            } else if(dbmsId.equalsIgnoreCase(MAXDB)) {
                manager = new MaxDBManager(cid);
            } else if(dbmsId.equalsIgnoreCase(MSSQL)) {
                manager = new MSSQLManager(cid);
            } else if(dbmsId.equalsIgnoreCase(MYSQL)) {
                manager = new MysqlManager(cid);
            } else if(dbmsId.equalsIgnoreCase(NETEZZA)) {
                manager = new NetezzaManager(cid);
            } else if(dbmsId.equalsIgnoreCase(ORACLE)) {
                manager = new OracleManager(cid);
            } else if(dbmsId.equalsIgnoreCase(POSTGREPLUS)) {
                manager = new PostgrePlusManager(cid);
            } else if(dbmsId.equalsIgnoreCase(GREENPLUM)) {
                manager = new GreenplumManager(cid);
            } else if(dbmsId.equalsIgnoreCase(POSTGRESQL)) {
                manager = new PostgreManager(cid);
            } else if(dbmsId.equalsIgnoreCase(REDSHIFT)) {
                manager = new RedshiftManager(cid);
            } else if(dbmsId.equalsIgnoreCase(SQLITE)) {
                manager = new SQLiteManager(cid);
            } else if(dbmsId.equalsIgnoreCase(SYBASE)) {
                manager = new SybaseManager(cid);
            } else if(dbmsId.equalsIgnoreCase(TERADATA)) {
                manager = new TeradataManager(cid);
            } else if(dbmsId.equalsIgnoreCase(VERTICA)) {
                manager = new VerticaManager(cid);
            } else if(dbmsId.equalsIgnoreCase(ODBC)) {
                manager = new ODBCManager(cid);
            } else if(dbmsId.equalsIgnoreCase(JDBC)) {
                manager = new JDBCManager(cid);
            } else if(dbmsId.equalsIgnoreCase(EXASOL)) {
                manager = new ExasolManager(cid);
            } else if(dbmsId.equalsIgnoreCase(SAPHANA)) {
                manager = new SAPHanaManager(cid);
            } else {
                manager = new UnDefinedManager(cid);
                ((UnDefinedManager)manager).setDBMSId(dbmsId);
            }
        }
        managerMap.put(dbmsId + cid, manager);
        return manager;
    }
    
    
    public Manager getManager(String dbmsId, String cid, INode node) {
        Manager manager = getManager(dbmsId, cid);
        manager.setNode(node);
        return manager;
    }    
    
    public List<IMetadataColumn> getColumnList(INode node) {
        List<IMetadataColumn> columnList = null;
        List<IMetadataTable> metadatas = node.getMetadataList();
        if(metadatas != null && metadatas.size() > 0) {
            IMetadataTable metadata = metadatas.get(0);
            if(metadata != null) {
                columnList = metadata.getListColumns();
                if(metadata.isDynamicSchema() && columnList!=null) {
                    for(int i=columnList.size()-1; i>-1; i--) {
                        IMetadataColumn column = columnList.get(i);
                        if("id_Dynamic".equals(column.getTalendType())){
                            talendDynamicColumn = column;
                            break;
                        }
                    }
                }
            }
        }
        return columnList;
    }
    
    private IMetadataColumn talendDynamicColumn = null;
    
    public IMetadataColumn getDynamicColumn() {
        return talendDynamicColumn;
    }
    
    public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    
class BasicLogUtil{
    protected String cid  = "";
    protected org.talend.core.model.process.INode node = null;
    protected boolean log4jEnabled = false;
    private String logID = "";
    
    private BasicLogUtil(){}
    
    public BasicLogUtil(org.talend.core.model.process.INode node){
        this.node = node;
        String cidx = this.node.getUniqueName();
        if(cidx.matches("^.*?tAmazonAuroraOutput_\\d+_out$")){
             cidx = cidx.substring(0,cidx.length()-4);// 4 ==> "_out".length();
        }
        this.cid = cidx;
        this.log4jEnabled = ("true").equals(org.talend.core.model.process.ElementParameterParser.getValue(this.node.getProcess(), "__LOG4J_ACTIVATE__"));
        this.log4jEnabled = this.log4jEnabled &&
                            this.node.getComponent().isLog4JEnabled() && !"JOBLET".equals(node.getComponent().getComponentType().toString());
        this.logID = this.cid;
    }
    
    public String var(String varName){
        return varName + "_" + this.cid;
    }
    public String str(String content){
        return "\"" + content + "\"";
    }
    
    public void info(String... message){
        log4j("info", message);
    }
    
    public void debug(String... message){
        log4j("debug", message);
    }
    
    public void warn(String... message){
        log4j("warn", message);
    }
    
    public void error(String... message){
        log4j("error", message);
    }
    
    public void fatal(String... message){
        log4j("fatal", message);
    }
    
    public void trace(String... message){
        log4j("trace", message);
    }
    java.util.List<String> checkableList = java.util.Arrays.asList(new String[]{"info", "debug", "trace"});     
    public void log4j(String level, String... messages){
        if(this.log4jEnabled){
            if(checkableList.contains(level)){
            
    stringBuffer.append(TEXT_3);
    stringBuffer.append(level.substring(0, 1).toUpperCase() + level.substring(1));
    stringBuffer.append(TEXT_4);
    
            }
            
    stringBuffer.append(TEXT_5);
    stringBuffer.append(level);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(logID);
    stringBuffer.append(TEXT_7);
    for(String message : messages){
    stringBuffer.append(TEXT_8);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    
        }
    }
    
    public boolean isActive(){
        return this.log4jEnabled;
    }
}

class LogUtil extends BasicLogUtil{
    
    private LogUtil(){
    }
    
    public LogUtil(org.talend.core.model.process.INode node){
        super(node);
    }
    
    public void startWork(){
        debug(str("Start to work."));
    }
    
    public void endWork(){
        debug(str("Done."));
    }
    
    public void logIgnoredException(String exception){
        warn(exception);
    }
    
    public void logPrintedException(String exception){
        error(exception);
    }
    
    public void logException(String exception){
        fatal(exception);
    }
    
    public void logCompSetting(){
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_11);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_14);
    
            java.util.Set<org.talend.core.model.process.EParameterFieldType> ignoredParamsTypes = new java.util.HashSet<org.talend.core.model.process.EParameterFieldType>(); 
            ignoredParamsTypes.addAll(
                java.util.Arrays.asList(
                    org.talend.core.model.process.EParameterFieldType.SCHEMA_TYPE,
                    org.talend.core.model.process.EParameterFieldType.LABEL,
                    org.talend.core.model.process.EParameterFieldType.EXTERNAL,
                    org.talend.core.model.process.EParameterFieldType.MAPPING_TYPE,
                    org.talend.core.model.process.EParameterFieldType.IMAGE,
                    org.talend.core.model.process.EParameterFieldType.TNS_EDITOR,
                    org.talend.core.model.process.EParameterFieldType.WSDL2JAVA,
                    org.talend.core.model.process.EParameterFieldType.GENERATEGRAMMARCONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.GENERATE_SURVIVORSHIP_RULES_CONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.REFRESH_REPORTS,
                    org.talend.core.model.process.EParameterFieldType.BROWSE_REPORTS,
                    org.talend.core.model.process.EParameterFieldType.PALO_DIM_SELECTION,
                    org.talend.core.model.process.EParameterFieldType.GUESS_SCHEMA,
                    org.talend.core.model.process.EParameterFieldType.MATCH_RULE_IMEX_CONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.MEMO_PERL,
                    org.talend.core.model.process.EParameterFieldType.DBTYPE_LIST,
                    org.talend.core.model.process.EParameterFieldType.VERSION,
                    org.talend.core.model.process.EParameterFieldType.TECHNICAL,
                    org.talend.core.model.process.EParameterFieldType.ICON_SELECTION,
                    org.talend.core.model.process.EParameterFieldType.JAVA_COMMAND,
                    org.talend.core.model.process.EParameterFieldType.TREE_TABLE,
                    org.talend.core.model.process.EParameterFieldType.VALIDATION_RULE_TYPE,
                    org.talend.core.model.process.EParameterFieldType.DCSCHEMA,
                    org.talend.core.model.process.EParameterFieldType.SURVIVOR_RELATION,
                    org.talend.core.model.process.EParameterFieldType.REST_RESPONSE_SCHEMA_TYPE
                    )
            );
            for(org.talend.core.model.process.IElementParameter ep : org.talend.core.model.utils.NodeUtil.getDisplayedParameters(node)){
                if(!ep.isLog4JEnabled() || ignoredParamsTypes.contains(ep.getFieldType())){
                    continue;
                }
                String name = ep.getName();
                if(org.talend.core.model.process.EParameterFieldType.PASSWORD.equals(ep.getFieldType())){
                    String epName = "__" + name + "__";
                    String password = "";
                    if(org.talend.core.model.process.ElementParameterParser.canEncrypt(node, epName)){
                        password = org.talend.core.model.process.ElementParameterParser.getEncryptedValue(node, epName);
                    }else{
                        String passwordValue = org.talend.core.model.process.ElementParameterParser.getValue(node, epName);
                        if (passwordValue == null || "".equals(passwordValue.trim())) {// for the value which empty
                            passwordValue = "\"\"";
                        } 
                        password = "routines.system.PasswordEncryptUtil.encryptPassword(" + passwordValue + ")";
                    } 
                    
    stringBuffer.append(TEXT_15);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(password);
    stringBuffer.append(TEXT_18);
    
                }else{
                    String value = org.talend.core.model.utils.NodeUtil.getNormalizeParameterValue(node, ep);
                    
    stringBuffer.append(TEXT_19);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(value);
    stringBuffer.append(TEXT_22);
    
                }   
                
    stringBuffer.append(TEXT_23);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_24);
    
            }
        }
        debug(var("log4jParamters"));
    }
    
    //no use for now, because we log the data by rowStruct
    public void traceData(String rowStruct, java.util.List<org.talend.core.model.metadata.IMetadataColumn> columnList, String nbline){
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_25);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_26);
    
            for(org.talend.core.model.metadata.IMetadataColumn column : columnList){
                org.talend.core.model.metadata.types.JavaType javaType = org.talend.core.model.metadata.types.JavaTypesManager.getJavaTypeFromId(column.getTalendType());
                String columnName = column.getLabel();
                boolean isPrimit = org.talend.core.model.metadata.types.JavaTypesManager.isJavaPrimitiveType(column.getTalendType(), column.isNullable());
                if(isPrimit){
                
    stringBuffer.append(TEXT_27);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_30);
    
                }else{
                
    stringBuffer.append(TEXT_31);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_39);
    
                }
                
    stringBuffer.append(TEXT_40);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_41);
    
            }
        }
        trace(str("Content of the record "), nbline, str(": "), var("log4jSb"));
        
    
    }
}

class LogHelper{
    
    java.util.Map<String, String> pastDict = null;
    
    public LogHelper(){
        pastDict = new java.util.HashMap<String, String>();
        pastDict.put("insert", "inserted");
        pastDict.put("update", "updated");
        pastDict.put("delete", "deleted");
        pastDict.put("upsert", "upserted");
    }   
    
    public String upperFirstChar(String data){ 
        return data.substring(0, 1).toUpperCase() + data.substring(1);
    }
    
    public String toPastTense(String data){
        return pastDict.get(data);
    }
}
LogHelper logHelper = new LogHelper();

LogUtil log = null;

    stringBuffer.append(TEXT_42);
    
class DBConnLogUtil extends BasicLogUtil{
	
	private DBConnLogUtil(){}
	
	protected DBConnLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void logJDBCDriver(String driverClass){
		debug(str("Driver ClassName: "), driverClass, str("."));
	}
	
	public void connTry(String url, String dbUser){
		if(dbUser != null){
			debug(str("Connection attempts to '"), url, str("' with the username '"), dbUser, str("'."));
		}else{
			debug(str("Connection attempts to '"), url, str("'."));
		}
	}
	
	public void connDone(String url){
		debug(str("Connection to '"), url, str("' has succeeded."));
	}
	
	public void useExistConn(String url, String dbUser){
		if(dbUser != null){
			debug(str("Uses an existing connection with username '"), dbUser, str("'. Connection URL: "), url, str("."));
		}else{
			debug(str("Uses an existing connection. Connection URL: "), url, str("."));
		}
	}
	
	public void closeTry(String connCompID){
		if(connCompID == null){
			debug(str("Closing the connection to the database."));
		}else{
			debug(str("Closing the connection "), connCompID, str(" to the database."));
		}
	}
	
	public void closeDone(String connCompID){
		if(connCompID == null){
			debug(str("Connection to the database has closed."));	
		}else{
			debug(str("Connection "), connCompID, str(" to the database has closed."));
		}
	}
}

class DBTableActionLogUtil extends BasicLogUtil{
	private DBTableActionLogUtil(){}
	
	protected DBTableActionLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void dropTry(String tableName){
		tableActionTry(tableName, str("Dropping"));
	}
	
	public void dropDone(String tableName){
		tableActionDone(tableName, str("Drop"));
	}
	
	public void createTry(String tableName){
		tableActionTry(tableName, str("Creating"));
	}
	
	public void createDone(String tableName){
		tableActionDone(tableName, str("Create"));
	}
	
	public void clearTry(String tableName){
		tableActionTry(tableName, str("Clearing"));
	}
	
	public void clearDone(String tableName){
		tableActionDone(tableName, str("Clear"));
	}
	
	public void truncateTry(String tableName){
		tableActionTry(tableName, str("Truncating"));
	}
	
	public void truncateDone(String tableName){
		tableActionDone(tableName, str("Truncate"));
	}
	
	public void truncateReuseStorageTry(String tableName){
		tableActionTry(tableName, str("Truncating reuse storage"));
	}
	
	public void truncateReuseStorageDone(String tableName){
		tableActionDone(tableName, str("Truncate reuse stroage"));
	}
	
	private void tableActionTry(String tableName, String action){
		debug(action, str(" table '"), tableName, str("'."));
	}
	
	private void tableActionDone(String tableName, String action){
		debug(action, str(" table '"), tableName, str("' has succeeded."));
	}
}

class DBCommitLogUtil extends BasicLogUtil{
	private DBCommitLogUtil(){}
	
	protected DBCommitLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void logAutoCommit(String autoCommit){
		debug(str("Connection is set auto commit to '"), autoCommit, str("'."));
	}

	public void commitTry(String connCompID, String commitCount){
		if(commitCount == null && connCompID == null){
			debug(str("Connection starting to commit."));
		}else if(commitCount == null){
			debug(str("Connection "), connCompID, str(" starting to commit."));	
		}else if(connCompID == null){
			debug(str("Connection starting to commit "), commitCount, str(" record(s)."));
		}else{
			debug(str("Connection "), connCompID, str(" starting to commit "), commitCount, str(" record(s)."));
		}
	}
	
	public void commitDone(String connCompID){
		if(connCompID == null){
			debug(str("Connection commit has succeeded."));
		}else{
			debug(str("Connection "), connCompID, (" commit has succeeded."));
		}
	}
}

class DBBatchLogUtil extends BasicLogUtil{
	private DBBatchLogUtil(){}
	
	protected DBBatchLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void executeTry(String action){
		debug(str("Executing the "), action, str(" batch."));
	}
	
	public void executeDone(String action){
		debug(str("The "), action, str(" batch execution has succeeded."));
	}
}

class DBDataActionLogUtil extends BasicLogUtil{
	private DBDataActionLogUtil(){}
	
	protected DBDataActionLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void inserting(String nbline){
		sqlAction(nbline, str("Inserting"));
	}
	
	public void deleting(String nbline){
		sqlAction(nbline, str("Deleting"));
	}
	
	public void updating(String nbline){
		sqlAction(nbline, str("Updating"));
	}
	
	public void replacing(String nbline){
		sqlAction(nbline, str("Replacing"));
	}
	
	public void insertingOnDuplicateKeyUpdating(String nbline){
		sqlAction(nbline, str("Inserting on duplicate key updating"));
	}
	
	public void insertingIgnore(String nbline){
		sqlAction(nbline, str("Inserting ignore"));
	}
	
	private void sqlAction(String nbline, String action){
		if(nbline == null){
			debug(action, str(" the record."));
		}else{
			debug(action, str(" the record "), nbline, str("."));
		}
	}
	
	public void sqlExecuteTry(String sql){
		debug(str("Executing '"), sql, str("'."));
	}
	
	public void sqlExecuteDone(String sql){
		debug(str("Execute '"), sql, str("' has succeeded."));
	}

	public void addingToBatch(String nbline, String batchAction){
		debug(str("Adding the record "), nbline, str(" to the "), batchAction, str(" batch."));
	}
}

class DBStateLogUtil extends BasicLogUtil{
	private DBStateLogUtil(){}
	
	protected DBStateLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void logInsertedLines(String nbline){
		logFinishedLines(nbline, str("inserted"));
	}
	
	public void logUpdatedLines(String nbline){
		logFinishedLines(nbline, str("updated"));
	}
	
	public void logDeletedLines(String nbline){
		logFinishedLines(nbline, str("deleted"));
	}
	
	public void logRejectedLines(String nbline){
		logFinishedLines(nbline, str("rejected"));
	}
	
	private void logFinishedLines(String nbline, String action){
		debug(str("Has "), action, str(" "), nbline, str(" record(s)."));
	}
}	
class DBLogUtil extends LogUtil{
	DBConnLogUtil conn = null;
	DBTableActionLogUtil table = null;
	DBCommitLogUtil commit = null;
	DBBatchLogUtil batch = null;
	DBDataActionLogUtil data = null;
	DBStateLogUtil state = null;
	private DBLogUtil(){}
	
	protected DBLogUtil(org.talend.core.model.process.INode node){
		super(node);
		conn = new DBConnLogUtil(node);
    	table = new DBTableActionLogUtil(node);
    	commit = new DBCommitLogUtil(node);
    	batch = new DBBatchLogUtil(node);
    	data = new DBDataActionLogUtil(node);
    	state = new DBStateLogUtil(node);
	}
	
	public DBConnLogUtil conn(){
		return conn;
	}
	
	public DBTableActionLogUtil table(){
		return table;
	}
	
	public DBCommitLogUtil commit(){
		return commit;
	}
	
	public DBBatchLogUtil batch(){
		return batch;
	}
	
	public DBDataActionLogUtil data(){
		return data;
	}
	
	public DBStateLogUtil state(){
		return state;
	}
}
DBLogUtil dbLog = null;

    
	CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
	INode node = (INode)codeGenArgument.getArgument();
	IProcess process = node.getProcess();
	String cid = node.getUniqueName();

	dbLog = new DBLogUtil(node);

	String dataAction = ElementParameterParser.getValue(node,"__DATA_ACTION__");
	String tableAction = ElementParameterParser.getValue(node,"__TABLE_ACTION__");
	String table = ElementParameterParser.getValue(node,"__TABLE__");
	String dbVersion = "";
    String dieOnError = ElementParameterParser.getValue(node, "__DIE_ON_ERROR__");
	String tableName = ElementParameterParser.getValue(node,"__TABLE__");
	String dbmsId = ElementParameterParser.getValue(node,"__MAPPING__");
	List<Map<String, String>> addCols =
            (List<Map<String,String>>)ElementParameterParser.getObjectValue(node,"__ADD_COLS__");

    boolean useFieldOptions = ("true").equals(ElementParameterParser.getValue(node, "__USE_FIELD_OPTIONS__"));

    List<Map<String, String>> fieldOptions = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__FIELD_OPTIONS__");

    String commitEvery = ElementParameterParser.getValue(node, "__COMMIT_EVERY__");

    String useExistingConn = ElementParameterParser.getValue(node,"__USE_EXISTING_CONNECTION__");

    boolean extendedInsert = ("true").equals(ElementParameterParser.getValue(node, "__EXTENDINSERT__"));

    String numPerInsert = ElementParameterParser.getValue(node, "__NB_ROWS_PER_INSERT__");
    boolean isEnableDebug = ("true").equals(ElementParameterParser.getValue(node,"__ENABLE_DEBUG_MODE__"));

    String connection = ElementParameterParser.getValue(node,"__CONNECTION__");
    if(("true").equals(useExistingConn)) {
        List<? extends INode> nodes =  process.getNodesOfType("tAmazonMysqlConnection");
        for (INode ne:nodes) {
            if (connection.equals(ne.getUniqueName())) {
                dbVersion = ElementParameterParser.getValue(ne, "__DB_VERSION__");
            }
        }
    } else {
        dbVersion = ElementParameterParser.getValue(node, "__DB_VERSION__");
    }

	//feature:2880
    getManager(dbmsId, cid, node);
    boolean whereSupportNull = ElementParameterParser.getValue(node, "__SUPPORT_NULL_WHERE__").equals("true");

	boolean useBatchSize = ("true").equals(ElementParameterParser.getValue(node,"__USE_BATCH_SIZE__"));
	String batchSize=ElementParameterParser.getValue(node,"__BATCH_SIZE__");

	String incomingConnName = null;
	List<IMetadataColumn> columnList = getColumnList(node);

	List< ? extends IConnection> conns = node.getIncomingConnections();
	if(conns!=null && conns.size()>0){
		IConnection conn = conns.get(0);
		incomingConnName = conn.getName();
	}

	String rejectConnName = null;
	List<? extends IConnection> rejectConns = node.getOutgoingConnections("REJECT");
	if(rejectConns != null && rejectConns.size() > 0) {
	    IConnection rejectConn = rejectConns.get(0);
	    rejectConnName = rejectConn.getName();
	}

    boolean  useBatch = useBatchSize && (rejectConnName == null) && "MYSQL_5".equals(dbVersion)
                     && (
                          ("UPDATE").equals(dataAction) || ("DELETE").equals(dataAction)
                        );

	List<IMetadataColumn> rejectColumnList = null;
	IMetadataTable metadataTable = node.getMetadataFromConnector("REJECT");
	if(metadataTable != null) {
	    rejectColumnList = metadataTable.getListColumns();
	}

	List<? extends IConnection> outgoingConns = node.getOutgoingSortedConnections();
    for(IConnection conn : outgoingConns) {
        if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {

    stringBuffer.append(TEXT_43);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_44);
    
        }
    }

	Manager manager = null;
	boolean isDynamic = false;
	List<IMetadataTable> metadatas = node.getMetadataList();
	if ((metadatas!=null)&&(metadatas.size()>0)) {
		IMetadataTable metadata = metadatas.get(0);
		isDynamic = metadata.isDynamicSchema();
	}

	List<Column> stmtStructure = getManager(dbmsId, cid).createColumnList(columnList, useFieldOptions, fieldOptions, addCols);
	isDynamic = isDynamic && !getManager(dbmsId, cid).isDynamicColumnReplaced();
	IMetadataColumn talendDynCol = null;
	if(isDynamic) {
	
    stringBuffer.append(TEXT_45);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_46);
    
		///// hint options/////
boolean useHintOptions = ("true").equals(ElementParameterParser.getValue(node,"__USE_HINT_OPTIONS__"));
Map<String, String> hintsValues = null;
if (useHintOptions) {
	List<Map<String, String>> hintOptions = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__HINT_OPTIONS__");
	hintsValues = new HashMap<String, String>();
	String hintValue = null;
	boolean firstInsert = true;
	boolean firstUpdate = true;
	boolean firstDelete = true;
	boolean firstTableName = true;
	for(java.util.Map<String, String> option : hintOptions) {
		//get
		hintValue = option.get("HINT");
		//set
		if ("INSERT".equalsIgnoreCase(option.get("SQL_STMT"))){
			if(firstInsert){
				hintsValues.put("INSERT", hintValue) ;
				firstInsert = false;
			}else {
				hintsValues.put("INSERT", hintsValues.get("INSERT") + "+" + hintValue) ;
			}
		}else if ("UPDATE".equalsIgnoreCase(option.get("SQL_STMT"))) {
			if(firstUpdate){
				hintsValues.put("UPDATE", hintValue) ;
				firstUpdate = false;
			}else {
				hintsValues.put("UPDATE", hintsValues.get("UPDATE") + "+" + hintValue) ;
			}
		}else if ("DELETE".equalsIgnoreCase(option.get("SQL_STMT"))) {
			if (firstDelete){
				hintsValues.put("DELETE", hintValue) ;
				firstDelete =false;
			}else {
				hintsValues.put("DELETE", hintsValues.get("DELETE") + "+" + hintValue) ;
			}
		}
	}
}
//// hint options end ////

if(columnList != null && columnList.size() > 0) {
    
    stringBuffer.append(TEXT_47);
    
//issue 0010346 Parallelization crash with "Drop table if exists and create"
Boolean isParallelize ="true".equalsIgnoreCase(ElementParameterParser.getValue(node, "__PARALLELIZE__"));
String dbms=ElementParameterParser.getValue(node, "__MAPPING__");
boolean convertToUppercase_tableAction = "true".equalsIgnoreCase(ElementParameterParser.getValue(node, "__CONVERT_COLUMN_TABLE_TO_UPPERCASE__"));
if (!isParallelize) {
//end issue 0010346 Parallelization crash with "Drop table if exists and create"
    manager = getManager(dbmsId, cid);
    String ending="";

    if("VECTORWISE".equalsIgnoreCase(dbmsId)) {
        ending="WITH STRUCTURE = VECTORWISE";
    }

    boolean useCascade = "true".equals(ElementParameterParser.getValue(node,"__USE_CASCADE__"));
    //bugfix: TDI-31650
    boolean setQueryTimeOut = false;
    String queryTimeOutInSeconds = null;
    if(SYBASE.equalsIgnoreCase(dbmsId)){
            setQueryTimeOut = "true".equals(ElementParameterParser.getValue(node,"__SET_QUERY_TIMEOUT__"));
            queryTimeOutInSeconds = ElementParameterParser.getValue(node,"__QUERY_TIMEOUT_IN_SECONDS__");
    }

    if(!("NONE").equals(tableAction)) {
        if(("DROP_CREATE").equals(tableAction)) {
        
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_50);
    
               if(setQueryTimeOut){
                    
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_53);
    
               }
             
    dbLog.table().dropTry(dbLog.var("tableName"));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(manager.getDropTableSQL());
    stringBuffer.append(TEXT_56);
    stringBuffer.append((useCascade ? " + \" cascade\"" : ""));
    stringBuffer.append(TEXT_57);
    dbLog.table().dropDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_60);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_61);
    
               if(setQueryTimeOut){
                    
    stringBuffer.append(TEXT_62);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_63);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_64);
    
               }
             
    dbLog.table().createTry(dbLog.var("tableName"));
    
            if(isDynamic) {
                List<? extends IConnection> conns_dynamic = node.getIncomingConnections();
                if(conns_dynamic!=null && conns_dynamic.size()>0){
                    String query=manager.getCreateTableSQL(stmtStructure);
                    
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(query);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(conns_dynamic.get(0).getName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(dbms==null?"":dbms.toLowerCase());
    stringBuffer.append(TEXT_70);
    if(convertToUppercase_tableAction){
    stringBuffer.append(TEXT_71);
    }
    stringBuffer.append(TEXT_72);
    stringBuffer.append(ending);
    stringBuffer.append(TEXT_73);
    
                }
            } else {
            
    stringBuffer.append(TEXT_74);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(manager.getCreateTableSQL(stmtStructure));
    stringBuffer.append(TEXT_76);
    
            }
            
    dbLog.table().createDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_78);
    
        } else if(("CREATE").equals(tableAction)) {
        
    stringBuffer.append(TEXT_79);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_81);
    
               if(setQueryTimeOut){
                    
    stringBuffer.append(TEXT_82);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_84);
    
               }
             
    dbLog.table().createTry(dbLog.var("tableName"));
    
            if(isDynamic) {
                List<? extends IConnection> conns_dynamic = node.getIncomingConnections();
                if(conns_dynamic!=null && conns_dynamic.size()>0){
                    String query=manager.getCreateTableSQL(stmtStructure);
                    
    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(query);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(conns_dynamic.get(0).getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(dbms==null?"":dbms.toLowerCase());
    stringBuffer.append(TEXT_90);
    if(convertToUppercase_tableAction){
    stringBuffer.append(TEXT_91);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ending);
    stringBuffer.append(TEXT_93);
    
                }
            } else {
            
    stringBuffer.append(TEXT_94);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_95);
    stringBuffer.append(manager.getCreateTableSQL(stmtStructure));
    stringBuffer.append(TEXT_96);
    
            }
            
    dbLog.table().createDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_98);
    
        } else if(("CREATE_IF_NOT_EXISTS").equals(tableAction) || ("DROP_IF_EXISTS_AND_CREATE").equals(tableAction)) {
            boolean tableNameCaseSensitive=false;
            if(DB2.equalsIgnoreCase(dbmsId)||POSTGRESQL.equalsIgnoreCase(dbmsId)||GREENPLUM.equalsIgnoreCase(dbmsId)||POSTGREPLUS.equalsIgnoreCase(dbmsId)){
                tableNameCaseSensitive=true;
            }
            
    
            //to fixed: bug8422
            if((cid.equals("talendLogs_DB") || cid.equals("talendStats_DB") || cid.equals("talendMeter_DB"))){
            
    stringBuffer.append(TEXT_99);
    //bug22719: informix use independent connection, should remove this code after use shared connection
                if(INFORMIX.equalsIgnoreCase(dbmsId)){
                    String dbnameKey = ElementParameterParser.getValue(node, "__DBNAME__");
                    String dbserverKey = ElementParameterParser.getValue(node, "__DBSERVER__");
                    String dbhostKey = ElementParameterParser.getValue(node, "__HOST__");
                    String dbportKey = ElementParameterParser.getValue(node, "__PORT__");
                    String tableSchemaKey = ElementParameterParser.getValue(node,"__SCHEMA_DB__");
                    
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_101);
    stringBuffer.append(dbhostKey);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(dbportKey);
    stringBuffer.append(TEXT_103);
    stringBuffer.append(dbnameKey);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(dbserverKey);
    stringBuffer.append(TEXT_105);
    stringBuffer.append(tableSchemaKey);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_107);
    }else{
    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_111);
    }
    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_113);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_115);
    
            }
            
    
                            /*
                            case multi connection access the same db, that maybe have a locked in System table(e.g mssql).
                            so in mssql use "Select" checked the table whether exist.
                            */
                            //TODO we will use like "select" sql intead of use system table to checked table?
                            if(MSSQL.equalsIgnoreCase(dbmsId)) {
                            
    stringBuffer.append(TEXT_116);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_118);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_121);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_122);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_124);
    
                            } else if (ORACLE.equalsIgnoreCase(dbmsId) || SAPHANA.equalsIgnoreCase(dbmsId)) {
                            
    stringBuffer.append(TEXT_125);
    stringBuffer.append(manager.generateCode4TabelExist());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_127);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_128);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_129);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_130);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_131);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_133);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_134);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_135);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_137);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_139);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_140);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_141);
    
                            } else if ( SYBASE.equalsIgnoreCase(dbmsId)
                                        || INFORMIX.equalsIgnoreCase(dbmsId) ) {
                            
    stringBuffer.append(TEXT_142);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_143);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_145);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_146);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_147);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_149);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_151);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_152);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_153);
    if(!tableNameCaseSensitive){
    stringBuffer.append(TEXT_154);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_157);
    if(!tableNameCaseSensitive){
    stringBuffer.append(TEXT_158);
    }
    stringBuffer.append(TEXT_159);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_160);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_161);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_162);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_163);
    
                            } else if( DB2.equalsIgnoreCase(dbmsId) || TERADATA.equalsIgnoreCase(dbmsId)){
                            
    stringBuffer.append(TEXT_164);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_166);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_167);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_168);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_169);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_170);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_172);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_173);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_174);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_175);
    if(!tableNameCaseSensitive){
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_177);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_178);
    if(convertToUppercase_tableAction){
    stringBuffer.append(TEXT_179);
    }
    stringBuffer.append(TEXT_180);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_181);
    if(!tableNameCaseSensitive){
    stringBuffer.append(TEXT_182);
    }
    stringBuffer.append(TEXT_183);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_184);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_185);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_186);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_187);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_188);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_189);
    
                            } else if (GREENPLUM.equalsIgnoreCase(dbmsId) || POSTGRESQL.equalsIgnoreCase(dbmsId) || POSTGREPLUS.equalsIgnoreCase(dbmsId) || VERTICA.equalsIgnoreCase(dbmsId)) {
                            
    stringBuffer.append(TEXT_190);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_191);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_192);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_193);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_194);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_195);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_196);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_197);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_198);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_199);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_200);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_201);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_202);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_203);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_204);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_205);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_206);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_207);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_208);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_209);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_210);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_211);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_212);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_213);
    if(!tableNameCaseSensitive){
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_216);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_217);
    if(!tableNameCaseSensitive){
    stringBuffer.append(TEXT_218);
    }
    stringBuffer.append(TEXT_219);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_221);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_223);
    if(!tableNameCaseSensitive){
    stringBuffer.append(TEXT_224);
    }
    stringBuffer.append(TEXT_225);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_226);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_227);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_228);
    
                            } else if(EXASOL.equalsIgnoreCase(dbmsId)) {
                            
    stringBuffer.append(TEXT_229);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_230);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_231);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_232);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_233);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_234);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_235);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_236);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_237);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_238);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_239);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_240);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_241);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_242);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_243);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_244);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_245);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_246);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_247);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_248);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_249);
    
                            } else if(REDSHIFT.equalsIgnoreCase(dbmsId)) {
                            
    stringBuffer.append(TEXT_250);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_251);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_252);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_253);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_254);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_256);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_257);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_258);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_259);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_260);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_261);
    
                            } else {
                            
    stringBuffer.append(TEXT_262);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_263);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_264);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_265);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_266);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_267);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_268);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_269);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_270);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_271);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_272);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_273);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_274);
    
                            }
                            
    
                            if(("CREATE_IF_NOT_EXISTS").equals(tableAction)) {
                            
    stringBuffer.append(TEXT_275);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_276);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_277);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_278);
    
                                       if(setQueryTimeOut){
                                            
    stringBuffer.append(TEXT_279);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_280);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_281);
    
                                       }
                                     
    dbLog.table().createTry(dbLog.var("tableName"));
    
                                    if(isDynamic) {
                                        List<? extends IConnection> conns_dynamic = node.getIncomingConnections();
                                        if(conns_dynamic!=null && conns_dynamic.size()>0){
                                            String query=manager.getCreateTableSQL(stmtStructure);
                                            
    stringBuffer.append(TEXT_282);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_283);
    stringBuffer.append(query);
    stringBuffer.append(TEXT_284);
    stringBuffer.append(conns_dynamic.get(0).getName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(dbms==null?"":dbms.toLowerCase());
    stringBuffer.append(TEXT_287);
    if(convertToUppercase_tableAction){
    stringBuffer.append(TEXT_288);
    }
    stringBuffer.append(TEXT_289);
    stringBuffer.append(ending);
    stringBuffer.append(TEXT_290);
    
                                        }
                                    } else {
                                    
    stringBuffer.append(TEXT_291);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_292);
    stringBuffer.append(manager.getCreateTableSQL(stmtStructure));
    stringBuffer.append(TEXT_293);
    
                                    }
                                    
    dbLog.table().createDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_294);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_295);
    
                            } else {
                            
    stringBuffer.append(TEXT_296);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_297);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_298);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_299);
    
                                       if(setQueryTimeOut){
                                            
    stringBuffer.append(TEXT_300);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_301);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_302);
    
                                       }
                                     
    dbLog.table().dropTry(dbLog.var("tableName"));
    stringBuffer.append(TEXT_303);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_304);
    stringBuffer.append(manager.getDropTableSQL());
    stringBuffer.append(TEXT_305);
    stringBuffer.append((useCascade ? " + \" cascade\"" : ""));
    stringBuffer.append(TEXT_306);
    dbLog.table().dropDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_307);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_308);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_309);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_310);
    
                                   if(setQueryTimeOut){
                                        
    stringBuffer.append(TEXT_311);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_312);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_313);
    
                                   }
                                 
    dbLog.table().createTry(dbLog.var("tableName"));
    
                                if(isDynamic) {
                                    List<? extends IConnection> conns_dynamic = node.getIncomingConnections();
                                    if(conns_dynamic!=null && conns_dynamic.size()>0){
                                        String query=manager.getCreateTableSQL(stmtStructure);
                                        
    stringBuffer.append(TEXT_314);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_315);
    stringBuffer.append(query);
    stringBuffer.append(TEXT_316);
    stringBuffer.append(conns_dynamic.get(0).getName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(dbms==null?"":dbms.toLowerCase());
    stringBuffer.append(TEXT_319);
    if(convertToUppercase_tableAction){
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_321);
    stringBuffer.append(ending);
    stringBuffer.append(TEXT_322);
    
                                    }
                                } else {
                                
    stringBuffer.append(TEXT_323);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_324);
    stringBuffer.append(manager.getCreateTableSQL(stmtStructure));
    stringBuffer.append(TEXT_325);
    
                                }
                                
    dbLog.table().createDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_327);
    
                            }
                            
    
            //to fixed: bug8422
            if((cid.equals("talendLogs_DB") || cid.equals("talendStats_DB") || cid.equals("talendMeter_DB"))){
            
    stringBuffer.append(TEXT_328);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_329);
    
            }
            
    
        } else if(("CLEAR").equals(tableAction)) {
        
    stringBuffer.append(TEXT_330);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_331);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_332);
    
               if(setQueryTimeOut){
                    
    stringBuffer.append(TEXT_333);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_334);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_335);
    
               }
             
    dbLog.table().clearTry(dbLog.var("tableName"));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_337);
    stringBuffer.append(manager.getDeleteTableSQL());
    stringBuffer.append(TEXT_338);
    dbLog.table().clearDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_339);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_340);
    
        }else if(("TRUNCATE").equals(tableAction)) {
        
    stringBuffer.append(TEXT_341);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_342);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_343);
    
               if(setQueryTimeOut){
                    
    stringBuffer.append(TEXT_344);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_345);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_346);
    
               }
             
    stringBuffer.append(TEXT_347);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_348);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_349);
    stringBuffer.append(manager.getSelectionSQL());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_351);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_352);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_353);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_354);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_355);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_356);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_357);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_358);
    
               if(setQueryTimeOut){
                    
    stringBuffer.append(TEXT_359);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_360);
    stringBuffer.append( queryTimeOutInSeconds );
    stringBuffer.append(TEXT_361);
    
               }
             
    dbLog.table().truncateTry(dbLog.var("tableName"));
    if(DB2.equalsIgnoreCase(dbmsId)){
    stringBuffer.append(TEXT_362);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_363);
    }
    stringBuffer.append(TEXT_364);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_365);
    stringBuffer.append(manager.getTruncateTableSQL());
    stringBuffer.append(TEXT_366);
    if(INFORMIX.equalsIgnoreCase(dbmsId)){
    stringBuffer.append(TEXT_367);
    stringBuffer.append( cid );
    stringBuffer.append(TEXT_368);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_369);
    }
    dbLog.table().truncateDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_370);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_371);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_372);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_373);
    
        } else if(("TRUNCATE_REUSE_STORAGE").equals(tableAction)) {
        
    stringBuffer.append(TEXT_374);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_375);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_376);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_377);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_378);
    stringBuffer.append(manager.getSelectionSQL());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_380);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_381);
    dbLog.table().truncateReuseStorageTry(dbLog.var("tableName"));
    if(DB2.equalsIgnoreCase(dbmsId)){
    stringBuffer.append(TEXT_382);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_385);
    stringBuffer.append(manager.getTruncateReuseStroageTableSQL());
    stringBuffer.append(TEXT_386);
    dbLog.table().truncateReuseStorageDone(dbLog.var("tableName"));
    stringBuffer.append(TEXT_387);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_388);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_389);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_390);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_391);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_392);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_393);
    
        }
    }
//issue 0010346 Parallelization crash with "Drop table if exists and create"
}
//end issue 0010346 Parallelization crash with "Drop table if exists and create"

    
    Map<String, StringBuilder> actionSQLMap = getManager(dbmsId, cid).createProcessSQL(stmtStructure);
    StringBuilder insertColName = actionSQLMap.get(INSERT_COLUMN_NAME);
    StringBuilder insertValueStmt = actionSQLMap.get(INSERT_VALUE_STMT);
    StringBuilder updateSetStmt = actionSQLMap.get(UPDATE_SET_STMT);
    StringBuilder updateWhereStmt = actionSQLMap.get(UPDATE_WHERE_STMT);
    StringBuilder deleteWhereStmt = actionSQLMap.get(DELETE_WHERE_STMT);
    talendDynCol = getDynamicColumn();
    boolean supportDuplicateUpdate = "true".equalsIgnoreCase(ElementParameterParser.getValue(node,"__ON_DUPLICATE_KEY_UPDATE__"));

	if(("INSERT").equals(dataAction)) {

		if (supportDuplicateUpdate) {
			List<Map<String, String>> duplicateKeys = (List<Map<String,String>>)ElementParameterParser.getObjectValue( node,"__DUPLICATED_KEYS__" );

			if (duplicateKeys.size() > 0) {
			
    stringBuffer.append(TEXT_394);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_395);
    
				for (int i=0; i< duplicateKeys.size() ; i++) {
					if (i >0) {
					
    stringBuffer.append(TEXT_396);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_397);
    
					}
					
    stringBuffer.append(TEXT_398);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_399);
    stringBuffer.append(duplicateKeys.get(i).get("DUPLICATED_KEY"));
    stringBuffer.append(TEXT_400);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_401);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_402);
    stringBuffer.append(duplicateKeys.get(i).get("DUPLICATED_VALUE"));
    stringBuffer.append(TEXT_403);
    
				}
			}
		}

    stringBuffer.append(TEXT_404);
    
		    if(!extendedInsert) {
			List< ? extends IConnection> conns_dynamic = node.getIncomingConnections();
				if(conns_dynamic!=null && conns_dynamic.size()>0){
					IConnection conn = conns_dynamic.get(0);

					if(!("".equals(insertColName.toString()))) {

    stringBuffer.append(TEXT_405);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_406);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_407);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_411);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_414);
    					} else {

    stringBuffer.append(TEXT_415);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_416);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_417);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_420);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_422);
    
					}
				}

		        
    
				if (supportDuplicateUpdate) {

    stringBuffer.append(TEXT_423);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_424);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_425);
    
				}

    stringBuffer.append(TEXT_426);
    	   
if (useHintOptions && hintsValues.get("INSERT") != null){ 

    stringBuffer.append(TEXT_427);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_428);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_429);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_430);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_431);
    stringBuffer.append(hintsValues.get("INSERT"));
    stringBuffer.append(TEXT_432);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_433);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_434);
    }
    stringBuffer.append(TEXT_435);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_436);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_437);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_438);
    
	    } else {//extended-insert mode(begin)
	    	if ("MYSQL_4".equals(dbVersion)) {

    stringBuffer.append(TEXT_439);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_440);
    stringBuffer.append(numPerInsert);
    stringBuffer.append(TEXT_441);
    
			if(isDynamic) {
			     List< ? extends IConnection> conns_dynamic = node.getIncomingConnections();
			     if(conns_dynamic!=null && conns_dynamic.size()>0){
			     	IConnection conn = conns_dynamic.get(0);

    stringBuffer.append(TEXT_442);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_443);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_446);
    
				}
			} else {

    stringBuffer.append(TEXT_447);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_448);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_449);
    
			}

    stringBuffer.append(TEXT_450);
    stringBuffer.append(numPerInsert);
    stringBuffer.append(TEXT_451);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_452);
    
				List< ? extends IConnection> conns_dynamic = node.getIncomingConnections();
				if(conns_dynamic!=null && conns_dynamic.size()>0){
					IConnection conn = conns_dynamic.get(0);
					if(!("".equals(insertColName.toString()))) {

    stringBuffer.append(TEXT_453);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_454);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_455);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_459);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_460);
    					} else {

    stringBuffer.append(TEXT_461);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_462);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_463);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_466);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_467);
    
					}
				if (supportDuplicateUpdate) {

    stringBuffer.append(TEXT_468);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_469);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_470);
    
				}

    stringBuffer.append(TEXT_471);
    	   
if (useHintOptions && hintsValues.get("INSERT") != null){ 

    stringBuffer.append(TEXT_472);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_473);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_474);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_475);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_476);
    stringBuffer.append(hintsValues.get("INSERT"));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_478);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_479);
    }
    stringBuffer.append(TEXT_480);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_481);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_482);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_483);
    
					if(!("".equals(insertColName.toString()))) {

    stringBuffer.append(TEXT_484);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_485);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_489);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_490);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_492);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_493);
    
					} else {

    stringBuffer.append(TEXT_494);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_495);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_498);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_499);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_501);
    
					}
				}
		    if(isDynamic) {

    stringBuffer.append(TEXT_502);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_503);
    
		    } else {

    stringBuffer.append(TEXT_504);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_505);
    
		    }
		} else if ("MYSQL_5".equals(dbVersion)) {
				List< ? extends IConnection> conns_dynamic = node.getIncomingConnections();
				if(conns_dynamic!=null && conns_dynamic.size()>0){
					IConnection conn = conns_dynamic.get(0);
					if(!("".equals(insertColName.toString()))) {

    stringBuffer.append(TEXT_506);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_507);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_508);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_510);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_512);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_513);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_515);
    					} else {

    stringBuffer.append(TEXT_516);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_517);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_518);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_521);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_522);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_523);
    
					}
				}
				if (supportDuplicateUpdate) {

    stringBuffer.append(TEXT_524);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_525);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_526);
    
				}
				if(isDynamic) {

    stringBuffer.append(TEXT_527);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_528);
    stringBuffer.append(numPerInsert);
    stringBuffer.append(TEXT_529);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_530);
    
				} else {

    stringBuffer.append(TEXT_531);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_532);
    stringBuffer.append(numPerInsert);
    stringBuffer.append(TEXT_533);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_534);
    
				}

    stringBuffer.append(TEXT_535);
    	   
if (useHintOptions && hintsValues.get("INSERT") != null){ 

    stringBuffer.append(TEXT_536);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_537);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_538);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_539);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_540);
    stringBuffer.append(hintsValues.get("INSERT"));
    stringBuffer.append(TEXT_541);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_542);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_543);
    }
    stringBuffer.append(TEXT_544);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_545);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_546);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_547);
    
	       	}
	    }//extended-insert mode(end)
	} else if (("UPDATE").equals(dataAction)) {
		List< ? extends IConnection> conns_dynamic = node.getIncomingConnections();
		if(conns_dynamic!=null && conns_dynamic.size()>0){
			IConnection conn = conns_dynamic.get(0);
			if(!("".equals(updateSetStmt.toString()))) {

    stringBuffer.append(TEXT_548);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_549);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_550);
    stringBuffer.append(updateSetStmt.toString());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_552);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_554);
    stringBuffer.append(updateWhereStmt.toString());
    stringBuffer.append(TEXT_555);
    			} else {

    stringBuffer.append(TEXT_556);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_557);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_558);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_561);
    stringBuffer.append(updateWhereStmt.toString());
    stringBuffer.append(TEXT_562);
    
			}
		}
	    
    stringBuffer.append(TEXT_563);
    if (useHintOptions && hintsValues.get("UPDATE") != null){

    stringBuffer.append(TEXT_564);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_565);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_566);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_567);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_568);
    stringBuffer.append(hintsValues.get("UPDATE"));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_570);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_571);
    }
    stringBuffer.append(TEXT_572);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_573);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_574);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_575);
    
	} else if (("INSERT_OR_UPDATE").equals(dataAction)) {
			List< ? extends IConnection> conns_dynamic = node.getIncomingConnections();
			if(conns_dynamic!=null && conns_dynamic.size()>0){
				IConnection conn = conns_dynamic.get(0);

				if(!("".equals(insertColName.toString()))) {

    stringBuffer.append(TEXT_576);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_577);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_578);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_582);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_585);
    					} else {

    stringBuffer.append(TEXT_586);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_587);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_588);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_590);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_591);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_593);
    
				}
				if(!("".equals(updateSetStmt.toString()))) {

    stringBuffer.append(TEXT_594);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_595);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_596);
    stringBuffer.append(updateSetStmt.toString());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_600);
    stringBuffer.append(updateWhereStmt.toString());
    stringBuffer.append(TEXT_601);
    				} else {

    stringBuffer.append(TEXT_602);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_603);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_604);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_607);
    stringBuffer.append(updateWhereStmt.toString());
    stringBuffer.append(TEXT_608);
    
				}
			}
	    
    stringBuffer.append(TEXT_609);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_610);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_611);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_612);
    stringBuffer.append(updateWhereStmt.toString());
    stringBuffer.append(TEXT_613);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_614);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_615);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_617);
    	   
if (useHintOptions && hintsValues.get("INSERT") != null){ 

    stringBuffer.append(TEXT_618);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_619);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_620);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_621);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_622);
    stringBuffer.append(hintsValues.get("INSERT"));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_624);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_625);
    }
    stringBuffer.append(TEXT_626);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_627);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_628);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_629);
    if (useHintOptions && hintsValues.get("UPDATE") != null){

    stringBuffer.append(TEXT_630);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_631);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_632);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_633);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_634);
    stringBuffer.append(hintsValues.get("UPDATE"));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_636);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_637);
    }
    stringBuffer.append(TEXT_638);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_639);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_640);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_641);
    
	} else if (("UPDATE_OR_INSERT").equals(dataAction)) {
			List< ? extends IConnection> conns_dynamic = node.getIncomingConnections();
			if(conns_dynamic!=null && conns_dynamic.size()>0){
				IConnection conn = conns_dynamic.get(0);

				if(!("".equals(insertColName.toString()))) {

    stringBuffer.append(TEXT_642);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_643);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_644);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_645);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_648);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_651);
    					} else {

    stringBuffer.append(TEXT_652);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_653);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_654);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_657);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_659);
    
				}
				if(!("".equals(updateSetStmt.toString()))) {

    stringBuffer.append(TEXT_660);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_661);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_662);
    stringBuffer.append(updateSetStmt.toString());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_666);
    stringBuffer.append(updateWhereStmt.toString());
    stringBuffer.append(TEXT_667);
    				} else {

    stringBuffer.append(TEXT_668);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_669);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_670);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(getDynamicColumn());
    stringBuffer.append(TEXT_672);
    stringBuffer.append(dbmsId );
    stringBuffer.append(TEXT_673);
    stringBuffer.append(updateWhereStmt.toString());
    stringBuffer.append(TEXT_674);
    
				}
			}
	    
    stringBuffer.append(TEXT_675);
    if (useHintOptions && hintsValues.get("UPDATE") != null){

    stringBuffer.append(TEXT_676);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_677);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_678);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_679);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_680);
    stringBuffer.append(hintsValues.get("UPDATE"));
    stringBuffer.append(TEXT_681);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_682);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_683);
    }
    stringBuffer.append(TEXT_684);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_685);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_686);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_687);
    	   
if (useHintOptions && hintsValues.get("INSERT") != null){ 

    stringBuffer.append(TEXT_688);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_689);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_690);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_691);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_692);
    stringBuffer.append(hintsValues.get("INSERT"));
    stringBuffer.append(TEXT_693);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_694);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_695);
    }
    stringBuffer.append(TEXT_696);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_697);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_698);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_699);
    
	} else if (("DELETE").equals(dataAction)) {
	    
    stringBuffer.append(TEXT_700);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_701);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_702);
    stringBuffer.append(deleteWhereStmt.toString());
    stringBuffer.append(TEXT_703);
    if(useHintOptions && hintsValues.get("DELETE") != null) {
  
    stringBuffer.append(TEXT_704);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_705);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_706);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_707);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_708);
    stringBuffer.append(hintsValues.get("DELETE"));
    stringBuffer.append(TEXT_709);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_710);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_711);
    
  }
    stringBuffer.append(TEXT_712);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_713);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_714);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_715);
    
	} else if(("REPLACE").equals(dataAction)) {
	    
    stringBuffer.append(TEXT_716);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_717);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_718);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_721);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_722);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_723);
    
	} else if(("INSERT_ON_DUPLICATE_KEY_UPDATE").equals(dataAction)) {
	    
    stringBuffer.append(TEXT_724);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_725);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_726);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(updateSetStmt.toString());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_730);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_731);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_732);
    
	} else if(("INSERT_IGNORE").equals(dataAction)) {
	    
    stringBuffer.append(TEXT_733);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_734);
    stringBuffer.append(table);
    stringBuffer.append(TEXT_735);
    stringBuffer.append(insertColName.toString());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(insertValueStmt.toString());
    stringBuffer.append(TEXT_737);
    	   
if (useHintOptions && hintsValues.get("INSERT") != null){ 

    stringBuffer.append(TEXT_738);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_739);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_740);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_741);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_742);
    stringBuffer.append(hintsValues.get("INSERT"));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_744);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_745);
    }
    stringBuffer.append(TEXT_746);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_747);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_748);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_749);
    
	}
    if(isEnableDebug) {
        
    stringBuffer.append(TEXT_750);
    
	     if(("INSERT").equals(dataAction) || ("INSERT_IGNORE").equals(dataAction)) {

    stringBuffer.append(TEXT_751);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_752);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_753);
    
		} else if (("UPDATE").equals(dataAction)) {

    stringBuffer.append(TEXT_754);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_755);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_756);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_757);
    		
		} else if (("INSERT_OR_UPDATE").equals(dataAction) || ("UPDATE_OR_INSERT").equals(dataAction)) {

    stringBuffer.append(TEXT_758);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_759);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_760);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_761);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_762);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_763);
    
		} else if (("DELETE").equals(dataAction)) {

    stringBuffer.append(TEXT_764);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_765);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_766);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_767);
    		
		} else if (("REPLACE").equals(dataAction)) {//mysql

    stringBuffer.append(TEXT_768);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_769);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_770);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_771);
    
		} else if (("INSERT_ON_DUPLICATE_KEY_UPDATE").equals(dataAction)) {//mysql

    stringBuffer.append(TEXT_772);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_773);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_774);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_775);
    
		}else if (("INSERT_IF_NOT_EXIST").equals(dataAction)) {//MSSQL

    stringBuffer.append(TEXT_776);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_777);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_778);
    
		}

    
    }
}
	
    stringBuffer.append(TEXT_779);
    
	}


    ////////////////////////////////////////////////////////////
    List<Column> colStruct =  new ArrayList();
    for(Column colStmt : stmtStructure){
    	if(!colStmt.isReplaced() && !colStmt.isAddCol() && !colStmt.isDynamic()){
    		colStruct.add(colStmt);
    	}
    }

    class ExtendInsertOperation{
        public String generateType(String typeToGenerate){
            if(("byte[]").equals(typeToGenerate)){
                typeToGenerate = "Bytes";
            }else if(("java.util.Date").equals(typeToGenerate)){
                typeToGenerate = "Date";
            }else if(("Integer").equals(typeToGenerate)){
                typeToGenerate = "Int";
            }else if(("List").equals(typeToGenerate)){
                typeToGenerate = "Object";
            }else{
                typeToGenerate=typeToGenerate.substring(0,1).toUpperCase()+typeToGenerate.substring(1);
            }
            return typeToGenerate;
        }

        public void generateSetStmt(String typeToGenerate, Column column, String incomingConnName, String cid){
            boolean isObject = false;
            String prefix = "pstmt_";
            
    stringBuffer.append(TEXT_780);
    
            if(("Character").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_781);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_782);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(TEXT_784);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_785);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_786);
    
            }else if(("Date").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_787);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_788);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(TEXT_790);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_791);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_792);
    
            }else if(("byte[]").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_793);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_794);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(TEXT_796);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_797);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_798);
    
            }else if(("Long").equals(typeToGenerate)||("Byte").equals(typeToGenerate)||("Integer").equals(typeToGenerate)||("Short").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_799);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_800);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(TEXT_802);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_803);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_804);
    
            }else if(("String").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_805);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_806);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(TEXT_808);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_809);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_810);
    
            }else if(("Object").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_811);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_812);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(TEXT_814);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_815);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_816);
    
            }else if(("Boolean").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_817);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_818);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(TEXT_820);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_821);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_822);
    
            }else if(("Double").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_823);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_824);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(TEXT_826);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_827);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_828);
    
            }else if(("Float").equals(typeToGenerate)){
                isObject = true;
                
    stringBuffer.append(TEXT_829);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_830);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(TEXT_832);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_833);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_834);
    
            }
            if(isObject){
                
    stringBuffer.append(TEXT_835);
    
            }
            typeToGenerate = generateType(typeToGenerate);

            if(("Char").equals(typeToGenerate)||("Character").equals(typeToGenerate)){
                
    
                if(isObject) {
                    
    stringBuffer.append(TEXT_836);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_837);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_838);
    
                } else {
                    
    stringBuffer.append(TEXT_839);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_840);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_841);
    
                }
                
    stringBuffer.append(TEXT_842);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_843);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_844);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_845);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(TEXT_847);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_848);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_849);
    stringBuffer.append(TEXT_850);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_851);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_852);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_853);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_854);
    
            }else if(("Date").equals(typeToGenerate)){
                
    stringBuffer.append(TEXT_855);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_856);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_858);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_859);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_860);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_861);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_862);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_863);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_864);
    stringBuffer.append(TEXT_865);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_866);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_867);
    stringBuffer.append(TEXT_868);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_869);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_870);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_871);
    stringBuffer.append(TEXT_872);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_873);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_874);
    
            }else{
                
    stringBuffer.append(TEXT_875);
    stringBuffer.append(prefix+cid);
    stringBuffer.append(TEXT_876);
    stringBuffer.append(typeToGenerate);
    stringBuffer.append(TEXT_877);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_878);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_879);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_880);
    
            }
            if(isObject){
                
    stringBuffer.append(TEXT_881);
    
            }
        }
    }

	if(isEnableDebug) {

    stringBuffer.append(TEXT_882);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_883);
    
	}

	boolean isParallelize ="true".equalsIgnoreCase(ElementParameterParser.getValue(node, "__PARALLELIZE__"));

	if (isParallelize) { // bug0014422
		String tAsyncIn_cid = "";
		if(conns!=null && conns.size() > 0) {
			tAsyncIn_cid = conns.get(0).getSource().getUniqueName();
		}
		if(!"true".equals(useExistingConn)) {
	    	if(!("").equals(commitEvery)&&!("0").equals(commitEvery)) {

    stringBuffer.append(TEXT_884);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_885);
    stringBuffer.append(tAsyncIn_cid);
    stringBuffer.append(TEXT_886);
    
	    	}
	    }
	    if ("MYSQL_5".equals(dbVersion)) {
	    	if ((extendedInsert&&"INSERT".equals(dataAction)) || (useBatchSize&&("UPDATE".equals(dataAction)||"DELETE".equals(dataAction)))) {
			    if((!("").equals(numPerInsert)&&!("0").equals(numPerInsert))
			    	||(!("").equals(batchSize)&&!("0").equals(batchSize))) {

    stringBuffer.append(TEXT_887);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_888);
    stringBuffer.append(tAsyncIn_cid);
    stringBuffer.append(TEXT_889);
    
			    }
	    	}
    	}

    stringBuffer.append(TEXT_890);
    
	}

    if(incomingConnName != null && columnList != null){
        
    stringBuffer.append(TEXT_891);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_892);
    
        if(("INSERT").equals(dataAction)) {
            if(extendedInsert) {//extended-insert mode(begin)
            	if ("MYSQL_4".equals(dbVersion)) {
	                ExtendInsertOperation eiOperation = new ExtendInsertOperation();
	                int insertableCount = 0;
	                for(Column column : colStruct) {
	                    if(column.isInsertable()) {
	                        insertableCount++;
	                    }
	                }
			if(!isDynamic) {
	                
    stringBuffer.append(TEXT_893);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_894);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_895);
    stringBuffer.append(insertableCount);
    stringBuffer.append(TEXT_896);
    
			}
	                for(Column column : colStruct) {
	                    if(column.isInsertable()) {
	                        String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
	                        eiOperation.generateSetStmt(typeToGenerate,column,incomingConnName,cid);
	                        
    stringBuffer.append(TEXT_897);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_898);
    
	                    }
	                }
					if(isDynamic) {
						Column dynamicColumn = getColumn(getDynamicColumn());
						String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
						if("Dynamic".equals(typeToGenerate)) {
						
    stringBuffer.append(TEXT_899);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_900);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_901);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_902);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_903);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_904);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_905);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_906);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_907);
    
						}
					}
	                
    stringBuffer.append(TEXT_908);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_909);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_910);
    
	                int count =0;
	                for(Column column : colStruct) {
	                    if(column.isInsertable()) {
	                        if(count != 0) {
	                            
    stringBuffer.append(TEXT_911);
    
	                        }
	                        
    stringBuffer.append(TEXT_912);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_913);
    stringBuffer.append(column.getName());
    stringBuffer.append(TEXT_914);
    
	                        count++;
	                    }
	                }
			if(isDynamic) {
			    	Column dynamicColumn = getColumn(getDynamicColumn());
				String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
				if("Dynamic".equals(typeToGenerate)) {
				
    stringBuffer.append(TEXT_915);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_916);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_917);
    
				}
			    }
	                
    stringBuffer.append(TEXT_918);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_919);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_920);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_921);
    
			if(isDynamic) {

    stringBuffer.append(TEXT_922);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_923);
    
			}

    stringBuffer.append(TEXT_924);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_925);
    stringBuffer.append(numPerInsert);
    stringBuffer.append(TEXT_926);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_927);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_928);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_929);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_930);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_931);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_932);
    
				} else if ("MYSQL_5".equals(dbVersion)) {
	 				int counter = 1;
	                for(Column column : colStruct) {
	                    if(column.isInsertable()) {
	                        String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
	                        
    stringBuffer.append(TEXT_933);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counter, incomingConnName, cid, NORMAL_TYPE));
    stringBuffer.append(TEXT_934);
    
	                        if(isEnableDebug) {
	                            
    stringBuffer.append(TEXT_935);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_936);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counter, "insertSQLSplits_"));
    stringBuffer.append(TEXT_937);
    
	                        }
	                        counter++;
	                    }

	                }
					if(isDynamic) {
						Column dynamicColumn = getColumn(getDynamicColumn());
						String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
						if(isEnableDebug) {
						
    stringBuffer.append(TEXT_938);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_939);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_940);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(counter);
    stringBuffer.append(TEXT_942);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_943);
    
						}
						if("Dynamic".equals(typeToGenerate)) {
						
    stringBuffer.append(TEXT_944);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_945);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_947);
    stringBuffer.append(counter-1);
    stringBuffer.append(TEXT_948);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_949);
    
						}
					}

	                if(isEnableDebug) {
	                    
    stringBuffer.append(TEXT_950);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_951);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_952);
    
	                }
	                
    stringBuffer.append(TEXT_953);
    if (rejectConnName == null) { // modification one
		    		
    stringBuffer.append(TEXT_954);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_955);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_956);
    dbLog.data().addingToBatch(dbLog.var("nb_line"), dbLog.str(dataAction));
    stringBuffer.append(TEXT_957);
    
		    		  	if (!("").equals(numPerInsert ) && !("0").equals(numPerInsert )) {
		    		  	
    stringBuffer.append(TEXT_958);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_959);
    
		    		  	}
		    		  	
    stringBuffer.append(TEXT_960);
    
		    		}else {
		    		
    stringBuffer.append(TEXT_961);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_962);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_963);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_964);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_965);
    dbLog.data().inserting(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_966);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_967);
    
	                    if (("true").equals(dieOnError)) {
	                        
    stringBuffer.append(TEXT_968);
    
	                    } else {
	                        if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_970);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_971);
    
	                            for(IMetadataColumn column : columnList) {
	                             
    stringBuffer.append(TEXT_972);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_973);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_975);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_976);
    
	                            }
	                            
    stringBuffer.append(TEXT_977);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_978);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_979);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_980);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_981);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_982);
    
	                        } else {
	                        	dbLog.logPrintedException("e.getMessage()");
	                            
    stringBuffer.append(TEXT_983);
    
	                        }
	                    }
	                    
    stringBuffer.append(TEXT_984);
    
    			}
    			
    
				}
            } else {//extended-insert mode(end)
                int counter = 1;
                for(Column column : colStruct) {
                    if(column.isInsertable()) {
                        String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
                        
    stringBuffer.append(TEXT_985);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counter, incomingConnName, cid, NORMAL_TYPE));
    
                        if(isEnableDebug) {
                            
    stringBuffer.append(TEXT_986);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_987);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counter, "insertSQLSplits_"));
    stringBuffer.append(TEXT_988);
    
                        }
                        counter++;
                    }

                }

				if(isDynamic) {
					Column dynamicColumn = getColumn(getDynamicColumn());
					String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
					if(isEnableDebug) {
					
    stringBuffer.append(TEXT_989);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_990);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_991);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(counter);
    stringBuffer.append(TEXT_993);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_994);
    
					}
					if("Dynamic".equals(typeToGenerate)) {
					
    stringBuffer.append(TEXT_995);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_996);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_997);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_998);
    stringBuffer.append(counter-1);
    stringBuffer.append(TEXT_999);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_1000);
    
					}
				}
                if(isEnableDebug) {
                    
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1003);
    
                }
                
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1008);
    dbLog.data().inserting(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1010);
    
                    if (("true").equals(dieOnError)) {
                        
    stringBuffer.append(TEXT_1011);
    
                    } else {
                        if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1014);
    
                            for(IMetadataColumn column : columnList) {
                                
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1019);
    
                            }
                            
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1027);
    
                        } else {
                        	dbLog.logPrintedException("e.getMessage()");
                            
    stringBuffer.append(TEXT_1028);
    
                        }
                    }
                    
    stringBuffer.append(TEXT_1029);
    
            }
    	} else if(("UPDATE").equals(dataAction)) {
    	    int counterCol = 1;
    		for(Column column : colStruct) {
    			if(column.isUpdatable()) {
    			    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
    			    
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counterCol, incomingConnName, cid, NORMAL_TYPE));
    stringBuffer.append(TEXT_1031);
    
                    if(isEnableDebug) {
                        
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1034);
    
                    }
                    counterCol++;
    			}
    		}
			if(isDynamic) {
				Column dynamicColumn = getColumn(getDynamicColumn());
				String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
				if("Dynamic".equals(typeToGenerate)) {
					if(isEnableDebug) {
					
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(counterCol);
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1040);
    
					}
				
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(counterCol-1);
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_1047);
    
				}
			}

    		for(Column column:colStruct){
    			if(column.isUpdateKey()) {
    			    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
    			    String dbType = column.getColumn().getType();
                    
    stringBuffer.append(TEXT_1048);
    
                    //#############for feature:2880 and 6980
                    if(whereSupportNull && column.getColumn().isNullable()) {
		    	if(isDynamic){
			
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(getManager(dbmsId, cid).generateSetBooleanForNullableKeyStmt(talendDynCol.getLabel(),column, counterCol, incomingConnName, cid, NORMAL_TYPE));
    stringBuffer.append(TEXT_1050);
    
			}else{
			
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(getManager(dbmsId, cid).generateSetBooleanForNullableKeyStmt(column, counterCol, incomingConnName, cid, NORMAL_TYPE));
    stringBuffer.append(TEXT_1052);
    
			}
					if(isEnableDebug) {
						if(isDynamic){
						
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(talendDynCol.getLabel(),typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_", "(("+incomingConnName+"."+column.getName()+"==null)?1:0)"));
    stringBuffer.append(TEXT_1055);
    
						}else{
						
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_", "(("+incomingConnName+"."+column.getName()+"==null)?1:0)"));
    stringBuffer.append(TEXT_1058);
    
						}
                    }
                    	counterCol++;
                       }
                     //#############
                    
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counterCol, incomingConnName, cid, NORMAL_TYPE, " + count_"));
    stringBuffer.append(TEXT_1060);
    
                    if(isEnableDebug) {
				    if(isDynamic){
				    
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(talendDynCol.getLabel(),typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1063);
    
				    }else{
				    
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1066);
    
				    }
                    }
    			    counterCol++;
    			}
    		}
            if(isEnableDebug) {
                
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1069);
    
            }
    		
    stringBuffer.append(TEXT_1070);
    if (useBatch) { // whether use batch
    		
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1073);
    dbLog.data().addingToBatch(dbLog.var("nb_line"), dbLog.str(dataAction));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1075);
    
    		}else {
    		
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1080);
    dbLog.data().updating(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1082);
    
                if (("true").equals(dieOnError)) {
                    
    stringBuffer.append(TEXT_1083);
    
                } else {
                    if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1086);
    
                        for(IMetadataColumn column : columnList) {
                            
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1091);
    
                        }
                        
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1099);
    
                    } else {
                    	dbLog.logPrintedException("e.getMessage()");
                        
    stringBuffer.append(TEXT_1100);
    
                    }
                }
                
    stringBuffer.append(TEXT_1101);
    
            } // end whether use batch
            
    
    	} else if (("INSERT_OR_UPDATE").equals(dataAction)) {
    		int columnIndex = 1;
    		for(Column column : colStruct) {
    			if(column.isUpdateKey()) {
    			    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
    			    String dbType = column.getColumn().getType();
                    
    stringBuffer.append(TEXT_1102);
    
                    //#############for feature:2880 and 6980
                    if(whereSupportNull && column.getColumn().isNullable()) { 
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(getManager(dbmsId, cid, node).generateSetBooleanForNullableKeyStmt(column, columnIndex, incomingConnName, cid, NORMAL_TYPE));
    
                    	columnIndex++;
                       }
                     //#############
                    
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, columnIndex, incomingConnName, cid, NORMAL_TYPE));
    stringBuffer.append(TEXT_1105);
    
    			    columnIndex++;
    			}
    		}
    		
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1113);
    
    			int counterCol = 1;
    			for(Column column : colStruct) {
    				if(column.isUpdatable()) {
    				    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
    				    
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counterCol, incomingConnName, cid, UPDATE_TYPE));
    stringBuffer.append(TEXT_1115);
    
                        if(isEnableDebug) {
                            
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1118);
    
                        }
    				    counterCol++;
    				}
    			}
				if(isDynamic) {
					Column dynamicColumn = getColumn(getDynamicColumn());
					String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
					if("Dynamic".equals(typeToGenerate)) {
						if(isEnableDebug) {
						
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(counterCol);
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1124);
    
						}
						
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(counterCol-1);
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_1131);
    
					}
				}
    			for(Column column : colStruct) {
    				if(column.isUpdateKey()) {
    				    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
    				    String dbType = column.getColumn().getType();
                        
    
	                    //#############for feature:2880
	                    if(whereSupportNull && column.getColumn().isNullable()) {
			    	if(isDynamic){
				
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(getManager(dbmsId, cid).generateSetBooleanForNullableKeyStmt(talendDynCol.getLabel(),column, counterCol, incomingConnName, cid, UPDATE_TYPE));
    stringBuffer.append(TEXT_1133);
    
				}else{
				
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(getManager(dbmsId, cid).generateSetBooleanForNullableKeyStmt(column, counterCol, incomingConnName, cid, UPDATE_TYPE));
    stringBuffer.append(TEXT_1135);
    
				}
		                     if(isEnableDebug) {
	                        			if(isDynamic){
							
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(talendDynCol.getLabel(),typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_", "(("+incomingConnName+"."+column.getName()+"==null)?1:0)"));
    stringBuffer.append(TEXT_1138);
    
							}else{
							
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_", "(("+incomingConnName+"."+column.getName()+"==null)?1:0)"));
    stringBuffer.append(TEXT_1141);
    
							}
	                    	}
	                    	counterCol++;
	                       }
	                     //#############
	                    
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counterCol, incomingConnName, cid, UPDATE_TYPE, " + count_"));
    stringBuffer.append(TEXT_1143);
    
                        if(isEnableDebug) {
                            if(isDynamic){
				   		
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(talendDynCol.getLabel(),typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1146);
    
				    	}else{
				    	
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counterCol, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1149);
    
				    	}
                        }
    				    counterCol++;
    				}
    			}
                if(isEnableDebug) {
                    
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1152);
    
                }
    			
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1157);
    dbLog.data().updating(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1159);
    
                    if (("true").equals(dieOnError)) {
                        
    stringBuffer.append(TEXT_1160);
    
                    } else {
                    
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1162);
    
                        if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1165);
    
                            for(IMetadataColumn column : columnList) {
                                
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1170);
    
                            }
                            
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1178);
    
                        } else {
                        	dbLog.logPrintedException("e.getMessage()");
                            
    stringBuffer.append(TEXT_1179);
    
                        }
                    }
                    
    stringBuffer.append(TEXT_1180);
    
    			int counterInsert = 1;
    			for(Column columnInsert : colStruct)
    			{
    				if(columnInsert.isInsertable()) {
    				    String typeToGenerate = JavaTypesManager.getTypeToGenerate(columnInsert.getColumn().getTalendType(), columnInsert.getColumn().isNullable());
    				    
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, columnInsert, counterInsert, incomingConnName, cid, INSERT_TYPE));
    stringBuffer.append(TEXT_1182);
    
                        if(isEnableDebug) {
                            
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, columnInsert, incomingConnName, cid, "query_" ,  counterInsert, "insertSQLSplits_"));
    stringBuffer.append(TEXT_1185);
    
                        }
    				    counterInsert++;
    				}
    			}
				if(isDynamic) {
					Column dynamicColumn = getColumn(getDynamicColumn());
					String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
					if(isEnableDebug) {
					
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(counterInsert);
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1191);
    
					}
					if("Dynamic".equals(typeToGenerate)) {
					
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(counterInsert-1);
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_1197);
    
					}
				}
                if(isEnableDebug) {
                    
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1200);
    
                }
    			
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1205);
    dbLog.data().inserting(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1207);
    
                    if (("true").equals(dieOnError)) {
                        
    stringBuffer.append(TEXT_1208);
    
                    } else {
                    
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1210);
    
                        if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1213);
    
                            for(IMetadataColumn column : columnList) {
                                
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1218);
    
                            }
                            
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1226);
    
                        } else {
                        	dbLog.logPrintedException("e.getMessage()");
                            
    stringBuffer.append(TEXT_1227);
    
                        }
                    }
                    
    stringBuffer.append(TEXT_1228);
    
    	} else if (("UPDATE_OR_INSERT").equals(dataAction)) {
    	    
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1230);
    
    		int counterColUpdate = 1;
    		for(Column columnUpdate : colStruct) {
    			if(columnUpdate.isUpdatable()) {
    			    String typeToGenerate = JavaTypesManager.getTypeToGenerate(columnUpdate.getColumn().getTalendType(), columnUpdate.getColumn().isNullable());
    			    
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, columnUpdate, counterColUpdate, incomingConnName, cid, UPDATE_TYPE));
    stringBuffer.append(TEXT_1232);
    
                    if(isEnableDebug) {
                        
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, columnUpdate, incomingConnName, cid, "query_" , counterColUpdate, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1235);
    
                    }
    			    counterColUpdate++;
    			}
    		}
			if(isDynamic) {
				Column dynamicColumn = getColumn(getDynamicColumn());
				String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
				if("Dynamic".equals(typeToGenerate)) {
					if(isEnableDebug) {
					
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(counterColUpdate);
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1241);
    
					}
					
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(counterColUpdate-1);
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_1248);
    
				}
			}

    		for(Column columnUpdate : colStruct) {
    			if(columnUpdate.isUpdateKey()) {
    			    String typeToGenerate = JavaTypesManager.getTypeToGenerate(columnUpdate.getColumn().getTalendType(), columnUpdate.getColumn().isNullable());
    			    String dbType = columnUpdate.getColumn().getType();
                    
    stringBuffer.append(TEXT_1249);
    
                    //#############for feature:2880 and 6980
				if(whereSupportNull && columnUpdate.getColumn().isNullable()) {
					if(isDynamic){
					
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(getManager(dbmsId, cid).generateSetBooleanForNullableKeyStmt(talendDynCol.getLabel(),columnUpdate, counterColUpdate, incomingConnName, cid, UPDATE_TYPE));
    stringBuffer.append(TEXT_1251);
    
					}else{
					
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(getManager(dbmsId, cid).generateSetBooleanForNullableKeyStmt(columnUpdate, counterColUpdate, incomingConnName, cid, UPDATE_TYPE));
    stringBuffer.append(TEXT_1253);
    
					}
					if(isEnableDebug) {
						if(isDynamic){
						
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(talendDynCol.getLabel(),typeToGenerate, columnUpdate, incomingConnName, cid, "query_" , counterColUpdate, "updateSQLSplits_", "(("+incomingConnName+"."+columnUpdate.getName()+"==null)?1:0)"));
    stringBuffer.append(TEXT_1256);
    
						}else{
						
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, columnUpdate, incomingConnName, cid, "query_" , counterColUpdate, "updateSQLSplits_", "(("+incomingConnName+"."+columnUpdate.getName()+"==null)?1:0)"));
    stringBuffer.append(TEXT_1259);
    
						}
					}
					counterColUpdate++;
                       }
                     //#############
                    
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, columnUpdate, counterColUpdate, incomingConnName, cid, UPDATE_TYPE, " + count_"));
    stringBuffer.append(TEXT_1261);
    
                    if(isEnableDebug) {
                        if(isDynamic){
					
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(talendDynCol.getLabel(),typeToGenerate, columnUpdate, incomingConnName, cid, "query_" , counterColUpdate, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1264);
    
					}else{
					
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, columnUpdate, incomingConnName, cid, "query_" , counterColUpdate, "updateSQLSplits_"));
    stringBuffer.append(TEXT_1267);
    
					}
                    }
    			    counterColUpdate++;
    			}
    		}
            if(isEnableDebug) {
                
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1270);
    
            }
    		
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1277);
    
            	if(isEnableDebug) {
            	
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1279);
    
        		}
        		int counter = 1;

        		for(Column column : colStruct) {
        			if(column.isInsertable()) {
        			    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
        			    
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counter, incomingConnName, cid, INSERT_TYPE));
    stringBuffer.append(TEXT_1281);
    
                        if(isEnableDebug) {
                            
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counter, "insertSQLSplits_"));
    stringBuffer.append(TEXT_1284);
    
                        }
        			    counter++;
        			}
        		}
				if(isDynamic) {
					Column dynamicColumn = getColumn(getDynamicColumn());
					String typeToGenerate = JavaTypesManager.getTypeToGenerate(dynamicColumn.getColumn().getTalendType(), dynamicColumn.getColumn().isNullable());
					if("Dynamic".equals(typeToGenerate)) {
						if(isEnableDebug) {
	    					
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(counter);
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1290);
    
	    					}
						
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(dynamicColumn.getName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(counter-1);
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(dbmsId);
    stringBuffer.append(TEXT_1296);
    
					}
				}
                if(isEnableDebug) {
                    
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1299);
    
                }
        		
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1304);
    dbLog.data().inserting(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1306);
    dbLog.data().updating(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1308);
    
                    if (("true").equals(dieOnError)) {
                        
    stringBuffer.append(TEXT_1309);
    
                    } else {
                    
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1311);
    
                        if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1314);
    
                            for(IMetadataColumn column : columnList) {
                                
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1319);
    
                            }
                            
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1327);
    
                        } else {
                        	dbLog.logPrintedException("e.getMessage()");
                            
    stringBuffer.append(TEXT_1328);
    
                        }
                    }
                    
    stringBuffer.append(TEXT_1329);
    

    	} else if (("DELETE").equals(dataAction)) {
    	    int keyCounter = 1;
    		for(Column column : colStruct) {
    			if(column.isDeleteKey()) {
    			    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
    			    String dbType = column.getColumn().getType();
                    
    stringBuffer.append(TEXT_1330);
    
                    //#############for feature:2880 and 6980
                    if(whereSupportNull && column.getColumn().isNullable()) { 
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(getManager(dbmsId, cid, node).generateSetBooleanForNullableKeyStmt(column, keyCounter, incomingConnName, cid, NORMAL_TYPE));
    
	                    if(isEnableDebug) {
	                        
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , keyCounter, "deleteSQLSplits_", "(("+incomingConnName+"."+column.getName()+"==null)?1:0)"));
    stringBuffer.append(TEXT_1334);
    
	                    	}
                    	 keyCounter++;
                       }
                     //#############
                    
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, keyCounter, incomingConnName, cid, NORMAL_TYPE));
    stringBuffer.append(TEXT_1336);
    
                    if(isEnableDebug) {
                        
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , keyCounter, "deleteSQLSplits_"));
    stringBuffer.append(TEXT_1339);
    
                    }
    			    keyCounter++;
    			}
    		}
            if(isEnableDebug) {
                
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1342);
    
            }
        	
    stringBuffer.append(TEXT_1343);
    if (useBatch) {
    		
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1346);
    dbLog.data().addingToBatch(dbLog.var("nb_line"), dbLog.str(dataAction));
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1348);
    
    		}else {
    		
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1353);
    dbLog.data().deleting(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1355);
    
                if (("true").equals(dieOnError)) {
                    
    stringBuffer.append(TEXT_1356);
    
                } else {
                
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1358);
    
                    if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
                        
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1361);
    
                        for(IMetadataColumn column : columnList) {
                        
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1366);
    
                        }
                        
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1374);
    
                    } else {
                    	dbLog.logPrintedException("e.getMessage()");
                        
    stringBuffer.append(TEXT_1375);
    
                    }
                }
                
    stringBuffer.append(TEXT_1376);
    
            } // end whether use batch
            
    stringBuffer.append(TEXT_1377);
    
    	} else if(("REPLACE").equals(dataAction)) {
    	    int counter = 1;
            for(Column column : colStruct) {
                if(column.isInsertable()) {
                    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
                    
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counter, incomingConnName, cid, NORMAL_TYPE));
    
                    if(isEnableDebug) {
                        
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" ,  counter, "replaceSQLSplits_"));
    stringBuffer.append(TEXT_1381);
    
                    }
                    counter++;
                }

            }
            if(isEnableDebug) {
                
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1384);
    
            }
            
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1388);
    dbLog.data().replacing(null);
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1390);
    
                if (("true").equals(dieOnError)) {
                    
    stringBuffer.append(TEXT_1391);
    
                } else {
                    if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
                        
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1394);
    
                        for(IMetadataColumn column : columnList) {
                            
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1399);
    
                        }
                        
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1407);
    
                    } else {
                    	dbLog.logPrintedException("e.getMessage()");
                        
    stringBuffer.append(TEXT_1408);
    
                    }
                }
                
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1415);
    
    	} else if(("INSERT_ON_DUPLICATE_KEY_UPDATE").equals(dataAction)) {
    	    int counter = 1;
            for(Column column : colStruct) {
                if(column.isInsertable()) {
                    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
                    
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counter, incomingConnName, cid, NORMAL_TYPE));
    
                    if(isEnableDebug) {
                        
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" ,  counter, "insertIgnoreSQLSplits_"));
    stringBuffer.append(TEXT_1419);
    
                    }
                    counter++;
                }

            }
            for(Column column : colStruct) {
                if(column.isUpdatable()) {
                    String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
                    
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counter, incomingConnName, cid, NORMAL_TYPE));
    
                    if(isEnableDebug) {
                        
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" ,  counter, "insertIgnoreSQLSplits_"));
    stringBuffer.append(TEXT_1423);
    
                    }
                    counter++;
                }
            }
            if(isEnableDebug) {
                
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1426);
    
            }
            
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1430);
    dbLog.data().insertingOnDuplicateKeyUpdating(null);
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1432);
    
                if (("true").equals(dieOnError)) {
                    
    stringBuffer.append(TEXT_1433);
    
                } else {
                    if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
                        
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1436);
    
                        for(IMetadataColumn column : columnList) {
                            
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1441);
    
                        }
                        
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1449);
    
                    } else {
                    	dbLog.logPrintedException("e.getMessage()");
                        
    stringBuffer.append(TEXT_1450);
    
                    }
                }
                
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1457);
    
    	}else if(("INSERT_IGNORE").equals(dataAction)) {
    	int counter = 1;
                for(Column column : colStruct) {
                    if(column.isInsertable()) {
                        String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getColumn().getTalendType(), column.getColumn().isNullable());
                        
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(getManager(dbmsId, cid).generateSetStmt(typeToGenerate, column, counter, incomingConnName, cid, NORMAL_TYPE));
    
                        if(isEnableDebug) {
                            
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(getManager(dbmsId, cid).retrieveSQL(typeToGenerate, column, incomingConnName, cid, "query_" , counter, "insertSQLSplits_"));
    stringBuffer.append(TEXT_1461);
    
                        }
                        counter++;
                    }

                }
                if(isEnableDebug) {
                    
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1464);
    
                }
                
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1469);
    dbLog.data().insertingOnDuplicateKeyUpdating(dbLog.var("nb_line"));
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1471);
    
                    if (("true").equals(dieOnError)) {
                        
    stringBuffer.append(TEXT_1472);
    
                    } else {
                        if(rejectConnName != null && rejectColumnList != null && rejectColumnList.size() > 0) {
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(rejectConnName );
    stringBuffer.append(TEXT_1475);
    
                            for(IMetadataColumn column : columnList) {
                                
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1480);
    
                            }
                            
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(rejectConnName);
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(node.getUniqueName() );
    stringBuffer.append(TEXT_1488);
    
                        } else {
                        	dbLog.logPrintedException("e.getMessage()");
                            
    stringBuffer.append(TEXT_1489);
    
                        }
                    }
                    
    stringBuffer.append(TEXT_1490);
    
    	}

        if(outgoingConns != null && outgoingConns.size() > 0) {
            
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1492);
    
                for(IConnection outgoingConn : outgoingConns) {
                    if(rejectConnName == null || (rejectConnName != null && !outgoingConn.getName().equals(rejectConnName))) {
                        if(outgoingConn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {

                            
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(outgoingConn.getName());
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(outgoingConn.getName());
    stringBuffer.append(TEXT_1495);
    
                            for(IMetadataColumn column : columnList) {
                                
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(outgoingConn.getName());
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(incomingConnName);
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_1500);
    
                            }
                        }
                    }
                }
            
    stringBuffer.append(TEXT_1501);
    
        }
        	//////////batch execute by batch size///////
    	if (extendedInsert && "MYSQL_5".equals(dbVersion) && ("INSERT").equals(dataAction)) {
    		if(!("").equals(numPerInsert ) && !("0").equals(numPerInsert )) {
    		
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1504);
    if ( (rejectConnName==null)) {
                
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1506);
    dbLog.batch().executeTry(dbLog.str(dataAction));
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1511);
    dbLog.batch().executeDone(dbLog.str(dataAction));
    stringBuffer.append(TEXT_1512);
    if (("INSERT").equals(dataAction)) {
            	    	
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1515);
    
            	    	}
            	    	
    stringBuffer.append(TEXT_1516);
    if(("true").equals(dieOnError)) {
                	
    stringBuffer.append(TEXT_1517);
    
                	}else {
                	
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1523);
    if (("INSERT").equals(dataAction)) {
            	    
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1526);
    
	    	    	}
	    	    	
    stringBuffer.append(TEXT_1527);
    
                	dbLog.logPrintedException("e.getMessage()");
                	}
    stringBuffer.append(TEXT_1528);
    
                }
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1530);
    
    		}

    	}
    	if (useBatch) {
    		
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1535);
    dbLog.batch().executeTry(dbLog.str(dataAction));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1541);
    dbLog.batch().executeDone(dbLog.str(dataAction));
    stringBuffer.append(TEXT_1542);
    
            	    	 if (("UPDATE").equals(dataAction)) {
            	    	
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1545);
    
            	    	}else if (("DELETE").equals(dataAction)) {
            	    	
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1548);
    
            	    	}
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1550);
    if(("true").equals(dieOnError)) {
                	
    stringBuffer.append(TEXT_1551);
    
                	}else {
                	
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1557);
    if (("UPDATE").equals(dataAction)) {
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1560);
     }else if (("DELETE").equals(dataAction)) {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1563);
    }
    stringBuffer.append(TEXT_1564);
    
                	dbLog.logPrintedException("e.getMessage()");
                	}
    stringBuffer.append(TEXT_1565);
    
    	}
    	////////////commit every////////////
    	if(!("true").equals(useExistingConn)) {
    		if(!("").equals(commitEvery) && !("0").equals(commitEvery)) {
    		    
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1569);
    
                boolean extendedInsertByBatch = extendedInsert && "MYSQL_5".equals(dbVersion) && "INSERT".equals(dataAction);
                if (useBatch || extendedInsertByBatch) {
                
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1573);
    dbLog.batch().executeTry(dbLog.str(dataAction));
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(("INSERT").equals(dataAction)? "1" : "countEach_" +cid);
    stringBuffer.append(TEXT_1579);
    dbLog.batch().executeDone(dbLog.str(dataAction));
    stringBuffer.append(TEXT_1580);
    if (("INSERT").equals(dataAction)) {
            	    	
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1583);
    
            	    	}else if (("UPDATE").equals(dataAction)) {
            	    	
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1586);
    
            	    	}else if (("DELETE").equals(dataAction)) {
            	    	
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1589);
    
            	    	}
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1591);
    if(("true").equals(dieOnError)) {
                	
    stringBuffer.append(TEXT_1592);
    
                	}else {
                	
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1598);
    if (("INSERT").equals(dataAction)) {
        	    	
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1601);
    
        	    	}else if (("UPDATE").equals(dataAction)) {
        	    	
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1604);
    
        	    	}else if (("DELETE").equals(dataAction)) {
        	    	
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1607);
    
        	    	}
    stringBuffer.append(TEXT_1608);
    
                	dbLog.logPrintedException("e.getMessage()");
                	}
    stringBuffer.append(TEXT_1609);
    
                }
                
    stringBuffer.append(TEXT_1610);
    dbLog.commit().commitTry(null, dbLog.var("commitCounter"));
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1612);
    dbLog.commit().commitDone(null);
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_1614);
    
    		}
    	}
    }

    stringBuffer.append(TEXT_1615);
    return stringBuffer.toString();
  }
}
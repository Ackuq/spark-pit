// Generated from /Users/axel/Projects/spark-pit/scala/src/main/antlr4/org/apache/spark/sql/catalyst/parser/SqlBase.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, DISTINCT=15, WHERE=16, GROUP=17, 
		BY=18, GROUPING=19, SETS=20, CUBE=21, ROLLUP=22, ORDER=23, HAVING=24, 
		LIMIT=25, AT=26, OR=27, AND=28, IN=29, NOT=30, NO=31, EXISTS=32, BETWEEN=33, 
		LIKE=34, RLIKE=35, IS=36, NULL=37, TRUE=38, FALSE=39, NULLS=40, ASC=41, 
		DESC=42, FOR=43, INTERVAL=44, CASE=45, WHEN=46, THEN=47, ELSE=48, END=49, 
		JOIN=50, CROSS=51, OUTER=52, INNER=53, LEFT=54, SEMI=55, RIGHT=56, FULL=57, 
		NATURAL=58, ON=59, LATERAL=60, WINDOW=61, OVER=62, PARTITION=63, RANGE=64, 
		ROWS=65, UNBOUNDED=66, PRECEDING=67, FOLLOWING=68, CURRENT=69, FIRST=70, 
		AFTER=71, LAST=72, ROW=73, WITH=74, VALUES=75, CREATE=76, TABLE=77, DIRECTORY=78, 
		VIEW=79, REPLACE=80, INSERT=81, DELETE=82, INTO=83, DESCRIBE=84, EXPLAIN=85, 
		FORMAT=86, LOGICAL=87, CODEGEN=88, COST=89, CAST=90, SHOW=91, TABLES=92, 
		COLUMNS=93, COLUMN=94, USE=95, PARTITIONS=96, FUNCTIONS=97, DROP=98, UNION=99, 
		EXCEPT=100, SETMINUS=101, INTERSECT=102, TO=103, TABLESAMPLE=104, STRATIFY=105, 
		ALTER=106, RENAME=107, ARRAY=108, MAP=109, STRUCT=110, COMMENT=111, SET=112, 
		RESET=113, DATA=114, START=115, TRANSACTION=116, COMMIT=117, ROLLBACK=118, 
		MACRO=119, IGNORE=120, BOTH=121, LEADING=122, TRAILING=123, PIT=124, ASOF=125, 
		IF=126, POSITION=127, EQ=128, NSEQ=129, NEQ=130, NEQJ=131, LT=132, LTE=133, 
		GT=134, GTE=135, PLUS=136, MINUS=137, ASTERISK=138, SLASH=139, PERCENT=140, 
		DIV=141, TILDE=142, AMPERSAND=143, PIPE=144, CONCAT_PIPE=145, HAT=146, 
		PERCENTLIT=147, BUCKET=148, OUT=149, OF=150, SORT=151, CLUSTER=152, DISTRIBUTE=153, 
		OVERWRITE=154, TRANSFORM=155, REDUCE=156, USING=157, SERDE=158, SERDEPROPERTIES=159, 
		RECORDREADER=160, RECORDWRITER=161, DELIMITED=162, FIELDS=163, TERMINATED=164, 
		COLLECTION=165, ITEMS=166, KEYS=167, ESCAPED=168, LINES=169, SEPARATED=170, 
		FUNCTION=171, EXTENDED=172, REFRESH=173, CLEAR=174, CACHE=175, UNCACHE=176, 
		LAZY=177, FORMATTED=178, GLOBAL=179, TEMPORARY=180, OPTIONS=181, UNSET=182, 
		TBLPROPERTIES=183, DBPROPERTIES=184, BUCKETS=185, SKEWED=186, STORED=187, 
		DIRECTORIES=188, LOCATION=189, EXCHANGE=190, ARCHIVE=191, UNARCHIVE=192, 
		FILEFORMAT=193, TOUCH=194, COMPACT=195, CONCATENATE=196, CHANGE=197, CASCADE=198, 
		RESTRICT=199, CLUSTERED=200, SORTED=201, PURGE=202, INPUTFORMAT=203, OUTPUTFORMAT=204, 
		DATABASE=205, DATABASES=206, DFS=207, TRUNCATE=208, ANALYZE=209, COMPUTE=210, 
		LIST=211, STATISTICS=212, PARTITIONED=213, EXTERNAL=214, DEFINED=215, 
		REVOKE=216, GRANT=217, LOCK=218, UNLOCK=219, MSCK=220, REPAIR=221, RECOVER=222, 
		EXPORT=223, IMPORT=224, LOAD=225, ROLE=226, ROLES=227, COMPACTIONS=228, 
		PRINCIPALS=229, TRANSACTIONS=230, INDEX=231, INDEXES=232, LOCKS=233, OPTION=234, 
		ANTI=235, LOCAL=236, INPATH=237, CURRENT_DATE=238, CURRENT_TIMESTAMP=239, 
		STRING=240, BIGINT_LITERAL=241, SMALLINT_LITERAL=242, TINYINT_LITERAL=243, 
		BYTELENGTH_LITERAL=244, INTEGER_VALUE=245, DECIMAL_VALUE=246, DOUBLE_LITERAL=247, 
		BIGDECIMAL_LITERAL=248, IDENTIFIER=249, BACKQUOTED_IDENTIFIER=250, SIMPLE_COMMENT=251, 
		BRACKETED_EMPTY_COMMENT=252, BRACKETED_COMMENT=253, WS=254, UNRECOGNIZED=255, 
		DELIMITER=256;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_unsupportedHiveNativeCommands = 7, RULE_createTableHeader = 8, 
		RULE_bucketSpec = 9, RULE_skewSpec = 10, RULE_locationSpec = 11, RULE_query = 12, 
		RULE_insertInto = 13, RULE_partitionSpecLocation = 14, RULE_partitionSpec = 15, 
		RULE_partitionVal = 16, RULE_describeFuncName = 17, RULE_describeColName = 18, 
		RULE_ctes = 19, RULE_namedQuery = 20, RULE_tableProvider = 21, RULE_tablePropertyList = 22, 
		RULE_tableProperty = 23, RULE_tablePropertyKey = 24, RULE_tablePropertyValue = 25, 
		RULE_constantList = 26, RULE_nestedConstantList = 27, RULE_createFileFormat = 28, 
		RULE_fileFormat = 29, RULE_storageHandler = 30, RULE_resource = 31, RULE_queryNoWith = 32, 
		RULE_queryOrganization = 33, RULE_multiInsertQueryBody = 34, RULE_queryTerm = 35, 
		RULE_queryPrimary = 36, RULE_sortItem = 37, RULE_querySpecification = 38, 
		RULE_hint = 39, RULE_hintStatement = 40, RULE_fromClause = 41, RULE_aggregation = 42, 
		RULE_groupingSet = 43, RULE_lateralView = 44, RULE_setQuantifier = 45, 
		RULE_relation = 46, RULE_joinRelation = 47, RULE_joinType = 48, RULE_joinCriteria = 49, 
		RULE_sample = 50, RULE_identifierList = 51, RULE_identifierSeq = 52, RULE_orderedIdentifierList = 53, 
		RULE_orderedIdentifier = 54, RULE_identifierCommentList = 55, RULE_identifierComment = 56, 
		RULE_relationPrimary = 57, RULE_inlineTable = 58, RULE_functionTable = 59, 
		RULE_tableAlias = 60, RULE_rowFormat = 61, RULE_tableIdentifier = 62, 
		RULE_functionIdentifier = 63, RULE_namedExpression = 64, RULE_namedExpressionSeq = 65, 
		RULE_expression = 66, RULE_booleanExpression = 67, RULE_predicated = 68, 
		RULE_predicate = 69, RULE_valueExpression = 70, RULE_primaryExpression = 71, 
		RULE_constant = 72, RULE_comparisonOperator = 73, RULE_arithmeticOperator = 74, 
		RULE_predicateOperator = 75, RULE_booleanValue = 76, RULE_interval = 77, 
		RULE_intervalField = 78, RULE_intervalValue = 79, RULE_colPosition = 80, 
		RULE_dataType = 81, RULE_colTypeList = 82, RULE_colType = 83, RULE_complexColTypeList = 84, 
		RULE_complexColType = 85, RULE_whenClause = 86, RULE_windows = 87, RULE_namedWindow = 88, 
		RULE_windowSpec = 89, RULE_windowFrame = 90, RULE_frameBound = 91, RULE_qualifiedName = 92, 
		RULE_identifier = 93, RULE_strictIdentifier = 94, RULE_quotedIdentifier = 95, 
		RULE_number = 96, RULE_nonReserved = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
			"singleDataType", "singleTableSchema", "statement", "unsupportedHiveNativeCommands", 
			"createTableHeader", "bucketSpec", "skewSpec", "locationSpec", "query", 
			"insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
			"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
			"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
			"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
			"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
			"hintStatement", "fromClause", "aggregation", "groupingSet", "lateralView", 
			"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
			"sample", "identifierList", "identifierSeq", "orderedIdentifierList", 
			"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
			"inlineTable", "functionTable", "tableAlias", "rowFormat", "tableIdentifier", 
			"functionIdentifier", "namedExpression", "namedExpressionSeq", "expression", 
			"booleanExpression", "predicated", "predicate", "valueExpression", "primaryExpression", 
			"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
			"booleanValue", "interval", "intervalField", "intervalValue", "colPosition", 
			"dataType", "colTypeList", "colType", "complexColTypeList", "complexColType", 
			"whenClause", "windows", "namedWindow", "windowSpec", "windowFrame", 
			"frameBound", "qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
			"number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'['", "']'", "':'", 
			"'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", 
			"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
			"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
			"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", 
			"'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", 
			"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
			"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
			"'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", 
			"'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", 
			"'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", 
			"'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", 
			"'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", 
			"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
			"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
			"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
			"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
			"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", 
			"'LEADING'", "'TRAILING'", "'PIT'", "'ASOF'", "'IF'", "'POSITION'", null, 
			"'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", 
			"'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
			"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
			"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
			"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
			"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
			"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
			"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
			"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
			"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
			null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
			"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
			"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
			"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
			"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
			"'LOCAL'", "'INPATH'", "'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", null, 
			null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", 
			"SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", 
			"IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", 
			"TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", 
			"THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", 
			"RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION", 
			"RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", 
			"AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "DIRECTORY", 
			"VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", 
			"FORMAT", "LOGICAL", "CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", 
			"COLUMN", "USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", 
			"SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", 
			"ARRAY", "MAP", "STRUCT", "COMMENT", "SET", "RESET", "DATA", "START", 
			"TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IGNORE", "BOTH", "LEADING", 
			"TRAILING", "PIT", "ASOF", "IF", "POSITION", "EQ", "NSEQ", "NEQ", "NEQJ", 
			"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", 
			"BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", 
			"TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", 
			"RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", "ITEMS", 
			"KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", 
			"CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", 
			"OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", "SKEWED", 
			"STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", "ARCHIVE", "UNARCHIVE", 
			"FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", "CHANGE", "CASCADE", 
			"RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", "OUTPUTFORMAT", 
			"DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", "COMPUTE", "LIST", 
			"STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", "REVOKE", "GRANT", 
			"LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", "IMPORT", "LOAD", 
			"ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", "INDEX", 
			"INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "CURRENT_DATE", 
			"CURRENT_TIMESTAMP", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "BYTELENGTH_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
			"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			statement();
			setState(197);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			namedExpression();
			setState(200);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			tableIdentifier();
			setState(203);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			functionIdentifier();
			setState(206);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			dataType();
			setState(209);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			colTypeList();
			setState(212);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public SkewSpecContext skewSpec() {
			return getRuleContext(SkewSpecContext.class,0);
		}
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(USE);
				setState(216);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(CREATE);
				setState(218);
				match(DATABASE);
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(219);
					match(IF);
					setState(220);
					match(NOT);
					setState(221);
					match(EXISTS);
					}
					break;
				}
				setState(224);
				identifier();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(225);
					match(COMMENT);
					setState(226);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(229);
					locationSpec();
					}
				}

				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(232);
					match(WITH);
					setState(233);
					match(DBPROPERTIES);
					setState(234);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(ALTER);
				setState(238);
				match(DATABASE);
				setState(239);
				identifier();
				setState(240);
				match(SET);
				setState(241);
				match(DBPROPERTIES);
				setState(242);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(DROP);
				setState(245);
				match(DATABASE);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(246);
					match(IF);
					setState(247);
					match(EXISTS);
					}
					break;
				}
				setState(250);
				identifier();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(251);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				createTableHeader();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(255);
					match(T__0);
					setState(256);
					colTypeList();
					setState(257);
					match(T__1);
					}
				}

				setState(261);
				tableProvider();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(262);
					match(OPTIONS);
					setState(263);
					((CreateTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(266);
					match(PARTITIONED);
					setState(267);
					match(BY);
					setState(268);
					((CreateTableContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(271);
					bucketSpec();
					}
				}

				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(274);
					locationSpec();
					}
				}

				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(277);
					match(COMMENT);
					setState(278);
					((CreateTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(281);
					match(TBLPROPERTIES);
					setState(282);
					((CreateTableContext)_localctx).tableProps = tablePropertyList();
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(285);
						match(AS);
						}
					}

					setState(288);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				createTableHeader();
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(292);
					match(T__0);
					setState(293);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(294);
					match(T__1);
					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(298);
					match(COMMENT);
					setState(299);
					((CreateHiveTableContext)_localctx).comment = match(STRING);
					}
				}

				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(302);
					match(PARTITIONED);
					setState(303);
					match(BY);
					setState(304);
					match(T__0);
					setState(305);
					((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
					setState(306);
					match(T__1);
					}
				}

				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(310);
					bucketSpec();
					}
				}

				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SKEWED) {
					{
					setState(313);
					skewSpec();
					}
				}

				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(316);
					rowFormat();
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(319);
					createFileFormat();
					}
				}

				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(322);
					locationSpec();
					}
				}

				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(325);
					match(TBLPROPERTIES);
					setState(326);
					tablePropertyList();
					}
				}

				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(329);
						match(AS);
						}
					}

					setState(332);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(335);
				match(CREATE);
				setState(336);
				match(TABLE);
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(337);
					match(IF);
					setState(338);
					match(NOT);
					setState(339);
					match(EXISTS);
					}
					break;
				}
				setState(342);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(343);
				match(LIKE);
				setState(344);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(345);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(348);
				match(ANALYZE);
				setState(349);
				match(TABLE);
				setState(350);
				tableIdentifier();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(351);
					partitionSpec();
					}
				}

				setState(354);
				match(COMPUTE);
				setState(355);
				match(STATISTICS);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(356);
					identifier();
					}
					break;
				case 2:
					{
					setState(357);
					match(FOR);
					setState(358);
					match(COLUMNS);
					setState(359);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(362);
				match(ALTER);
				setState(363);
				match(TABLE);
				setState(364);
				tableIdentifier();
				setState(365);
				match(ADD);
				setState(366);
				match(COLUMNS);
				setState(367);
				match(T__0);
				setState(368);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(369);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(371);
				match(ALTER);
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(374);
				match(RENAME);
				setState(375);
				match(TO);
				setState(376);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(378);
				match(ALTER);
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				tableIdentifier();
				setState(381);
				match(SET);
				setState(382);
				match(TBLPROPERTIES);
				setState(383);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(385);
				match(ALTER);
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(387);
				tableIdentifier();
				setState(388);
				match(UNSET);
				setState(389);
				match(TBLPROPERTIES);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(390);
					match(IF);
					setState(391);
					match(EXISTS);
					}
				}

				setState(394);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(396);
				match(ALTER);
				setState(397);
				match(TABLE);
				setState(398);
				tableIdentifier();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(399);
					partitionSpec();
					}
				}

				setState(402);
				match(CHANGE);
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(403);
					match(COLUMN);
					}
					break;
				}
				setState(406);
				identifier();
				setState(407);
				colType();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(408);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(411);
				match(ALTER);
				setState(412);
				match(TABLE);
				setState(413);
				tableIdentifier();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(414);
					partitionSpec();
					}
				}

				setState(417);
				match(SET);
				setState(418);
				match(SERDE);
				setState(419);
				match(STRING);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(420);
					match(WITH);
					setState(421);
					match(SERDEPROPERTIES);
					setState(422);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(425);
				match(ALTER);
				setState(426);
				match(TABLE);
				setState(427);
				tableIdentifier();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(428);
					partitionSpec();
					}
				}

				setState(431);
				match(SET);
				setState(432);
				match(SERDEPROPERTIES);
				setState(433);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(435);
				match(ALTER);
				setState(436);
				match(TABLE);
				setState(437);
				tableIdentifier();
				setState(438);
				match(ADD);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(439);
					match(IF);
					setState(440);
					match(NOT);
					setState(441);
					match(EXISTS);
					}
				}

				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(444);
					partitionSpecLocation();
					}
					}
					setState(447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(449);
				match(ALTER);
				setState(450);
				match(VIEW);
				setState(451);
				tableIdentifier();
				setState(452);
				match(ADD);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(453);
					match(IF);
					setState(454);
					match(NOT);
					setState(455);
					match(EXISTS);
					}
				}

				setState(459); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(458);
					partitionSpec();
					}
					}
					setState(461); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(463);
				match(ALTER);
				setState(464);
				match(TABLE);
				setState(465);
				tableIdentifier();
				setState(466);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(467);
				match(RENAME);
				setState(468);
				match(TO);
				setState(469);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(471);
				match(ALTER);
				setState(472);
				match(TABLE);
				setState(473);
				tableIdentifier();
				setState(474);
				match(DROP);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(475);
					match(IF);
					setState(476);
					match(EXISTS);
					}
				}

				setState(479);
				partitionSpec();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(480);
					match(T__2);
					setState(481);
					partitionSpec();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(487);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(490);
				match(ALTER);
				setState(491);
				match(VIEW);
				setState(492);
				tableIdentifier();
				setState(493);
				match(DROP);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(494);
					match(IF);
					setState(495);
					match(EXISTS);
					}
				}

				setState(498);
				partitionSpec();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(499);
					match(T__2);
					setState(500);
					partitionSpec();
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(506);
				match(ALTER);
				setState(507);
				match(TABLE);
				setState(508);
				tableIdentifier();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(509);
					partitionSpec();
					}
				}

				setState(512);
				match(SET);
				setState(513);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(515);
				match(ALTER);
				setState(516);
				match(TABLE);
				setState(517);
				tableIdentifier();
				setState(518);
				match(RECOVER);
				setState(519);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(521);
				match(DROP);
				setState(522);
				match(TABLE);
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(523);
					match(IF);
					setState(524);
					match(EXISTS);
					}
					break;
				}
				setState(527);
				tableIdentifier();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(528);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(531);
				match(DROP);
				setState(532);
				match(VIEW);
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(533);
					match(IF);
					setState(534);
					match(EXISTS);
					}
					break;
				}
				setState(537);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(538);
				match(CREATE);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(539);
					match(OR);
					setState(540);
					match(REPLACE);
					}
				}

				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(543);
						match(GLOBAL);
						}
					}

					setState(546);
					match(TEMPORARY);
					}
				}

				setState(549);
				match(VIEW);
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(550);
					match(IF);
					setState(551);
					match(NOT);
					setState(552);
					match(EXISTS);
					}
					break;
				}
				setState(555);
				tableIdentifier();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(556);
					identifierCommentList();
					}
				}

				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(559);
					match(COMMENT);
					setState(560);
					match(STRING);
					}
				}

				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(563);
					match(PARTITIONED);
					setState(564);
					match(ON);
					setState(565);
					identifierList();
					}
				}

				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(568);
					match(TBLPROPERTIES);
					setState(569);
					tablePropertyList();
					}
				}

				setState(572);
				match(AS);
				setState(573);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(575);
				match(CREATE);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(576);
					match(OR);
					setState(577);
					match(REPLACE);
					}
				}

				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(580);
					match(GLOBAL);
					}
				}

				setState(583);
				match(TEMPORARY);
				setState(584);
				match(VIEW);
				setState(585);
				tableIdentifier();
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(586);
					match(T__0);
					setState(587);
					colTypeList();
					setState(588);
					match(T__1);
					}
				}

				setState(592);
				tableProvider();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(593);
					match(OPTIONS);
					setState(594);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(597);
				match(ALTER);
				setState(598);
				match(VIEW);
				setState(599);
				tableIdentifier();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(600);
					match(AS);
					}
				}

				setState(603);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(605);
				match(CREATE);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(606);
					match(OR);
					setState(607);
					match(REPLACE);
					}
				}

				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(610);
					match(TEMPORARY);
					}
				}

				setState(613);
				match(FUNCTION);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(614);
					match(IF);
					setState(615);
					match(NOT);
					setState(616);
					match(EXISTS);
					}
					break;
				}
				setState(619);
				qualifiedName();
				setState(620);
				match(AS);
				setState(621);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(622);
					match(USING);
					setState(623);
					resource();
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(624);
						match(T__2);
						setState(625);
						resource();
						}
						}
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(633);
				match(DROP);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(634);
					match(TEMPORARY);
					}
				}

				setState(637);
				match(FUNCTION);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(638);
					match(IF);
					setState(639);
					match(EXISTS);
					}
					break;
				}
				setState(642);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(643);
				match(EXPLAIN);
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LOGICAL - 87)) | (1L << (CODEGEN - 87)) | (1L << (COST - 87)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(644);
					_la = _input.LA(1);
					if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LOGICAL - 87)) | (1L << (CODEGEN - 87)) | (1L << (COST - 87)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(647);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(648);
				match(SHOW);
				setState(649);
				match(TABLES);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(650);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(651);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(654);
						match(LIKE);
						}
					}

					setState(657);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(660);
				match(SHOW);
				setState(661);
				match(TABLE);
				setState(662);
				match(EXTENDED);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(663);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(664);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(667);
				match(LIKE);
				setState(668);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(669);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(672);
				match(SHOW);
				setState(673);
				match(DATABASES);
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(674);
					match(LIKE);
					setState(675);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(678);
				match(SHOW);
				setState(679);
				match(TBLPROPERTIES);
				setState(680);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(681);
					match(T__0);
					setState(682);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(683);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(687);
				match(SHOW);
				setState(688);
				match(COLUMNS);
				setState(689);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(690);
				tableIdentifier();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(691);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(692);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(695);
				match(SHOW);
				setState(696);
				match(PARTITIONS);
				setState(697);
				tableIdentifier();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(698);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(701);
				match(SHOW);
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(702);
					identifier();
					}
					break;
				}
				setState(705);
				match(FUNCTIONS);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (CURRENT_DATE - 205)) | (1L << (CURRENT_TIMESTAMP - 205)) | (1L << (STRING - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
					{
					setState(707);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(706);
						match(LIKE);
						}
						break;
					}
					setState(711);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case PIT:
					case IF:
					case POSITION:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case CURRENT_DATE:
					case CURRENT_TIMESTAMP:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(709);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(710);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(715);
				match(SHOW);
				setState(716);
				match(CREATE);
				setState(717);
				match(TABLE);
				setState(718);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(719);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(720);
				match(FUNCTION);
				setState(722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(721);
					match(EXTENDED);
					}
					break;
				}
				setState(724);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(725);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(726);
				match(DATABASE);
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(727);
					match(EXTENDED);
					}
					break;
				}
				setState(730);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(731);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(732);
					match(TABLE);
					}
					break;
				}
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(735);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(738);
				tableIdentifier();
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(739);
					partitionSpec();
					}
					break;
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (CURRENT_DATE - 205)) | (1L << (CURRENT_TIMESTAMP - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
					{
					setState(742);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(745);
				match(REFRESH);
				setState(746);
				match(TABLE);
				setState(747);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(748);
				match(REFRESH);
				setState(756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(749);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(753);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(750);
							matchWildcard();
							}
							} 
						}
						setState(755);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(758);
				match(CACHE);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(759);
					match(LAZY);
					}
				}

				setState(762);
				match(TABLE);
				setState(763);
				tableIdentifier();
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (WITH - 74)) | (1L << (VALUES - 74)) | (1L << (TABLE - 74)) | (1L << (INSERT - 74)) | (1L << (MAP - 74)))) != 0) || _la==REDUCE) {
					{
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(764);
						match(AS);
						}
					}

					setState(767);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(770);
				match(UNCACHE);
				setState(771);
				match(TABLE);
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(772);
					match(IF);
					setState(773);
					match(EXISTS);
					}
					break;
				}
				setState(776);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(777);
				match(CLEAR);
				setState(778);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(779);
				match(LOAD);
				setState(780);
				match(DATA);
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(781);
					match(LOCAL);
					}
				}

				setState(784);
				match(INPATH);
				setState(785);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(786);
					match(OVERWRITE);
					}
				}

				setState(789);
				match(INTO);
				setState(790);
				match(TABLE);
				setState(791);
				tableIdentifier();
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(792);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(795);
				match(TRUNCATE);
				setState(796);
				match(TABLE);
				setState(797);
				tableIdentifier();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(798);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(801);
				match(MSCK);
				setState(802);
				match(REPAIR);
				setState(803);
				match(TABLE);
				setState(804);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(805);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(806);
				identifier();
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(807);
						matchWildcard();
						}
						} 
					}
					setState(812);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(813);
				match(SET);
				setState(814);
				match(ROLE);
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(815);
						matchWildcard();
						}
						} 
					}
					setState(820);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(821);
				match(SET);
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(822);
						matchWildcard();
						}
						} 
					}
					setState(827);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(828);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(829);
				unsupportedHiveNativeCommands();
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(830);
						matchWildcard();
						}
						} 
					}
					setState(835);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(839);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(843);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(846);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(847);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(850);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(851);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(853);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(854);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(857);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(882);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(885);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(888);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(891);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(894);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(897);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(900);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(901);
				tableIdentifier();
				setState(902);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(903);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(905);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(906);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(907);
				tableIdentifier();
				setState(908);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(909);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(911);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(912);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(913);
				tableIdentifier();
				setState(914);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(917);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(918);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(919);
				tableIdentifier();
				setState(920);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(921);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(923);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(924);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(925);
				tableIdentifier();
				setState(926);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(927);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(929);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(930);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(931);
				tableIdentifier();
				setState(932);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(933);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(937);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(939);
				tableIdentifier();
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(944);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(945);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(946);
				tableIdentifier();
				setState(947);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(950);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(952);
				tableIdentifier();
				setState(953);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(956);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(957);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(958);
				tableIdentifier();
				setState(959);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(960);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(962);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(963);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(964);
				tableIdentifier();
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(967);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(968);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(969);
				tableIdentifier();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(970);
					partitionSpec();
					}
				}

				setState(973);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(975);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(976);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(977);
				tableIdentifier();
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(978);
					partitionSpec();
					}
				}

				setState(981);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(983);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(984);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(985);
				tableIdentifier();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(986);
					partitionSpec();
					}
				}

				setState(989);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(990);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(992);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(993);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(994);
				tableIdentifier();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(995);
					partitionSpec();
					}
				}

				setState(998);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1001);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1002);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1005);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1007);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(CREATE);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1011);
				match(TEMPORARY);
				}
			}

			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1014);
				match(EXTERNAL);
				}
			}

			setState(1017);
			match(TABLE);
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1018);
				match(IF);
				setState(1019);
				match(NOT);
				setState(1020);
				match(EXISTS);
				}
				break;
			}
			setState(1023);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(CLUSTERED);
			setState(1026);
			match(BY);
			setState(1027);
			identifierList();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1028);
				match(SORTED);
				setState(1029);
				match(BY);
				setState(1030);
				orderedIdentifierList();
				}
			}

			setState(1033);
			match(INTO);
			setState(1034);
			match(INTEGER_VALUE);
			setState(1035);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(SKEWED);
			setState(1038);
			match(BY);
			setState(1039);
			identifierList();
			setState(1040);
			match(ON);
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1041);
				constantList();
				}
				break;
			case 2:
				{
				setState(1042);
				nestedConstantList();
				}
				break;
			}
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1045);
				match(STORED);
				setState(1046);
				match(AS);
				setState(1047);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(LOCATION);
			setState(1051);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1053);
				ctes();
				}
			}

			setState(1056);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertInto);
		int _la;
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(INSERT);
				setState(1059);
				match(OVERWRITE);
				setState(1060);
				match(TABLE);
				setState(1061);
				tableIdentifier();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1062);
					partitionSpec();
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1063);
						match(IF);
						setState(1064);
						match(NOT);
						setState(1065);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(INSERT);
				setState(1071);
				match(INTO);
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1072);
					match(TABLE);
					}
					break;
				}
				setState(1075);
				tableIdentifier();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1076);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(INSERT);
				setState(1080);
				match(OVERWRITE);
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1081);
					match(LOCAL);
					}
				}

				setState(1084);
				match(DIRECTORY);
				setState(1085);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1086);
					rowFormat();
					}
				}

				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1089);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1092);
				match(INSERT);
				setState(1093);
				match(OVERWRITE);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1094);
					match(LOCAL);
					}
				}

				setState(1097);
				match(DIRECTORY);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1098);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1101);
				tableProvider();
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1102);
					match(OPTIONS);
					setState(1103);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			partitionSpec();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1109);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(PARTITION);
			setState(1113);
			match(T__0);
			setState(1114);
			partitionVal();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1115);
				match(T__2);
				setState(1116);
				partitionVal();
				}
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1122);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			identifier();
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1125);
				match(EQ);
				setState(1126);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeFuncName);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1133);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1137);
				match(T__3);
				setState(1138);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(WITH);
			setState(1145);
			namedQuery();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1146);
				match(T__2);
				setState(1147);
				namedQuery();
				}
				}
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1154);
				match(AS);
				}
			}

			setState(1157);
			match(T__0);
			setState(1158);
			query();
			setState(1159);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(USING);
			setState(1162);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(T__0);
			setState(1165);
			tableProperty();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1166);
				match(T__2);
				setState(1167);
				tableProperty();
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1173);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & ((1L << (STRING - 240)) | (1L << (INTEGER_VALUE - 240)) | (1L << (DECIMAL_VALUE - 240)))) != 0)) {
				{
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1176);
					match(EQ);
					}
				}

				setState(1179);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case PIT:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				identifier();
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1183);
					match(T__3);
					setState(1184);
					identifier();
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyValue);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1194);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1195);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1196);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(T__0);
			setState(1200);
			constant();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1201);
				match(T__2);
				setState(1202);
				constant();
				}
				}
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1208);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(T__0);
			setState(1211);
			constantList();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1212);
				match(T__2);
				setState(1213);
				constantList();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1219);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFileFormat);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				match(STORED);
				setState(1222);
				match(AS);
				setState(1223);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(STORED);
				setState(1225);
				match(BY);
				setState(1226);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fileFormat);
		try {
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(INPUTFORMAT);
				setState(1230);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1231);
				match(OUTPUTFORMAT);
				setState(1232);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(STRING);
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1237);
				match(WITH);
				setState(1238);
				match(SERDEPROPERTIES);
				setState(1239);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			identifier();
			setState(1243);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryNoWith);
		int _la;
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1245);
					insertInto();
					}
				}

				setState(1248);
				queryTerm(0);
				setState(1249);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				fromClause();
				setState(1253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1252);
					multiInsertQueryBody();
					}
					}
					setState(1255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1259);
				match(ORDER);
				setState(1260);
				match(BY);
				setState(1261);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1262);
					match(T__2);
					setState(1263);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1271);
				match(CLUSTER);
				setState(1272);
				match(BY);
				setState(1273);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1274);
					match(T__2);
					setState(1275);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1283);
				match(DISTRIBUTE);
				setState(1284);
				match(BY);
				setState(1285);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1286);
					match(T__2);
					setState(1287);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1295);
				match(SORT);
				setState(1296);
				match(BY);
				setState(1297);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1298);
					match(T__2);
					setState(1299);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1307);
				windows();
				}
			}

			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1310);
				match(LIMIT);
				setState(1313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1311);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1312);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1317);
				insertInto();
				}
			}

			setState(1320);
			querySpecification();
			setState(1321);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1324);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1327);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (UNION - 99)) | (1L << (EXCEPT - 99)) | (1L << (SETMINUS - 99)) | (1L << (INTERSECT - 99)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1328);
						setQuantifier();
						}
					}

					setState(1331);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryPrimary);
		try {
			setState(1345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				match(TABLE);
				setState(1339);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1340);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1341);
				match(T__0);
				setState(1342);
				queryNoWith();
				setState(1343);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			expression();
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1348);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1351);
				match(NULLS);
				setState(1352);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1365);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1355);
					match(SELECT);
					setState(1356);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1357);
					match(T__0);
					setState(1358);
					namedExpressionSeq();
					setState(1359);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1361);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1362);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1363);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1364);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1367);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1370);
					match(RECORDWRITER);
					setState(1371);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1374);
				match(USING);
				setState(1375);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1376);
					match(AS);
					setState(1386);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1377);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1378);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1379);
						match(T__0);
						setState(1382);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1380);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1381);
							colTypeList();
							}
							break;
						}
						setState(1384);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1390);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1393);
					match(RECORDREADER);
					setState(1394);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1397);
					fromClause();
					}
					break;
				}
				setState(1402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1400);
					match(WHERE);
					setState(1401);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1404);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1405);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1411);
						setQuantifier();
						}
						break;
					}
					setState(1414);
					namedExpressionSeq();
					setState(1416);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1415);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1418);
					fromClause();
					setState(1424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(1419);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1421);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1420);
							setQuantifier();
							}
							break;
						}
						setState(1423);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1428);
						lateralView();
						}
						} 
					}
					setState(1433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				setState(1436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1434);
					match(WHERE);
					setState(1435);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1438);
					aggregation();
					}
					break;
				}
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1441);
					match(HAVING);
					setState(1442);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1445);
					windows();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(T__4);
			setState(1451);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (CURRENT_DATE - 205)) | (1L << (CURRENT_TIMESTAMP - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
				{
				{
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1452);
					match(T__2);
					}
				}

				setState(1455);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1461);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hintStatement);
		int _la;
		try {
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1465);
				match(T__0);
				setState(1466);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1467);
					match(T__2);
					setState(1468);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1474);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(FROM);
			setState(1479);
			relation();
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1480);
					match(T__2);
					setState(1481);
					relation();
					}
					} 
				}
				setState(1486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1487);
					lateralView();
					}
					} 
				}
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(GROUP);
			setState(1494);
			match(BY);
			setState(1495);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(1500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1496);
					match(T__2);
					setState(1497);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1503);
				match(WITH);
				setState(1504);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(1505);
				match(WITH);
				setState(1506);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(1507);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1508);
				match(SETS);
				setState(1509);
				match(T__0);
				setState(1510);
				groupingSet();
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1511);
					match(T__2);
					setState(1512);
					groupingSet();
					}
					}
					setState(1517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1518);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_groupingSet);
		int _la;
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(T__0);
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (CURRENT_DATE - 200)) | (1L << (CURRENT_TIMESTAMP - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(1523);
					expression();
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1524);
						match(T__2);
						setState(1525);
						expression();
						}
						}
						setState(1530);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1533);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(LATERAL);
			setState(1538);
			match(VIEW);
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1539);
				match(OUTER);
				}
				break;
			}
			setState(1542);
			qualifiedName();
			setState(1543);
			match(T__0);
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (CURRENT_DATE - 200)) | (1L << (CURRENT_TIMESTAMP - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(1544);
				expression();
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1545);
					match(T__2);
					setState(1546);
					expression();
					}
					}
					setState(1551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1554);
			match(T__1);
			setState(1555);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1556);
					match(AS);
					}
					break;
				}
				setState(1559);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1560);
						match(T__2);
						setState(1561);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			relationPrimary();
			setState(1575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1572);
					joinRelation();
					}
					} 
				}
				setState(1577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_joinRelation);
		try {
			setState(1589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case PIT:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1578);
				joinType();
				}
				setState(1579);
				match(JOIN);
				setState(1580);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1581);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1584);
				match(NATURAL);
				setState(1585);
				joinType();
				setState(1586);
				match(JOIN);
				setState(1587);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode PIT() { return getToken(SqlBaseParser.PIT, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_joinType);
		int _la;
		try {
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1591);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1595);
				match(LEFT);
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1596);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1599);
				match(LEFT);
				setState(1600);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1601);
				match(RIGHT);
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1602);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1605);
				match(FULL);
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1606);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1609);
					match(LEFT);
					}
				}

				setState(1612);
				match(ANTI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1613);
				match(PIT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASOF() { return getToken(SqlBaseParser.ASOF, 0); }
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_joinCriteria);
		int _la;
		try {
			setState(1632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1616);
				match(ON);
				setState(1617);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				match(USING);
				setState(1619);
				match(T__0);
				setState(1620);
				identifier();
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1621);
					match(T__2);
					setState(1622);
					identifier();
					}
					}
					setState(1627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1628);
				match(T__1);
				}
				break;
			case ASOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1630);
				match(ASOF);
				setState(1631);
				booleanExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public Token negativeSign;
		public Token percentage;
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode BYTELENGTH_LITERAL() { return getToken(SqlBaseParser.BYTELENGTH_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(TABLESAMPLE);
			setState(1635);
			match(T__0);
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				{
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1636);
					((SampleContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1639);
				((SampleContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1640);
				((SampleContext)_localctx).sampleType = match(PERCENTLIT);
				}
				}
				break;
			case 2:
				{
				{
				setState(1641);
				expression();
				setState(1642);
				((SampleContext)_localctx).sampleType = match(ROWS);
				}
				}
				break;
			case 3:
				{
				setState(1644);
				((SampleContext)_localctx).sampleType = match(BYTELENGTH_LITERAL);
				}
				break;
			case 4:
				{
				{
				setState(1645);
				((SampleContext)_localctx).sampleType = match(BUCKET);
				setState(1646);
				((SampleContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1647);
				match(OUT);
				setState(1648);
				match(OF);
				setState(1649);
				((SampleContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1650);
					match(ON);
					setState(1656);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						setState(1651);
						identifier();
						}
						break;
					case 2:
						{
						setState(1652);
						qualifiedName();
						setState(1653);
						match(T__0);
						setState(1654);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			setState(1662);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(T__0);
			setState(1665);
			identifierSeq();
			setState(1666);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			identifier();
			setState(1673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1669);
					match(T__2);
					setState(1670);
					identifier();
					}
					} 
				}
				setState(1675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			match(T__0);
			setState(1677);
			orderedIdentifier();
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1678);
				match(T__2);
				setState(1679);
				orderedIdentifier();
				}
				}
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1685);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			identifier();
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1688);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(T__0);
			setState(1692);
			identifierComment();
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1693);
				match(T__2);
				setState(1694);
				identifierComment();
				}
				}
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1700);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			identifier();
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1703);
				match(COMMENT);
				setState(1704);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_relationPrimary);
		try {
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				tableIdentifier();
				setState(1709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1708);
					sample();
					}
					break;
				}
				setState(1711);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				match(T__0);
				setState(1714);
				queryNoWith();
				setState(1715);
				match(T__1);
				setState(1717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1716);
					sample();
					}
					break;
				}
				setState(1719);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1721);
				match(T__0);
				setState(1722);
				relation();
				setState(1723);
				match(T__1);
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1724);
					sample();
					}
					break;
				}
				setState(1727);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1729);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1730);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			match(VALUES);
			setState(1734);
			expression();
			setState(1739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1735);
					match(T__2);
					setState(1736);
					expression();
					}
					} 
				}
				setState(1741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1742);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			identifier();
			setState(1745);
			match(T__0);
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (CURRENT_DATE - 200)) | (1L << (CURRENT_TIMESTAMP - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(1746);
				expression();
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1747);
					match(T__2);
					setState(1748);
					expression();
					}
					}
					setState(1753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1756);
			match(T__1);
			setState(1757);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1759);
					match(AS);
					}
					break;
				}
				setState(1762);
				strictIdentifier();
				setState(1764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1763);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rowFormat);
		try {
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				match(ROW);
				setState(1769);
				match(FORMAT);
				setState(1770);
				match(SERDE);
				setState(1771);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1772);
					match(WITH);
					setState(1773);
					match(SERDEPROPERTIES);
					setState(1774);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				match(ROW);
				setState(1778);
				match(FORMAT);
				setState(1779);
				match(DELIMITED);
				setState(1789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1780);
					match(FIELDS);
					setState(1781);
					match(TERMINATED);
					setState(1782);
					match(BY);
					setState(1783);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1787);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
					case 1:
						{
						setState(1784);
						match(ESCAPED);
						setState(1785);
						match(BY);
						setState(1786);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1791);
					match(COLLECTION);
					setState(1792);
					match(ITEMS);
					setState(1793);
					match(TERMINATED);
					setState(1794);
					match(BY);
					setState(1795);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1798);
					match(MAP);
					setState(1799);
					match(KEYS);
					setState(1800);
					match(TERMINATED);
					setState(1801);
					match(BY);
					setState(1802);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1805);
					match(LINES);
					setState(1806);
					match(TERMINATED);
					setState(1807);
					match(BY);
					setState(1808);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1811);
					match(NULL);
					setState(1812);
					match(DEFINED);
					setState(1813);
					match(AS);
					setState(1814);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1819);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1820);
				match(T__3);
				}
				break;
			}
			setState(1824);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1826);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1827);
				match(T__3);
				}
				break;
			}
			setState(1831);
			((FunctionIdentifierContext)_localctx).function = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			expression();
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1834);
					match(AS);
					}
					break;
				}
				setState(1839);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case PIT:
				case IF:
				case POSITION:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1837);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1838);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			namedExpression();
			setState(1848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1844);
					match(T__2);
					setState(1845);
					namedExpression();
					}
					} 
				}
				setState(1850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1854);
				match(NOT);
				setState(1855);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1856);
				match(EXISTS);
				setState(1857);
				match(T__0);
				setState(1858);
				query();
				setState(1859);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1861);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1872);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1870);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1864);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1865);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1866);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1867);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1868);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1869);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			valueExpression(0);
			setState(1877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1876);
				predicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_predicate);
		int _la;
		try {
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1879);
					match(NOT);
					}
				}

				setState(1882);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1883);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1884);
				match(AND);
				setState(1885);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1887);
					match(NOT);
					}
				}

				setState(1890);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1891);
				match(T__0);
				setState(1892);
				expression();
				setState(1897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1893);
					match(T__2);
					setState(1894);
					expression();
					}
					}
					setState(1899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1900);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1902);
					match(NOT);
					}
				}

				setState(1905);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1906);
				match(T__0);
				setState(1907);
				query();
				setState(1908);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1910);
					match(NOT);
					}
				}

				setState(1913);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1914);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1915);
				match(IS);
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1916);
					match(NOT);
					}
				}

				setState(1919);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1920);
				match(IS);
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1921);
					match(NOT);
					}
				}

				setState(1924);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1925);
				match(FROM);
				setState(1926);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1930);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1931);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (TILDE - 136)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1932);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1935);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1936);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ASTERISK - 138)) | (1L << (SLASH - 138)) | (1L << (PERCENT - 138)) | (1L << (DIV - 138)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1937);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1938);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1939);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (CONCAT_PIPE - 136)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1940);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1941);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1942);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1943);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1944);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1945);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1946);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1947);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1948);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1949);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1950);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1951);
						comparisonOperator();
						setState(1952);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeFunctionCallContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TimeFunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				_localctx = new TimeFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1960);
				((TimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((TimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1961);
				match(CASE);
				setState(1963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1962);
					whenClause();
					}
					}
					setState(1965); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1967);
					match(ELSE);
					setState(1968);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1971);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1973);
				match(CASE);
				setState(1974);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1976); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1975);
					whenClause();
					}
					}
					setState(1978); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1980);
					match(ELSE);
					setState(1981);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1984);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1986);
				match(CAST);
				setState(1987);
				match(T__0);
				setState(1988);
				expression();
				setState(1989);
				match(AS);
				setState(1990);
				dataType();
				setState(1991);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1993);
				match(STRUCT);
				setState(1994);
				match(T__0);
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (CURRENT_DATE - 200)) | (1L << (CURRENT_TIMESTAMP - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(1995);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2000);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1996);
						match(T__2);
						setState(1997);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2002);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2005);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2006);
				match(FIRST);
				setState(2007);
				match(T__0);
				setState(2008);
				expression();
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2009);
					match(IGNORE);
					setState(2010);
					match(NULLS);
					}
				}

				setState(2013);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2015);
				match(LAST);
				setState(2016);
				match(T__0);
				setState(2017);
				expression();
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2018);
					match(IGNORE);
					setState(2019);
					match(NULLS);
					}
				}

				setState(2022);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2024);
				match(POSITION);
				setState(2025);
				match(T__0);
				setState(2026);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2027);
				match(IN);
				setState(2028);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2029);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2031);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2032);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2033);
				qualifiedName();
				setState(2034);
				match(T__3);
				setState(2035);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2037);
				match(T__0);
				setState(2038);
				namedExpression();
				setState(2041); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2039);
					match(T__2);
					setState(2040);
					namedExpression();
					}
					}
					setState(2043); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2045);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2047);
				match(T__0);
				setState(2048);
				query();
				setState(2049);
				match(T__1);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2051);
				qualifiedName();
				setState(2052);
				match(T__0);
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (CURRENT_DATE - 200)) | (1L << (CURRENT_TIMESTAMP - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(2054);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
					case 1:
						{
						setState(2053);
						setQuantifier();
						}
						break;
					}
					setState(2056);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2061);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2057);
						match(T__2);
						setState(2058);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2063);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2066);
				match(T__1);
				setState(2069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2067);
					match(OVER);
					setState(2068);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2071);
				qualifiedName();
				setState(2072);
				match(T__0);
				setState(2073);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (BOTH - 121)) | (1L << (LEADING - 121)) | (1L << (TRAILING - 121)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2074);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2075);
				match(FROM);
				setState(2076);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2077);
				match(T__1);
				}
				break;
			case 16:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2079);
				identifier();
				}
				break;
			case 17:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2080);
				match(T__0);
				setState(2081);
				expression();
				setState(2082);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2094);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2086);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2087);
						match(T__6);
						setState(2088);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2089);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2091);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2092);
						match(T__3);
						setState(2093);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_constant);
		try {
			int _alt;
			setState(2111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2100);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2101);
				identifier();
				setState(2102);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2104);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2105);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2107); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2106);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2109); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2113);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EQ - 128)) | (1L << (NSEQ - 128)) | (1L << (NEQ - 128)) | (1L << (NEQJ - 128)) | (1L << (LT - 128)) | (1L << (LTE - 128)) | (1L << (GT - 128)) | (1L << (GTE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (SLASH - 136)) | (1L << (PERCENT - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (AMPERSAND - 136)) | (1L << (PIPE - 136)) | (1L << (CONCAT_PIPE - 136)) | (1L << (HAT - 136)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			match(INTERVAL);
			setState(2125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2122);
					intervalField();
					}
					} 
				}
				setState(2127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2129);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2130);
				match(TO);
				setState(2131);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_intervalValue);
		int _la;
		try {
			setState(2139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2134);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2137);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2138);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_colPosition);
		try {
			setState(2144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2141);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2142);
				match(AFTER);
				setState(2143);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dataType);
		int _la;
		try {
			setState(2180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2146);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2147);
				match(LT);
				setState(2148);
				dataType();
				setState(2149);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2151);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2152);
				match(LT);
				setState(2153);
				dataType();
				setState(2154);
				match(T__2);
				setState(2155);
				dataType();
				setState(2156);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2158);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2159);
					match(LT);
					setState(2161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (PIT - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (CURRENT_DATE - 205)) | (1L << (CURRENT_TIMESTAMP - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
						{
						setState(2160);
						complexColTypeList();
						}
					}

					setState(2163);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2164);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2167);
				identifier();
				setState(2178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2168);
					match(T__0);
					setState(2169);
					match(INTEGER_VALUE);
					setState(2174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2170);
						match(T__2);
						setState(2171);
						match(INTEGER_VALUE);
						}
						}
						setState(2176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2177);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2182);
			colType();
			setState(2187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2183);
					match(T__2);
					setState(2184);
					colType();
					}
					} 
				}
				setState(2189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			identifier();
			setState(2191);
			dataType();
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2192);
				match(COMMENT);
				setState(2193);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			complexColType();
			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2197);
				match(T__2);
				setState(2198);
				complexColType();
				}
				}
				setState(2203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			identifier();
			setState(2205);
			match(T__8);
			setState(2206);
			dataType();
			setState(2209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2207);
				match(COMMENT);
				setState(2208);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			match(WHEN);
			setState(2212);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2213);
			match(THEN);
			setState(2214);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2216);
			match(WINDOW);
			setState(2217);
			namedWindow();
			setState(2222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2218);
					match(T__2);
					setState(2219);
					namedWindow();
					}
					} 
				}
				setState(2224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			identifier();
			setState(2226);
			match(AS);
			setState(2227);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_windowSpec);
		int _la;
		try {
			setState(2271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case PIT:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2229);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2230);
				match(T__0);
				setState(2265);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2231);
					match(CLUSTER);
					setState(2232);
					match(BY);
					setState(2233);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2234);
						match(T__2);
						setState(2235);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2241);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2242);
						match(BY);
						setState(2243);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2244);
							match(T__2);
							setState(2245);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2250);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2253);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2254);
						match(BY);
						setState(2255);
						sortItem();
						setState(2260);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2256);
							match(T__2);
							setState(2257);
							sortItem();
							}
							}
							setState(2262);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2267);
					windowFrame();
					}
				}

				setState(2270);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windowFrame);
		try {
			setState(2289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2273);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2274);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2275);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2276);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2277);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2278);
				match(BETWEEN);
				setState(2279);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2280);
				match(AND);
				setState(2281);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2283);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2284);
				match(BETWEEN);
				setState(2285);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2286);
				match(AND);
				setState(2287);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_frameBound);
		int _la;
		try {
			setState(2298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2291);
				match(UNBOUNDED);
				setState(2292);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2293);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2294);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2295);
				expression();
				setState(2296);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			identifier();
			setState(2305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2301);
					match(T__3);
					setState(2302);
					identifier();
					}
					} 
				}
				setState(2307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode PIT() { return getToken(SqlBaseParser.PIT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_identifier);
		try {
			setState(2324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2308);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2309);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2310);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2311);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2312);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2313);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2314);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2315);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2316);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2317);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2318);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2319);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2320);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2321);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2322);
				match(SETMINUS);
				}
				break;
			case PIT:
				enterOuterAlt(_localctx, 16);
				{
				setState(2323);
				match(PIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_strictIdentifier);
		try {
			setState(2329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2326);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2327);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2328);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_number);
		int _la;
		try {
			setState(2361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2333);
					match(MINUS);
					}
				}

				setState(2336);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2337);
					match(MINUS);
					}
				}

				setState(2340);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2341);
					match(MINUS);
					}
				}

				setState(2344);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2345);
					match(MINUS);
					}
				}

				setState(2348);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2349);
					match(MINUS);
					}
				}

				setState(2352);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2353);
					match(MINUS);
					}
				}

				setState(2356);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2357);
					match(MINUS);
					}
				}

				setState(2360);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (CURRENT_DATE - 205)) | (1L << (CURRENT_TIMESTAMP - 205)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 67:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 70:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 71:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0102\u0940\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e1\n\b"+
		"\3\b\3\b\3\b\5\b\u00e6\n\b\3\b\5\b\u00e9\n\b\3\b\3\b\3\b\5\b\u00ee\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fb\n\b\3\b\3\b\5\b"+
		"\u00ff\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0106\n\b\3\b\3\b\3\b\5\b\u010b\n\b"+
		"\3\b\3\b\3\b\5\b\u0110\n\b\3\b\5\b\u0113\n\b\3\b\5\b\u0116\n\b\3\b\3\b"+
		"\5\b\u011a\n\b\3\b\3\b\5\b\u011e\n\b\3\b\5\b\u0121\n\b\3\b\5\b\u0124\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u012b\n\b\3\b\3\b\5\b\u012f\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0137\n\b\3\b\5\b\u013a\n\b\3\b\5\b\u013d\n\b\3\b\5\b"+
		"\u0140\n\b\3\b\5\b\u0143\n\b\3\b\5\b\u0146\n\b\3\b\3\b\5\b\u014a\n\b\3"+
		"\b\5\b\u014d\n\b\3\b\5\b\u0150\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0157\n\b\3"+
		"\b\3\b\3\b\3\b\5\b\u015d\n\b\3\b\3\b\3\b\3\b\5\b\u0163\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u016b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u018b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0193\n\b\3\b\3\b\5\b"+
		"\u0197\n\b\3\b\3\b\3\b\5\b\u019c\n\b\3\b\3\b\3\b\3\b\5\b\u01a2\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u01aa\n\b\3\b\3\b\3\b\3\b\5\b\u01b0\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01bd\n\b\3\b\6\b\u01c0\n\b"+
		"\r\b\16\b\u01c1\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01cb\n\b\3\b\6\b\u01ce"+
		"\n\b\r\b\16\b\u01cf\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u01e0\n\b\3\b\3\b\3\b\7\b\u01e5\n\b\f\b\16\b\u01e8\13\b\3\b"+
		"\5\b\u01eb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f3\n\b\3\b\3\b\3\b\7\b\u01f8"+
		"\n\b\f\b\16\b\u01fb\13\b\3\b\3\b\3\b\3\b\5\b\u0201\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0210\n\b\3\b\3\b\5\b\u0214\n"+
		"\b\3\b\3\b\3\b\3\b\5\b\u021a\n\b\3\b\3\b\3\b\3\b\5\b\u0220\n\b\3\b\5\b"+
		"\u0223\n\b\3\b\5\b\u0226\n\b\3\b\3\b\3\b\3\b\5\b\u022c\n\b\3\b\3\b\5\b"+
		"\u0230\n\b\3\b\3\b\5\b\u0234\n\b\3\b\3\b\3\b\5\b\u0239\n\b\3\b\3\b\5\b"+
		"\u023d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0245\n\b\3\b\5\b\u0248\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0251\n\b\3\b\3\b\3\b\5\b\u0256\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u025c\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0263\n\b\3\b\5\b\u0266"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u026c\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0275"+
		"\n\b\f\b\16\b\u0278\13\b\5\b\u027a\n\b\3\b\3\b\5\b\u027e\n\b\3\b\3\b\3"+
		"\b\5\b\u0283\n\b\3\b\3\b\3\b\5\b\u0288\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u028f"+
		"\n\b\3\b\5\b\u0292\n\b\3\b\5\b\u0295\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u029c"+
		"\n\b\3\b\3\b\3\b\5\b\u02a1\n\b\3\b\3\b\3\b\3\b\5\b\u02a7\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u02b0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02b8\n\b"+
		"\3\b\3\b\3\b\3\b\5\b\u02be\n\b\3\b\3\b\5\b\u02c2\n\b\3\b\3\b\5\b\u02c6"+
		"\n\b\3\b\3\b\5\b\u02ca\n\b\5\b\u02cc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u02d5\n\b\3\b\3\b\3\b\3\b\5\b\u02db\n\b\3\b\3\b\3\b\5\b\u02e0\n\b\3"+
		"\b\5\b\u02e3\n\b\3\b\3\b\5\b\u02e7\n\b\3\b\5\b\u02ea\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u02f2\n\b\f\b\16\b\u02f5\13\b\5\b\u02f7\n\b\3\b\3\b\5\b"+
		"\u02fb\n\b\3\b\3\b\3\b\5\b\u0300\n\b\3\b\5\b\u0303\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0309\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0311\n\b\3\b\3\b\3\b\5\b\u0316"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u031c\n\b\3\b\3\b\3\b\3\b\5\b\u0322\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u032b\n\b\f\b\16\b\u032e\13\b\3\b\3\b\3\b\7"+
		"\b\u0333\n\b\f\b\16\b\u0336\13\b\3\b\3\b\7\b\u033a\n\b\f\b\16\b\u033d"+
		"\13\b\3\b\3\b\3\b\7\b\u0342\n\b\f\b\16\b\u0345\13\b\5\b\u0347\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u034f\n\t\3\t\3\t\5\t\u0353\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u035a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03ce\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03de"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03e7\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u03f3\n\t\3\n\3\n\5\n\u03f7\n\n\3\n\5\n\u03fa\n\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0400\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u040a\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0416\n"+
		"\f\3\f\3\f\3\f\5\f\u041b\n\f\3\r\3\r\3\r\3\16\5\16\u0421\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u042d\n\17\5\17\u042f\n"+
		"\17\3\17\3\17\3\17\5\17\u0434\n\17\3\17\3\17\5\17\u0438\n\17\3\17\3\17"+
		"\3\17\5\17\u043d\n\17\3\17\3\17\3\17\5\17\u0442\n\17\3\17\5\17\u0445\n"+
		"\17\3\17\3\17\3\17\5\17\u044a\n\17\3\17\3\17\5\17\u044e\n\17\3\17\3\17"+
		"\3\17\5\17\u0453\n\17\5\17\u0455\n\17\3\20\3\20\5\20\u0459\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0460\n\21\f\21\16\21\u0463\13\21\3\21\3\21\3"+
		"\22\3\22\3\22\5\22\u046a\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0471\n\23"+
		"\3\24\3\24\3\24\7\24\u0476\n\24\f\24\16\24\u0479\13\24\3\25\3\25\3\25"+
		"\3\25\7\25\u047f\n\25\f\25\16\25\u0482\13\25\3\26\3\26\5\26\u0486\n\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0493\n\30"+
		"\f\30\16\30\u0496\13\30\3\30\3\30\3\31\3\31\5\31\u049c\n\31\3\31\5\31"+
		"\u049f\n\31\3\32\3\32\3\32\7\32\u04a4\n\32\f\32\16\32\u04a7\13\32\3\32"+
		"\5\32\u04aa\n\32\3\33\3\33\3\33\3\33\5\33\u04b0\n\33\3\34\3\34\3\34\3"+
		"\34\7\34\u04b6\n\34\f\34\16\34\u04b9\13\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\7\35\u04c1\n\35\f\35\16\35\u04c4\13\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u04ce\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u04d5\n\37"+
		"\3 \3 \3 \3 \5 \u04db\n \3!\3!\3!\3\"\5\"\u04e1\n\"\3\"\3\"\3\"\3\"\3"+
		"\"\6\"\u04e8\n\"\r\"\16\"\u04e9\5\"\u04ec\n\"\3#\3#\3#\3#\3#\7#\u04f3"+
		"\n#\f#\16#\u04f6\13#\5#\u04f8\n#\3#\3#\3#\3#\3#\7#\u04ff\n#\f#\16#\u0502"+
		"\13#\5#\u0504\n#\3#\3#\3#\3#\3#\7#\u050b\n#\f#\16#\u050e\13#\5#\u0510"+
		"\n#\3#\3#\3#\3#\3#\7#\u0517\n#\f#\16#\u051a\13#\5#\u051c\n#\3#\5#\u051f"+
		"\n#\3#\3#\3#\5#\u0524\n#\5#\u0526\n#\3$\5$\u0529\n$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\5%\u0534\n%\3%\7%\u0537\n%\f%\16%\u053a\13%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u0544\n&\3\'\3\'\5\'\u0548\n\'\3\'\3\'\5\'\u054c\n\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0558\n(\3(\5(\u055b\n(\3(\3(\5(\u055f\n("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0569\n(\3(\3(\5(\u056d\n(\5(\u056f\n(\3("+
		"\5(\u0572\n(\3(\3(\5(\u0576\n(\3(\5(\u0579\n(\3(\3(\5(\u057d\n(\3(\3("+
		"\7(\u0581\n(\f(\16(\u0584\13(\3(\5(\u0587\n(\3(\3(\5(\u058b\n(\3(\3(\3"+
		"(\5(\u0590\n(\3(\5(\u0593\n(\5(\u0595\n(\3(\7(\u0598\n(\f(\16(\u059b\13"+
		"(\3(\3(\5(\u059f\n(\3(\5(\u05a2\n(\3(\3(\5(\u05a6\n(\3(\5(\u05a9\n(\5"+
		"(\u05ab\n(\3)\3)\3)\5)\u05b0\n)\3)\7)\u05b3\n)\f)\16)\u05b6\13)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\7*\u05c0\n*\f*\16*\u05c3\13*\3*\3*\5*\u05c7\n*\3+\3"+
		"+\3+\3+\7+\u05cd\n+\f+\16+\u05d0\13+\3+\7+\u05d3\n+\f+\16+\u05d6\13+\3"+
		",\3,\3,\3,\3,\7,\u05dd\n,\f,\16,\u05e0\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\7,\u05ec\n,\f,\16,\u05ef\13,\3,\3,\5,\u05f3\n,\3-\3-\3-\3-\7-\u05f9"+
		"\n-\f-\16-\u05fc\13-\5-\u05fe\n-\3-\3-\5-\u0602\n-\3.\3.\3.\5.\u0607\n"+
		".\3.\3.\3.\3.\3.\7.\u060e\n.\f.\16.\u0611\13.\5.\u0613\n.\3.\3.\3.\5."+
		"\u0618\n.\3.\3.\3.\7.\u061d\n.\f.\16.\u0620\13.\5.\u0622\n.\3/\3/\3\60"+
		"\3\60\7\60\u0628\n\60\f\60\16\60\u062b\13\60\3\61\3\61\3\61\3\61\5\61"+
		"\u0631\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u0638\n\61\3\62\5\62\u063b\n"+
		"\62\3\62\3\62\3\62\5\62\u0640\n\62\3\62\3\62\3\62\3\62\5\62\u0646\n\62"+
		"\3\62\3\62\5\62\u064a\n\62\3\62\5\62\u064d\n\62\3\62\3\62\5\62\u0651\n"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u065a\n\63\f\63\16\63\u065d"+
		"\13\63\3\63\3\63\3\63\3\63\5\63\u0663\n\63\3\64\3\64\3\64\5\64\u0668\n"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\5\64\u067b\n\64\5\64\u067d\n\64\5\64\u067f\n\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u068a\n\66\f\66\16\66\u068d"+
		"\13\66\3\67\3\67\3\67\3\67\7\67\u0693\n\67\f\67\16\67\u0696\13\67\3\67"+
		"\3\67\38\38\58\u069c\n8\39\39\39\39\79\u06a2\n9\f9\169\u06a5\139\39\3"+
		"9\3:\3:\3:\5:\u06ac\n:\3;\3;\5;\u06b0\n;\3;\3;\3;\3;\3;\3;\5;\u06b8\n"+
		";\3;\3;\3;\3;\3;\3;\5;\u06c0\n;\3;\3;\3;\3;\5;\u06c6\n;\3<\3<\3<\3<\7"+
		"<\u06cc\n<\f<\16<\u06cf\13<\3<\3<\3=\3=\3=\3=\3=\7=\u06d8\n=\f=\16=\u06db"+
		"\13=\5=\u06dd\n=\3=\3=\3=\3>\5>\u06e3\n>\3>\3>\5>\u06e7\n>\5>\u06e9\n"+
		">\3?\3?\3?\3?\3?\3?\3?\5?\u06f2\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u06fe"+
		"\n?\5?\u0700\n?\3?\3?\3?\3?\3?\5?\u0707\n?\3?\3?\3?\3?\3?\5?\u070e\n?"+
		"\3?\3?\3?\3?\5?\u0714\n?\3?\3?\3?\3?\5?\u071a\n?\5?\u071c\n?\3@\3@\3@"+
		"\5@\u0721\n@\3@\3@\3A\3A\3A\5A\u0728\nA\3A\3A\3B\3B\5B\u072e\nB\3B\3B"+
		"\5B\u0732\nB\5B\u0734\nB\3C\3C\3C\7C\u0739\nC\fC\16C\u073c\13C\3D\3D\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0749\nE\3E\3E\3E\3E\3E\3E\7E\u0751\nE\f"+
		"E\16E\u0754\13E\3F\3F\5F\u0758\nF\3G\5G\u075b\nG\3G\3G\3G\3G\3G\3G\5G"+
		"\u0763\nG\3G\3G\3G\3G\3G\7G\u076a\nG\fG\16G\u076d\13G\3G\3G\3G\5G\u0772"+
		"\nG\3G\3G\3G\3G\3G\3G\5G\u077a\nG\3G\3G\3G\3G\5G\u0780\nG\3G\3G\3G\5G"+
		"\u0785\nG\3G\3G\3G\5G\u078a\nG\3H\3H\3H\3H\5H\u0790\nH\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u07a5\nH\fH\16H\u07a8\13"+
		"H\3I\3I\3I\3I\6I\u07ae\nI\rI\16I\u07af\3I\3I\5I\u07b4\nI\3I\3I\3I\3I\3"+
		"I\6I\u07bb\nI\rI\16I\u07bc\3I\3I\5I\u07c1\nI\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\7I\u07d1\nI\fI\16I\u07d4\13I\5I\u07d6\nI\3I\3I\3I\3I"+
		"\3I\3I\5I\u07de\nI\3I\3I\3I\3I\3I\3I\3I\5I\u07e7\nI\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\6I\u07fc\nI\rI\16I\u07fd\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\5I\u0809\nI\3I\3I\3I\7I\u080e\nI\fI\16I\u0811\13"+
		"I\5I\u0813\nI\3I\3I\3I\5I\u0818\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\5I\u0827\nI\3I\3I\3I\3I\3I\3I\3I\3I\7I\u0831\nI\fI\16I\u0834\13I"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\6J\u083e\nJ\rJ\16J\u083f\5J\u0842\nJ\3K\3K\3"+
		"L\3L\3M\3M\3N\3N\3O\3O\7O\u084e\nO\fO\16O\u0851\13O\3P\3P\3P\3P\5P\u0857"+
		"\nP\3Q\5Q\u085a\nQ\3Q\3Q\5Q\u085e\nQ\3R\3R\3R\5R\u0863\nR\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0874\nS\3S\3S\5S\u0878\nS\3S\3S"+
		"\3S\3S\3S\7S\u087f\nS\fS\16S\u0882\13S\3S\5S\u0885\nS\5S\u0887\nS\3T\3"+
		"T\3T\7T\u088c\nT\fT\16T\u088f\13T\3U\3U\3U\3U\5U\u0895\nU\3V\3V\3V\7V"+
		"\u089a\nV\fV\16V\u089d\13V\3W\3W\3W\3W\3W\5W\u08a4\nW\3X\3X\3X\3X\3X\3"+
		"Y\3Y\3Y\3Y\7Y\u08af\nY\fY\16Y\u08b2\13Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3["+
		"\3[\7[\u08bf\n[\f[\16[\u08c2\13[\3[\3[\3[\3[\3[\7[\u08c9\n[\f[\16[\u08cc"+
		"\13[\5[\u08ce\n[\3[\3[\3[\3[\3[\7[\u08d5\n[\f[\16[\u08d8\13[\5[\u08da"+
		"\n[\5[\u08dc\n[\3[\5[\u08df\n[\3[\5[\u08e2\n[\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u08f4\n\\\3]\3]\3]\3]\3]"+
		"\3]\3]\5]\u08fd\n]\3^\3^\3^\7^\u0902\n^\f^\16^\u0905\13^\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0917\n_\3`\3`\3`\5`\u091c\n`\3"+
		"a\3a\3b\5b\u0921\nb\3b\3b\5b\u0925\nb\3b\3b\5b\u0929\nb\3b\3b\5b\u092d"+
		"\nb\3b\3b\5b\u0931\nb\3b\3b\5b\u0935\nb\3b\3b\5b\u0939\nb\3b\5b\u093c"+
		"\nb\3c\3c\3c\7\u02f3\u032c\u0334\u033b\u0343\6H\u0088\u008e\u0090d\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\2\35\3\2\u00c8\u00c9\4\2OOQQ\5\2Y[\u00ae\u00ae\u00b4"+
		"\u00b4\4\2\r\r\37\37\4\2,,VV\4\2\u00ae\u00ae\u00b4\u00b4\4\2\16\16\u00d5"+
		"\u00d5\3\2eh\3\2+,\4\2HHJJ\3\2\20\21\3\2\u00f7\u00f8\3\2$%\4\2\u008a\u008b"+
		"\u0090\u0090\3\2\u008c\u008f\4\2\u008a\u008b\u0093\u0093\3\2\u00f0\u00f1"+
		"\3\2{}\3\2\u0082\u0089\3\2\u008a\u0094\3\2\35 \3\2()\3\2\u008a\u008b\4"+
		"\2AA\u009b\u009b\4\2\31\31\u0099\u0099\3\2EF\13\2\f\63\66\66>di}\u0080"+
		"\u0081\u008f\u008f\u0095\u009e\u00a0\u00ec\u00ee\u00f1\2\u0ace\2\u00c6"+
		"\3\2\2\2\4\u00c9\3\2\2\2\6\u00cc\3\2\2\2\b\u00cf\3\2\2\2\n\u00d2\3\2\2"+
		"\2\f\u00d5\3\2\2\2\16\u0346\3\2\2\2\20\u03f2\3\2\2\2\22\u03f4\3\2\2\2"+
		"\24\u0403\3\2\2\2\26\u040f\3\2\2\2\30\u041c\3\2\2\2\32\u0420\3\2\2\2\34"+
		"\u0454\3\2\2\2\36\u0456\3\2\2\2 \u045a\3\2\2\2\"\u0466\3\2\2\2$\u0470"+
		"\3\2\2\2&\u0472\3\2\2\2(\u047a\3\2\2\2*\u0483\3\2\2\2,\u048b\3\2\2\2."+
		"\u048e\3\2\2\2\60\u0499\3\2\2\2\62\u04a9\3\2\2\2\64\u04af\3\2\2\2\66\u04b1"+
		"\3\2\2\28\u04bc\3\2\2\2:\u04cd\3\2\2\2<\u04d4\3\2\2\2>\u04d6\3\2\2\2@"+
		"\u04dc\3\2\2\2B\u04eb\3\2\2\2D\u04f7\3\2\2\2F\u0528\3\2\2\2H\u052d\3\2"+
		"\2\2J\u0543\3\2\2\2L\u0545\3\2\2\2N\u05aa\3\2\2\2P\u05ac\3\2\2\2R\u05c6"+
		"\3\2\2\2T\u05c8\3\2\2\2V\u05d7\3\2\2\2X\u0601\3\2\2\2Z\u0603\3\2\2\2\\"+
		"\u0623\3\2\2\2^\u0625\3\2\2\2`\u0637\3\2\2\2b\u0650\3\2\2\2d\u0662\3\2"+
		"\2\2f\u0664\3\2\2\2h\u0682\3\2\2\2j\u0686\3\2\2\2l\u068e\3\2\2\2n\u0699"+
		"\3\2\2\2p\u069d\3\2\2\2r\u06a8\3\2\2\2t\u06c5\3\2\2\2v\u06c7\3\2\2\2x"+
		"\u06d2\3\2\2\2z\u06e8\3\2\2\2|\u071b\3\2\2\2~\u0720\3\2\2\2\u0080\u0727"+
		"\3\2\2\2\u0082\u072b\3\2\2\2\u0084\u0735\3\2\2\2\u0086\u073d\3\2\2\2\u0088"+
		"\u0748\3\2\2\2\u008a\u0755\3\2\2\2\u008c\u0789\3\2\2\2\u008e\u078f\3\2"+
		"\2\2\u0090\u0826\3\2\2\2\u0092\u0841\3\2\2\2\u0094\u0843\3\2\2\2\u0096"+
		"\u0845\3\2\2\2\u0098\u0847\3\2\2\2\u009a\u0849\3\2\2\2\u009c\u084b\3\2"+
		"\2\2\u009e\u0852\3\2\2\2\u00a0\u085d\3\2\2\2\u00a2\u0862\3\2\2\2\u00a4"+
		"\u0886\3\2\2\2\u00a6\u0888\3\2\2\2\u00a8\u0890\3\2\2\2\u00aa\u0896\3\2"+
		"\2\2\u00ac\u089e\3\2\2\2\u00ae\u08a5\3\2\2\2\u00b0\u08aa\3\2\2\2\u00b2"+
		"\u08b3\3\2\2\2\u00b4\u08e1\3\2\2\2\u00b6\u08f3\3\2\2\2\u00b8\u08fc\3\2"+
		"\2\2\u00ba\u08fe\3\2\2\2\u00bc\u0916\3\2\2\2\u00be\u091b\3\2\2\2\u00c0"+
		"\u091d\3\2\2\2\u00c2\u093b\3\2\2\2\u00c4\u093d\3\2\2\2\u00c6\u00c7\5\16"+
		"\b\2\u00c7\u00c8\7\2\2\3\u00c8\3\3\2\2\2\u00c9\u00ca\5\u0082B\2\u00ca"+
		"\u00cb\7\2\2\3\u00cb\5\3\2\2\2\u00cc\u00cd\5~@\2\u00cd\u00ce\7\2\2\3\u00ce"+
		"\7\3\2\2\2\u00cf\u00d0\5\u0080A\2\u00d0\u00d1\7\2\2\3\u00d1\t\3\2\2\2"+
		"\u00d2\u00d3\5\u00a4S\2\u00d3\u00d4\7\2\2\3\u00d4\13\3\2\2\2\u00d5\u00d6"+
		"\5\u00a6T\2\u00d6\u00d7\7\2\2\3\u00d7\r\3\2\2\2\u00d8\u0347\5\32\16\2"+
		"\u00d9\u00da\7a\2\2\u00da\u0347\5\u00bc_\2\u00db\u00dc\7N\2\2\u00dc\u00e0"+
		"\7\u00cf\2\2\u00dd\u00de\7\u0080\2\2\u00de\u00df\7 \2\2\u00df\u00e1\7"+
		"\"\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e5\5\u00bc_\2\u00e3\u00e4\7q\2\2\u00e4\u00e6\7\u00f2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5\30\r\2"+
		"\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00eb"+
		"\7L\2\2\u00eb\u00ec\7\u00ba\2\2\u00ec\u00ee\5.\30\2\u00ed\u00ea\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u0347\3\2\2\2\u00ef\u00f0\7l\2\2\u00f0\u00f1"+
		"\7\u00cf\2\2\u00f1\u00f2\5\u00bc_\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7\u00ba"+
		"\2\2\u00f4\u00f5\5.\30\2\u00f5\u0347\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7"+
		"\u00fa\7\u00cf\2\2\u00f8\u00f9\7\u0080\2\2\u00f9\u00fb\7\"\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\5\u00bc_"+
		"\2\u00fd\u00ff\t\2\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0347"+
		"\3\2\2\2\u0100\u0105\5\22\n\2\u0101\u0102\7\3\2\2\u0102\u0103\5\u00a6"+
		"T\2\u0103\u0104\7\4\2\2\u0104\u0106\3\2\2\2\u0105\u0101\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\5,\27\2\u0108\u0109\7\u00b7"+
		"\2\2\u0109\u010b\5.\30\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010f\3\2\2\2\u010c\u010d\7\u00d7\2\2\u010d\u010e\7\24\2\2\u010e\u0110"+
		"\5h\65\2\u010f\u010c\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u0113\5\24\13\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3"+
		"\2\2\2\u0114\u0116\5\30\r\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0118\7q\2\2\u0118\u011a\7\u00f2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u011c\7\u00b9\2"+
		"\2\u011c\u011e\5.\30\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0123"+
		"\3\2\2\2\u011f\u0121\7\17\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0124\5\32\16\2\u0123\u0120\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0347\3\2\2\2\u0125\u012a\5\22\n\2\u0126\u0127\7\3\2\2"+
		"\u0127\u0128\5\u00a6T\2\u0128\u0129\7\4\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012d\7q"+
		"\2\2\u012d\u012f\7\u00f2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0136\3\2\2\2\u0130\u0131\7\u00d7\2\2\u0131\u0132\7\24\2\2\u0132\u0133"+
		"\7\3\2\2\u0133\u0134\5\u00a6T\2\u0134\u0135\7\4\2\2\u0135\u0137\3\2\2"+
		"\2\u0136\u0130\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a"+
		"\5\24\13\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2"+
		"\u013b\u013d\5\26\f\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u0140\5|?\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u0143\5:\36\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0145\3\2\2\2\u0144\u0146\5\30\r\2\u0145\u0144\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\7\u00b9\2\2\u0148\u014a"+
		"\5.\30\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014f\3\2\2\2\u014b"+
		"\u014d\7\17\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u0150\5\32\16\2\u014f\u014c\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0347\3\2\2\2\u0151\u0152\7N\2\2\u0152\u0156\7O\2\2\u0153\u0154\7\u0080"+
		"\2\2\u0154\u0155\7 \2\2\u0155\u0157\7\"\2\2\u0156\u0153\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\5~@\2\u0159\u015a\7$\2"+
		"\2\u015a\u015c\5~@\2\u015b\u015d\5\30\r\2\u015c\u015b\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u0347\3\2\2\2\u015e\u015f\7\u00d3\2\2\u015f\u0160\7O\2"+
		"\2\u0160\u0162\5~@\2\u0161\u0163\5 \21\2\u0162\u0161\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\u00d4\2\2\u0165\u016a\7\u00d6"+
		"\2\2\u0166\u016b\5\u00bc_\2\u0167\u0168\7-\2\2\u0168\u0169\7_\2\2\u0169"+
		"\u016b\5j\66\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u0347\3\2\2\2\u016c\u016d\7l\2\2\u016d\u016e\7O\2\2\u016e\u016f"+
		"\5~@\2\u016f\u0170\7\16\2\2\u0170\u0171\7_\2\2\u0171\u0172\7\3\2\2\u0172"+
		"\u0173\5\u00a6T\2\u0173\u0174\7\4\2\2\u0174\u0347\3\2\2\2\u0175\u0176"+
		"\7l\2\2\u0176\u0177\t\3\2\2\u0177\u0178\5~@\2\u0178\u0179\7m\2\2\u0179"+
		"\u017a\7i\2\2\u017a\u017b\5~@\2\u017b\u0347\3\2\2\2\u017c\u017d\7l\2\2"+
		"\u017d\u017e\t\3\2\2\u017e\u017f\5~@\2\u017f\u0180\7r\2\2\u0180\u0181"+
		"\7\u00b9\2\2\u0181\u0182\5.\30\2\u0182\u0347\3\2\2\2\u0183\u0184\7l\2"+
		"\2\u0184\u0185\t\3\2\2\u0185\u0186\5~@\2\u0186\u0187\7\u00b8\2\2\u0187"+
		"\u018a\7\u00b9\2\2\u0188\u0189\7\u0080\2\2\u0189\u018b\7\"\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\5.\30\2\u018d"+
		"\u0347\3\2\2\2\u018e\u018f\7l\2\2\u018f\u0190\7O\2\2\u0190\u0192\5~@\2"+
		"\u0191\u0193\5 \21\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\7\u00c7\2\2\u0195\u0197\7`\2\2\u0196\u0195\3\2\2"+
		"\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\5\u00bc_\2\u0199"+
		"\u019b\5\u00a8U\2\u019a\u019c\5\u00a2R\2\u019b\u019a\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u0347\3\2\2\2\u019d\u019e\7l\2\2\u019e\u019f\7O\2\2\u019f"+
		"\u01a1\5~@\2\u01a0\u01a2\5 \21\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2"+
		"\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7r\2\2\u01a4\u01a5\7\u00a0\2\2\u01a5"+
		"\u01a9\7\u00f2\2\2\u01a6\u01a7\7L\2\2\u01a7\u01a8\7\u00a1\2\2\u01a8\u01aa"+
		"\5.\30\2\u01a9\u01a6\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u0347\3\2\2\2\u01ab"+
		"\u01ac\7l\2\2\u01ac\u01ad\7O\2\2\u01ad\u01af\5~@\2\u01ae\u01b0\5 \21\2"+
		"\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\7r\2\2\u01b2\u01b3\7\u00a1\2\2\u01b3\u01b4\5.\30\2\u01b4\u0347\3\2\2"+
		"\2\u01b5\u01b6\7l\2\2\u01b6\u01b7\7O\2\2\u01b7\u01b8\5~@\2\u01b8\u01bc"+
		"\7\16\2\2\u01b9\u01ba\7\u0080\2\2\u01ba\u01bb\7 \2\2\u01bb\u01bd\7\"\2"+
		"\2\u01bc\u01b9\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01c0"+
		"\5\36\20\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2"+
		"\u01c1\u01c2\3\2\2\2\u01c2\u0347\3\2\2\2\u01c3\u01c4\7l\2\2\u01c4\u01c5"+
		"\7Q\2\2\u01c5\u01c6\5~@\2\u01c6\u01ca\7\16\2\2\u01c7\u01c8\7\u0080\2\2"+
		"\u01c8\u01c9\7 \2\2\u01c9\u01cb\7\"\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\5 \21\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u0347\3\2"+
		"\2\2\u01d1\u01d2\7l\2\2\u01d2\u01d3\7O\2\2\u01d3\u01d4\5~@\2\u01d4\u01d5"+
		"\5 \21\2\u01d5\u01d6\7m\2\2\u01d6\u01d7\7i\2\2\u01d7\u01d8\5 \21\2\u01d8"+
		"\u0347\3\2\2\2\u01d9\u01da\7l\2\2\u01da\u01db\7O\2\2\u01db\u01dc\5~@\2"+
		"\u01dc\u01df\7d\2\2\u01dd\u01de\7\u0080\2\2\u01de\u01e0\7\"\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e6\5 "+
		"\21\2\u01e2\u01e3\7\5\2\2\u01e3\u01e5\5 \21\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ea\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\7\u00cc\2\2\u01ea\u01e9\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u0347\3\2\2\2\u01ec\u01ed\7l\2\2\u01ed\u01ee\7Q\2"+
		"\2\u01ee\u01ef\5~@\2\u01ef\u01f2\7d\2\2\u01f0\u01f1\7\u0080\2\2\u01f1"+
		"\u01f3\7\"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f9\5 \21\2\u01f5\u01f6\7\5\2\2\u01f6\u01f8\5 \21\2\u01f7"+
		"\u01f5\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u0347\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7l\2\2\u01fd"+
		"\u01fe\7O\2\2\u01fe\u0200\5~@\2\u01ff\u0201\5 \21\2\u0200\u01ff\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7r\2\2\u0203\u0204"+
		"\5\30\r\2\u0204\u0347\3\2\2\2\u0205\u0206\7l\2\2\u0206\u0207\7O\2\2\u0207"+
		"\u0208\5~@\2\u0208\u0209\7\u00e0\2\2\u0209\u020a\7b\2\2\u020a\u0347\3"+
		"\2\2\2\u020b\u020c\7d\2\2\u020c\u020f\7O\2\2\u020d\u020e\7\u0080\2\2\u020e"+
		"\u0210\7\"\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0213\5~@\2\u0212\u0214\7\u00cc\2\2\u0213\u0212\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0347\3\2\2\2\u0215\u0216\7d\2\2\u0216\u0219\7Q\2"+
		"\2\u0217\u0218\7\u0080\2\2\u0218\u021a\7\"\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0347\5~@\2\u021c\u021f\7N\2"+
		"\2\u021d\u021e\7\35\2\2\u021e\u0220\7R\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0225\3\2\2\2\u0221\u0223\7\u00b5\2\2\u0222\u0221\3\2\2"+
		"\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\7\u00b6\2\2\u0225"+
		"\u0222\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022b\7Q"+
		"\2\2\u0228\u0229\7\u0080\2\2\u0229\u022a\7 \2\2\u022a\u022c\7\"\2\2\u022b"+
		"\u0228\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\5~"+
		"@\2\u022e\u0230\5p9\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0233"+
		"\3\2\2\2\u0231\u0232\7q\2\2\u0232\u0234\7\u00f2\2\2\u0233\u0231\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234\u0238\3\2\2\2\u0235\u0236\7\u00d7\2\2\u0236"+
		"\u0237\7=\2\2\u0237\u0239\5h\65\2\u0238\u0235\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u023c\3\2\2\2\u023a\u023b\7\u00b9\2\2\u023b\u023d\5.\30\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7\17"+
		"\2\2\u023f\u0240\5\32\16\2\u0240\u0347\3\2\2\2\u0241\u0244\7N\2\2\u0242"+
		"\u0243\7\35\2\2\u0243\u0245\7R\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2"+
		"\2\2\u0245\u0247\3\2\2\2\u0246\u0248\7\u00b5\2\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\u00b6\2\2\u024a\u024b"+
		"\7Q\2\2\u024b\u0250\5~@\2\u024c\u024d\7\3\2\2\u024d\u024e\5\u00a6T\2\u024e"+
		"\u024f\7\4\2\2\u024f\u0251\3\2\2\2\u0250\u024c\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u0255\5,\27\2\u0253\u0254\7\u00b7\2\2\u0254"+
		"\u0256\5.\30\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0347\3\2"+
		"\2\2\u0257\u0258\7l\2\2\u0258\u0259\7Q\2\2\u0259\u025b\5~@\2\u025a\u025c"+
		"\7\17\2\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2"+
		"\u025d\u025e\5\32\16\2\u025e\u0347\3\2\2\2\u025f\u0262\7N\2\2\u0260\u0261"+
		"\7\35\2\2\u0261\u0263\7R\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0265\3\2\2\2\u0264\u0266\7\u00b6\2\2\u0265\u0264\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026b\7\u00ad\2\2\u0268\u0269\7\u0080"+
		"\2\2\u0269\u026a\7 \2\2\u026a\u026c\7\"\2\2\u026b\u0268\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\5\u00ba^\2\u026e\u026f"+
		"\7\17\2\2\u026f\u0279\7\u00f2\2\2\u0270\u0271\7\u009f\2\2\u0271\u0276"+
		"\5@!\2\u0272\u0273\7\5\2\2\u0273\u0275\5@!\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0279\u0270\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u0347\3\2\2\2\u027b\u027d\7d\2\2\u027c\u027e\7\u00b6\2\2\u027d\u027c"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282\7\u00ad\2"+
		"\2\u0280\u0281\7\u0080\2\2\u0281\u0283\7\"\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0347\5\u00ba^\2\u0285\u0287"+
		"\7W\2\2\u0286\u0288\t\4\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289\u0347\5\16\b\2\u028a\u028b\7]\2\2\u028b\u028e\7^"+
		"\2\2\u028c\u028d\t\5\2\2\u028d\u028f\5\u00bc_\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0294\3\2\2\2\u0290\u0292\7$\2\2\u0291\u0290\3\2"+
		"\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\7\u00f2\2\2\u0294"+
		"\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0347\3\2\2\2\u0296\u0297\7]"+
		"\2\2\u0297\u0298\7O\2\2\u0298\u029b\7\u00ae\2\2\u0299\u029a\t\5\2\2\u029a"+
		"\u029c\5\u00bc_\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\u029e\7$\2\2\u029e\u02a0\7\u00f2\2\2\u029f\u02a1\5 \21"+
		"\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u0347\3\2\2\2\u02a2\u02a3"+
		"\7]\2\2\u02a3\u02a6\7\u00d0\2\2\u02a4\u02a5\7$\2\2\u02a5\u02a7\7\u00f2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u0347\3\2\2\2\u02a8"+
		"\u02a9\7]\2\2\u02a9\u02aa\7\u00b9\2\2\u02aa\u02af\5~@\2\u02ab\u02ac\7"+
		"\3\2\2\u02ac\u02ad\5\62\32\2\u02ad\u02ae\7\4\2\2\u02ae\u02b0\3\2\2\2\u02af"+
		"\u02ab\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u0347\3\2\2\2\u02b1\u02b2\7]"+
		"\2\2\u02b2\u02b3\7_\2\2\u02b3\u02b4\t\5\2\2\u02b4\u02b7\5~@\2\u02b5\u02b6"+
		"\t\5\2\2\u02b6\u02b8\5\u00bc_\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2"+
		"\2\u02b8\u0347\3\2\2\2\u02b9\u02ba\7]\2\2\u02ba\u02bb\7b\2\2\u02bb\u02bd"+
		"\5~@\2\u02bc\u02be\5 \21\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u0347\3\2\2\2\u02bf\u02c1\7]\2\2\u02c0\u02c2\5\u00bc_\2\u02c1\u02c0\3"+
		"\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02cb\7c\2\2\u02c4"+
		"\u02c6\7$\2\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c9\3\2"+
		"\2\2\u02c7\u02ca\5\u00ba^\2\u02c8\u02ca\7\u00f2\2\2\u02c9\u02c7\3\2\2"+
		"\2\u02c9\u02c8\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c5\3\2\2\2\u02cb\u02cc"+
		"\3\2\2\2\u02cc\u0347\3\2\2\2\u02cd\u02ce\7]\2\2\u02ce\u02cf\7N\2\2\u02cf"+
		"\u02d0\7O\2\2\u02d0\u0347\5~@\2\u02d1\u02d2\t\6\2\2\u02d2\u02d4\7\u00ad"+
		"\2\2\u02d3\u02d5\7\u00ae\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u0347\5$\23\2\u02d7\u02d8\t\6\2\2\u02d8\u02da\7\u00cf"+
		"\2\2\u02d9\u02db\7\u00ae\2\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u0347\5\u00bc_\2\u02dd\u02df\t\6\2\2\u02de\u02e0"+
		"\7O\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1"+
		"\u02e3\t\7\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e6\5~@\2\u02e5\u02e7\5 \21\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02ea\5&\24\2\u02e9\u02e8\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u0347\3\2\2\2\u02eb\u02ec\7\u00af\2\2\u02ec\u02ed"+
		"\7O\2\2\u02ed\u0347\5~@\2\u02ee\u02f6\7\u00af\2\2\u02ef\u02f7\7\u00f2"+
		"\2\2\u02f0\u02f2\13\2\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3"+
		"\u02f4\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2"+
		"\2\2\u02f6\u02ef\3\2\2\2\u02f6\u02f3\3\2\2\2\u02f7\u0347\3\2\2\2\u02f8"+
		"\u02fa\7\u00b1\2\2\u02f9\u02fb\7\u00b3\2\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\7O\2\2\u02fd\u0302\5~@\2\u02fe"+
		"\u0300\7\17\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3"+
		"\2\2\2\u0301\u0303\5\32\16\2\u0302\u02ff\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0347\3\2\2\2\u0304\u0305\7\u00b2\2\2\u0305\u0308\7O\2\2\u0306\u0307"+
		"\7\u0080\2\2\u0307\u0309\7\"\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a\u0347\5~@\2\u030b\u030c\7\u00b0\2\2\u030c"+
		"\u0347\7\u00b1\2\2\u030d\u030e\7\u00e3\2\2\u030e\u0310\7t\2\2\u030f\u0311"+
		"\7\u00ee\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2"+
		"\2\u0312\u0313\7\u00ef\2\2\u0313\u0315\7\u00f2\2\2\u0314\u0316\7\u009c"+
		"\2\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0318\7U\2\2\u0318\u0319\7O\2\2\u0319\u031b\5~@\2\u031a\u031c\5 \21\2"+
		"\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0347\3\2\2\2\u031d\u031e"+
		"\7\u00d2\2\2\u031e\u031f\7O\2\2\u031f\u0321\5~@\2\u0320\u0322\5 \21\2"+
		"\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0347\3\2\2\2\u0323\u0324"+
		"\7\u00de\2\2\u0324\u0325\7\u00df\2\2\u0325\u0326\7O\2\2\u0326\u0347\5"+
		"~@\2\u0327\u0328\t\b\2\2\u0328\u032c\5\u00bc_\2\u0329\u032b\13\2\2\2\u032a"+
		"\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032d\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032d\u0347\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\7r\2\2\u0330"+
		"\u0334\7\u00e4\2\2\u0331\u0333\13\2\2\2\u0332\u0331\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0347\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0337\u033b\7r\2\2\u0338\u033a\13\2\2\2\u0339\u0338\3\2"+
		"\2\2\u033a\u033d\3\2\2\2\u033b\u033c\3\2\2\2\u033b\u0339\3\2\2\2\u033c"+
		"\u0347\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0347\7s\2\2\u033f\u0343\5\20"+
		"\t\2\u0340\u0342\13\2\2\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2"+
		"\2\2\u0346\u00d8\3\2\2\2\u0346\u00d9\3\2\2\2\u0346\u00db\3\2\2\2\u0346"+
		"\u00ef\3\2\2\2\u0346\u00f6\3\2\2\2\u0346\u0100\3\2\2\2\u0346\u0125\3\2"+
		"\2\2\u0346\u0151\3\2\2\2\u0346\u015e\3\2\2\2\u0346\u016c\3\2\2\2\u0346"+
		"\u0175\3\2\2\2\u0346\u017c\3\2\2\2\u0346\u0183\3\2\2\2\u0346\u018e\3\2"+
		"\2\2\u0346\u019d\3\2\2\2\u0346\u01ab\3\2\2\2\u0346\u01b5\3\2\2\2\u0346"+
		"\u01c3\3\2\2\2\u0346\u01d1\3\2\2\2\u0346\u01d9\3\2\2\2\u0346\u01ec\3\2"+
		"\2\2\u0346\u01fc\3\2\2\2\u0346\u0205\3\2\2\2\u0346\u020b\3\2\2\2\u0346"+
		"\u0215\3\2\2\2\u0346\u021c\3\2\2\2\u0346\u0241\3\2\2\2\u0346\u0257\3\2"+
		"\2\2\u0346\u025f\3\2\2\2\u0346\u027b\3\2\2\2\u0346\u0285\3\2\2\2\u0346"+
		"\u028a\3\2\2\2\u0346\u0296\3\2\2\2\u0346\u02a2\3\2\2\2\u0346\u02a8\3\2"+
		"\2\2\u0346\u02b1\3\2\2\2\u0346\u02b9\3\2\2\2\u0346\u02bf\3\2\2\2\u0346"+
		"\u02cd\3\2\2\2\u0346\u02d1\3\2\2\2\u0346\u02d7\3\2\2\2\u0346\u02dd\3\2"+
		"\2\2\u0346\u02eb\3\2\2\2\u0346\u02ee\3\2\2\2\u0346\u02f8\3\2\2\2\u0346"+
		"\u0304\3\2\2\2\u0346\u030b\3\2\2\2\u0346\u030d\3\2\2\2\u0346\u031d\3\2"+
		"\2\2\u0346\u0323\3\2\2\2\u0346\u0327\3\2\2\2\u0346\u032f\3\2\2\2\u0346"+
		"\u0337\3\2\2\2\u0346\u033e\3\2\2\2\u0346\u033f\3\2\2\2\u0347\17\3\2\2"+
		"\2\u0348\u0349\7N\2\2\u0349\u03f3\7\u00e4\2\2\u034a\u034b\7d\2\2\u034b"+
		"\u03f3\7\u00e4\2\2\u034c\u034e\7\u00db\2\2\u034d\u034f\7\u00e4\2\2\u034e"+
		"\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u03f3\3\2\2\2\u0350\u0352\7\u00da"+
		"\2\2\u0351\u0353\7\u00e4\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u03f3\3\2\2\2\u0354\u0355\7]\2\2\u0355\u03f3\7\u00db\2\2\u0356\u0357"+
		"\7]\2\2\u0357\u0359\7\u00e4\2\2\u0358\u035a\7\u00db\2\2\u0359\u0358\3"+
		"\2\2\2\u0359\u035a\3\2\2\2\u035a\u03f3\3\2\2\2\u035b\u035c\7]\2\2\u035c"+
		"\u03f3\7\u00e7\2\2\u035d\u035e\7]\2\2\u035e\u03f3\7\u00e5\2\2\u035f\u0360"+
		"\7]\2\2\u0360\u0361\7G\2\2\u0361\u03f3\7\u00e5\2\2\u0362\u0363\7\u00e1"+
		"\2\2\u0363\u03f3\7O\2\2\u0364\u0365\7\u00e2\2\2\u0365\u03f3\7O\2\2\u0366"+
		"\u0367\7]\2\2\u0367\u03f3\7\u00e6\2\2\u0368\u0369\7]\2\2\u0369\u036a\7"+
		"N\2\2\u036a\u03f3\7O\2\2\u036b\u036c\7]\2\2\u036c\u03f3\7\u00e8\2\2\u036d"+
		"\u036e\7]\2\2\u036e\u03f3\7\u00ea\2\2\u036f\u0370\7]\2\2\u0370\u03f3\7"+
		"\u00eb\2\2\u0371\u0372\7N\2\2\u0372\u03f3\7\u00e9\2\2\u0373\u0374\7d\2"+
		"\2\u0374\u03f3\7\u00e9\2\2\u0375\u0376\7l\2\2\u0376\u03f3\7\u00e9\2\2"+
		"\u0377\u0378\7\u00dc\2\2\u0378\u03f3\7O\2\2\u0379\u037a\7\u00dc\2\2\u037a"+
		"\u03f3\7\u00cf\2\2\u037b\u037c\7\u00dd\2\2\u037c\u03f3\7O\2\2\u037d\u037e"+
		"\7\u00dd\2\2\u037e\u03f3\7\u00cf\2\2\u037f\u0380\7N\2\2\u0380\u0381\7"+
		"\u00b6\2\2\u0381\u03f3\7y\2\2\u0382\u0383\7d\2\2\u0383\u0384\7\u00b6\2"+
		"\2\u0384\u03f3\7y\2\2\u0385\u0386\7l\2\2\u0386\u0387\7O\2\2\u0387\u0388"+
		"\5~@\2\u0388\u0389\7 \2\2\u0389\u038a\7\u00ca\2\2\u038a\u03f3\3\2\2\2"+
		"\u038b\u038c\7l\2\2\u038c\u038d\7O\2\2\u038d\u038e\5~@\2\u038e\u038f\7"+
		"\u00ca\2\2\u038f\u0390\7\24\2\2\u0390\u03f3\3\2\2\2\u0391\u0392\7l\2\2"+
		"\u0392\u0393\7O\2\2\u0393\u0394\5~@\2\u0394\u0395\7 \2\2\u0395\u0396\7"+
		"\u00cb\2\2\u0396\u03f3\3\2\2\2\u0397\u0398\7l\2\2\u0398\u0399\7O\2\2\u0399"+
		"\u039a\5~@\2\u039a\u039b\7\u00bc\2\2\u039b\u039c\7\24\2\2\u039c\u03f3"+
		"\3\2\2\2\u039d\u039e\7l\2\2\u039e\u039f\7O\2\2\u039f\u03a0\5~@\2\u03a0"+
		"\u03a1\7 \2\2\u03a1\u03a2\7\u00bc\2\2\u03a2\u03f3\3\2\2\2\u03a3\u03a4"+
		"\7l\2\2\u03a4\u03a5\7O\2\2\u03a5\u03a6\5~@\2\u03a6\u03a7\7 \2\2\u03a7"+
		"\u03a8\7\u00bd\2\2\u03a8\u03a9\7\17\2\2\u03a9\u03aa\7\u00be\2\2\u03aa"+
		"\u03f3\3\2\2\2\u03ab\u03ac\7l\2\2\u03ac\u03ad\7O\2\2\u03ad\u03ae\5~@\2"+
		"\u03ae\u03af\7r\2\2\u03af\u03b0\7\u00bc\2\2\u03b0\u03b1\7\u00bf\2\2\u03b1"+
		"\u03f3\3\2\2\2\u03b2\u03b3\7l\2\2\u03b3\u03b4\7O\2\2\u03b4\u03b5\5~@\2"+
		"\u03b5\u03b6\7\u00c0\2\2\u03b6\u03b7\7A\2\2\u03b7\u03f3\3\2\2\2\u03b8"+
		"\u03b9\7l\2\2\u03b9\u03ba\7O\2\2\u03ba\u03bb\5~@\2\u03bb\u03bc\7\u00c1"+
		"\2\2\u03bc\u03bd\7A\2\2\u03bd\u03f3\3\2\2\2\u03be\u03bf\7l\2\2\u03bf\u03c0"+
		"\7O\2\2\u03c0\u03c1\5~@\2\u03c1\u03c2\7\u00c2\2\2\u03c2\u03c3\7A\2\2\u03c3"+
		"\u03f3\3\2\2\2\u03c4\u03c5\7l\2\2\u03c5\u03c6\7O\2\2\u03c6\u03c7\5~@\2"+
		"\u03c7\u03c8\7\u00c4\2\2\u03c8\u03f3\3\2\2\2\u03c9\u03ca\7l\2\2\u03ca"+
		"\u03cb\7O\2\2\u03cb\u03cd\5~@\2\u03cc\u03ce\5 \21\2\u03cd\u03cc\3\2\2"+
		"\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7\u00c5\2\2\u03d0"+
		"\u03f3\3\2\2\2\u03d1\u03d2\7l\2\2\u03d2\u03d3\7O\2\2\u03d3\u03d5\5~@\2"+
		"\u03d4\u03d6\5 \21\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7"+
		"\3\2\2\2\u03d7\u03d8\7\u00c6\2\2\u03d8\u03f3\3\2\2\2\u03d9\u03da\7l\2"+
		"\2\u03da\u03db\7O\2\2\u03db\u03dd\5~@\2\u03dc\u03de\5 \21\2\u03dd\u03dc"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\7r\2\2\u03e0"+
		"\u03e1\7\u00c3\2\2\u03e1\u03f3\3\2\2\2\u03e2\u03e3\7l\2\2\u03e3\u03e4"+
		"\7O\2\2\u03e4\u03e6\5~@\2\u03e5\u03e7\5 \21\2\u03e6\u03e5\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\7R\2\2\u03e9\u03ea\7_\2"+
		"\2\u03ea\u03f3\3\2\2\2\u03eb\u03ec\7u\2\2\u03ec\u03f3\7v\2\2\u03ed\u03f3"+
		"\7w\2\2\u03ee\u03f3\7x\2\2\u03ef\u03f3\7\u00d1\2\2\u03f0\u03f1\7T\2\2"+
		"\u03f1\u03f3\7\r\2\2\u03f2\u0348\3\2\2\2\u03f2\u034a\3\2\2\2\u03f2\u034c"+
		"\3\2\2\2\u03f2\u0350\3\2\2\2\u03f2\u0354\3\2\2\2\u03f2\u0356\3\2\2\2\u03f2"+
		"\u035b\3\2\2\2\u03f2\u035d\3\2\2\2\u03f2\u035f\3\2\2\2\u03f2\u0362\3\2"+
		"\2\2\u03f2\u0364\3\2\2\2\u03f2\u0366\3\2\2\2\u03f2\u0368\3\2\2\2\u03f2"+
		"\u036b\3\2\2\2\u03f2\u036d\3\2\2\2\u03f2\u036f\3\2\2\2\u03f2\u0371\3\2"+
		"\2\2\u03f2\u0373\3\2\2\2\u03f2\u0375\3\2\2\2\u03f2\u0377\3\2\2\2\u03f2"+
		"\u0379\3\2\2\2\u03f2\u037b\3\2\2\2\u03f2\u037d\3\2\2\2\u03f2\u037f\3\2"+
		"\2\2\u03f2\u0382\3\2\2\2\u03f2\u0385\3\2\2\2\u03f2\u038b\3\2\2\2\u03f2"+
		"\u0391\3\2\2\2\u03f2\u0397\3\2\2\2\u03f2\u039d\3\2\2\2\u03f2\u03a3\3\2"+
		"\2\2\u03f2\u03ab\3\2\2\2\u03f2\u03b2\3\2\2\2\u03f2\u03b8\3\2\2\2\u03f2"+
		"\u03be\3\2\2\2\u03f2\u03c4\3\2\2\2\u03f2\u03c9\3\2\2\2\u03f2\u03d1\3\2"+
		"\2\2\u03f2\u03d9\3\2\2\2\u03f2\u03e2\3\2\2\2\u03f2\u03eb\3\2\2\2\u03f2"+
		"\u03ed\3\2\2\2\u03f2\u03ee\3\2\2\2\u03f2\u03ef\3\2\2\2\u03f2\u03f0\3\2"+
		"\2\2\u03f3\21\3\2\2\2\u03f4\u03f6\7N\2\2\u03f5\u03f7\7\u00b6\2\2\u03f6"+
		"\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03fa\7\u00d8"+
		"\2\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u03ff\7O\2\2\u03fc\u03fd\7\u0080\2\2\u03fd\u03fe\7 \2\2\u03fe\u0400\7"+
		"\"\2\2\u03ff\u03fc\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0402\5~@\2\u0402\23\3\2\2\2\u0403\u0404\7\u00ca\2\2\u0404\u0405\7\24"+
		"\2\2\u0405\u0409\5h\65\2\u0406\u0407\7\u00cb\2\2\u0407\u0408\7\24\2\2"+
		"\u0408\u040a\5l\67\2\u0409\u0406\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b"+
		"\3\2\2\2\u040b\u040c\7U\2\2\u040c\u040d\7\u00f7\2\2\u040d\u040e\7\u00bb"+
		"\2\2\u040e\25\3\2\2\2\u040f\u0410\7\u00bc\2\2\u0410\u0411\7\24\2\2\u0411"+
		"\u0412\5h\65\2\u0412\u0415\7=\2\2\u0413\u0416\5\66\34\2\u0414\u0416\5"+
		"8\35\2\u0415\u0413\3\2\2\2\u0415\u0414\3\2\2\2\u0416\u041a\3\2\2\2\u0417"+
		"\u0418\7\u00bd\2\2\u0418\u0419\7\17\2\2\u0419\u041b\7\u00be\2\2\u041a"+
		"\u0417\3\2\2\2\u041a\u041b\3\2\2\2\u041b\27\3\2\2\2\u041c\u041d\7\u00bf"+
		"\2\2\u041d\u041e\7\u00f2\2\2\u041e\31\3\2\2\2\u041f\u0421\5(\25\2\u0420"+
		"\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\5B"+
		"\"\2\u0423\33\3\2\2\2\u0424\u0425\7S\2\2\u0425\u0426\7\u009c\2\2\u0426"+
		"\u0427\7O\2\2\u0427\u042e\5~@\2\u0428\u042c\5 \21\2\u0429\u042a\7\u0080"+
		"\2\2\u042a\u042b\7 \2\2\u042b\u042d\7\"\2\2\u042c\u0429\3\2\2\2\u042c"+
		"\u042d\3\2\2\2\u042d\u042f\3\2\2\2\u042e\u0428\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u0455\3\2\2\2\u0430\u0431\7S\2\2\u0431\u0433\7U\2\2\u0432\u0434"+
		"\7O\2\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0437\5~@\2\u0436\u0438\5 \21\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2"+
		"\2\u0438\u0455\3\2\2\2\u0439\u043a\7S\2\2\u043a\u043c\7\u009c\2\2\u043b"+
		"\u043d\7\u00ee\2\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u043f\7P\2\2\u043f\u0441\7\u00f2\2\2\u0440\u0442\5|?\2"+
		"\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0445"+
		"\5:\36\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0455\3\2\2\2\u0446"+
		"\u0447\7S\2\2\u0447\u0449\7\u009c\2\2\u0448\u044a\7\u00ee\2\2\u0449\u0448"+
		"\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d\7P\2\2\u044c"+
		"\u044e\7\u00f2\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f"+
		"\3\2\2\2\u044f\u0452\5,\27\2\u0450\u0451\7\u00b7\2\2\u0451\u0453\5.\30"+
		"\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0424"+
		"\3\2\2\2\u0454\u0430\3\2\2\2\u0454\u0439\3\2\2\2\u0454\u0446\3\2\2\2\u0455"+
		"\35\3\2\2\2\u0456\u0458\5 \21\2\u0457\u0459\5\30\r\2\u0458\u0457\3\2\2"+
		"\2\u0458\u0459\3\2\2\2\u0459\37\3\2\2\2\u045a\u045b\7A\2\2\u045b\u045c"+
		"\7\3\2\2\u045c\u0461\5\"\22\2\u045d\u045e\7\5\2\2\u045e\u0460\5\"\22\2"+
		"\u045f\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0465\7\4\2\2\u0465"+
		"!\3\2\2\2\u0466\u0469\5\u00bc_\2\u0467\u0468\7\u0082\2\2\u0468\u046a\5"+
		"\u0092J\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a#\3\2\2\2\u046b"+
		"\u0471\5\u00ba^\2\u046c\u0471\7\u00f2\2\2\u046d\u0471\5\u0094K\2\u046e"+
		"\u0471\5\u0096L\2\u046f\u0471\5\u0098M\2\u0470\u046b\3\2\2\2\u0470\u046c"+
		"\3\2\2\2\u0470\u046d\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u046f\3\2\2\2\u0471"+
		"%\3\2\2\2\u0472\u0477\5\u00bc_\2\u0473\u0474\7\6\2\2\u0474\u0476\5\u00bc"+
		"_\2\u0475\u0473\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478\'\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047b\7L\2\2"+
		"\u047b\u0480\5*\26\2\u047c\u047d\7\5\2\2\u047d\u047f\5*\26\2\u047e\u047c"+
		"\3\2\2\2\u047f\u0482\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		")\3\2\2\2\u0482\u0480\3\2\2\2\u0483\u0485\5\u00bc_\2\u0484\u0486\7\17"+
		"\2\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0488\7\3\2\2\u0488\u0489\5\32\16\2\u0489\u048a\7\4\2\2\u048a+\3\2\2"+
		"\2\u048b\u048c\7\u009f\2\2\u048c\u048d\5\u00ba^\2\u048d-\3\2\2\2\u048e"+
		"\u048f\7\3\2\2\u048f\u0494\5\60\31\2\u0490\u0491\7\5\2\2\u0491\u0493\5"+
		"\60\31\2\u0492\u0490\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u0497\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498\7\4"+
		"\2\2\u0498/\3\2\2\2\u0499\u049e\5\62\32\2\u049a\u049c\7\u0082\2\2\u049b"+
		"\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049f\5\64"+
		"\33\2\u049e\u049b\3\2\2\2\u049e\u049f\3\2\2\2\u049f\61\3\2\2\2\u04a0\u04a5"+
		"\5\u00bc_\2\u04a1\u04a2\7\6\2\2\u04a2\u04a4\5\u00bc_\2\u04a3\u04a1\3\2"+
		"\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04aa\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04aa\7\u00f2\2\2\u04a9\u04a0"+
		"\3\2\2\2\u04a9\u04a8\3\2\2\2\u04aa\63\3\2\2\2\u04ab\u04b0\7\u00f7\2\2"+
		"\u04ac\u04b0\7\u00f8\2\2\u04ad\u04b0\5\u009aN\2\u04ae\u04b0\7\u00f2\2"+
		"\2\u04af\u04ab\3\2\2\2\u04af\u04ac\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04ae"+
		"\3\2\2\2\u04b0\65\3\2\2\2\u04b1\u04b2\7\3\2\2\u04b2\u04b7\5\u0092J\2\u04b3"+
		"\u04b4\7\5\2\2\u04b4\u04b6\5\u0092J\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9"+
		"\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9"+
		"\u04b7\3\2\2\2\u04ba\u04bb\7\4\2\2\u04bb\67\3\2\2\2\u04bc\u04bd\7\3\2"+
		"\2\u04bd\u04c2\5\66\34\2\u04be\u04bf\7\5\2\2\u04bf\u04c1\5\66\34\2\u04c0"+
		"\u04be\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2"+
		"\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c6\7\4\2\2\u04c6"+
		"9\3\2\2\2\u04c7\u04c8\7\u00bd\2\2\u04c8\u04c9\7\17\2\2\u04c9\u04ce\5<"+
		"\37\2\u04ca\u04cb\7\u00bd\2\2\u04cb\u04cc\7\24\2\2\u04cc\u04ce\5> \2\u04cd"+
		"\u04c7\3\2\2\2\u04cd\u04ca\3\2\2\2\u04ce;\3\2\2\2\u04cf\u04d0\7\u00cd"+
		"\2\2\u04d0\u04d1\7\u00f2\2\2\u04d1\u04d2\7\u00ce\2\2\u04d2\u04d5\7\u00f2"+
		"\2\2\u04d3\u04d5\5\u00bc_\2\u04d4\u04cf\3\2\2\2\u04d4\u04d3\3\2\2\2\u04d5"+
		"=\3\2\2\2\u04d6\u04da\7\u00f2\2\2\u04d7\u04d8\7L\2\2\u04d8\u04d9\7\u00a1"+
		"\2\2\u04d9\u04db\5.\30\2\u04da\u04d7\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"?\3\2\2\2\u04dc\u04dd\5\u00bc_\2\u04dd\u04de\7\u00f2\2\2\u04deA\3\2\2"+
		"\2\u04df\u04e1\5\34\17\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04e2\3\2\2\2\u04e2\u04e3\5H%\2\u04e3\u04e4\5D#\2\u04e4\u04ec\3\2\2\2"+
		"\u04e5\u04e7\5T+\2\u04e6\u04e8\5F$\2\u04e7\u04e6\3\2\2\2\u04e8\u04e9\3"+
		"\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb"+
		"\u04e0\3\2\2\2\u04eb\u04e5\3\2\2\2\u04ecC\3\2\2\2\u04ed\u04ee\7\31\2\2"+
		"\u04ee\u04ef\7\24\2\2\u04ef\u04f4\5L\'\2\u04f0\u04f1\7\5\2\2\u04f1\u04f3"+
		"\5L\'\2\u04f2\u04f0\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04ed\3\2"+
		"\2\2\u04f7\u04f8\3\2\2\2\u04f8\u0503\3\2\2\2\u04f9\u04fa\7\u009a\2\2\u04fa"+
		"\u04fb\7\24\2\2\u04fb\u0500\5\u0086D\2\u04fc\u04fd\7\5\2\2\u04fd\u04ff"+
		"\5\u0086D\2\u04fe\u04fc\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2\2"+
		"\2\u0500\u0501\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0503\u04f9"+
		"\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u050f\3\2\2\2\u0505\u0506\7\u009b\2"+
		"\2\u0506\u0507\7\24\2\2\u0507\u050c\5\u0086D\2\u0508\u0509\7\5\2\2\u0509"+
		"\u050b\5\u0086D\2\u050a\u0508\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a"+
		"\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050f"+
		"\u0505\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u051b\3\2\2\2\u0511\u0512\7\u0099"+
		"\2\2\u0512\u0513\7\24\2\2\u0513\u0518\5L\'\2\u0514\u0515\7\5\2\2\u0515"+
		"\u0517\5L\'\2\u0516\u0514\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2"+
		"\2\2\u0518\u0519\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051b"+
		"\u0511\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051f\5\u00b0"+
		"Y\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0525\3\2\2\2\u0520"+
		"\u0523\7\33\2\2\u0521\u0524\7\20\2\2\u0522\u0524\5\u0086D\2\u0523\u0521"+
		"\3\2\2\2\u0523\u0522\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u0520\3\2\2\2\u0525"+
		"\u0526\3\2\2\2\u0526E\3\2\2\2\u0527\u0529\5\34\17\2\u0528\u0527\3\2\2"+
		"\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\5N(\2\u052b\u052c"+
		"\5D#\2\u052cG\3\2\2\2\u052d\u052e\b%\1\2\u052e\u052f\5J&\2\u052f\u0538"+
		"\3\2\2\2\u0530\u0531\f\3\2\2\u0531\u0533\t\t\2\2\u0532\u0534\5\\/\2\u0533"+
		"\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\5H"+
		"%\4\u0536\u0530\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0536\3\2\2\2\u0538"+
		"\u0539\3\2\2\2\u0539I\3\2\2\2\u053a\u0538\3\2\2\2\u053b\u0544\5N(\2\u053c"+
		"\u053d\7O\2\2\u053d\u0544\5~@\2\u053e\u0544\5v<\2\u053f\u0540\7\3\2\2"+
		"\u0540\u0541\5B\"\2\u0541\u0542\7\4\2\2\u0542\u0544\3\2\2\2\u0543\u053b"+
		"\3\2\2\2\u0543\u053c\3\2\2\2\u0543\u053e\3\2\2\2\u0543\u053f\3\2\2\2\u0544"+
		"K\3\2\2\2\u0545\u0547\5\u0086D\2\u0546\u0548\t\n\2\2\u0547\u0546\3\2\2"+
		"\2\u0547\u0548\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u054a\7*\2\2\u054a\u054c"+
		"\t\13\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054cM\3\2\2\2\u054d"+
		"\u054e\7\f\2\2\u054e\u054f\7\u009d\2\2\u054f\u0550\7\3\2\2\u0550\u0551"+
		"\5\u0084C\2\u0551\u0552\7\4\2\2\u0552\u0558\3\2\2\2\u0553\u0554\7o\2\2"+
		"\u0554\u0558\5\u0084C\2\u0555\u0556\7\u009e\2\2\u0556\u0558\5\u0084C\2"+
		"\u0557\u054d\3\2\2\2\u0557\u0553\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u055a"+
		"\3\2\2\2\u0559\u055b\5|?\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055e\3\2\2\2\u055c\u055d\7\u00a3\2\2\u055d\u055f\7\u00f2\2\2\u055e\u055c"+
		"\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\7\u009f\2"+
		"\2\u0561\u056e\7\u00f2\2\2\u0562\u056c\7\17\2\2\u0563\u056d\5j\66\2\u0564"+
		"\u056d\5\u00a6T\2\u0565\u0568\7\3\2\2\u0566\u0569\5j\66\2\u0567\u0569"+
		"\5\u00a6T\2\u0568\u0566\3\2\2\2\u0568\u0567\3\2\2\2\u0569\u056a\3\2\2"+
		"\2\u056a\u056b\7\4\2\2\u056b\u056d\3\2\2\2\u056c\u0563\3\2\2\2\u056c\u0564"+
		"\3\2\2\2\u056c\u0565\3\2\2\2\u056d\u056f\3\2\2\2\u056e\u0562\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u0571\3\2\2\2\u0570\u0572\5|?\2\u0571\u0570\3\2\2"+
		"\2\u0571\u0572\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0574\7\u00a2\2\2\u0574"+
		"\u0576\7\u00f2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578"+
		"\3\2\2\2\u0577\u0579\5T+\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057c\3\2\2\2\u057a\u057b\7\22\2\2\u057b\u057d\5\u0088E\2\u057c\u057a"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u05ab\3\2\2\2\u057e\u0582\7\f\2\2\u057f"+
		"\u0581\5P)\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2"+
		"\2\u0582\u0583\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0587"+
		"\5\\/\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588"+
		"\u058a\5\u0084C\2\u0589\u058b\5T+\2\u058a\u0589\3\2\2\2\u058a\u058b\3"+
		"\2\2\2\u058b\u0595\3\2\2\2\u058c\u0592\5T+\2\u058d\u058f\7\f\2\2\u058e"+
		"\u0590\5\\/\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2"+
		"\2\2\u0591\u0593\5\u0084C\2\u0592\u058d\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u0595\3\2\2\2\u0594\u057e\3\2\2\2\u0594\u058c\3\2\2\2\u0595\u0599\3\2"+
		"\2\2\u0596\u0598\5Z.\2\u0597\u0596\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597"+
		"\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059e\3\2\2\2\u059b\u0599\3\2\2\2\u059c"+
		"\u059d\7\22\2\2\u059d\u059f\5\u0088E\2\u059e\u059c\3\2\2\2\u059e\u059f"+
		"\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u05a2\5V,\2\u05a1\u05a0\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a4\7\32\2\2\u05a4\u05a6\5"+
		"\u0088E\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2\2"+
		"\u05a7\u05a9\5\u00b0Y\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05ab\3\2\2\2\u05aa\u0557\3\2\2\2\u05aa\u0594\3\2\2\2\u05abO\3\2\2\2"+
		"\u05ac\u05ad\7\7\2\2\u05ad\u05b4\5R*\2\u05ae\u05b0\7\5\2\2\u05af\u05ae"+
		"\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\5R*\2\u05b2"+
		"\u05af\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2"+
		"\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05b8\7\b\2\2\u05b8"+
		"Q\3\2\2\2\u05b9\u05c7\5\u00bc_\2\u05ba\u05bb\5\u00bc_\2\u05bb\u05bc\7"+
		"\3\2\2\u05bc\u05c1\5\u0090I\2\u05bd\u05be\7\5\2\2\u05be\u05c0\5\u0090"+
		"I\2\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1"+
		"\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c5\7\4"+
		"\2\2\u05c5\u05c7\3\2\2\2\u05c6\u05b9\3\2\2\2\u05c6\u05ba\3\2\2\2\u05c7"+
		"S\3\2\2\2\u05c8\u05c9\7\r\2\2\u05c9\u05ce\5^\60\2\u05ca\u05cb\7\5\2\2"+
		"\u05cb\u05cd\5^\60\2\u05cc\u05ca\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d4\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1"+
		"\u05d3\5Z.\2\u05d2\u05d1\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2"+
		"\2\u05d4\u05d5\3\2\2\2\u05d5U\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d8"+
		"\7\23\2\2\u05d8\u05d9\7\24\2\2\u05d9\u05de\5\u0086D\2\u05da\u05db\7\5"+
		"\2\2\u05db\u05dd\5\u0086D\2\u05dc\u05da\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de"+
		"\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05f2\3\2\2\2\u05e0\u05de\3\2"+
		"\2\2\u05e1\u05e2\7L\2\2\u05e2\u05f3\7\30\2\2\u05e3\u05e4\7L\2\2\u05e4"+
		"\u05f3\7\27\2\2\u05e5\u05e6\7\25\2\2\u05e6\u05e7\7\26\2\2\u05e7\u05e8"+
		"\7\3\2\2\u05e8\u05ed\5X-\2\u05e9\u05ea\7\5\2\2\u05ea\u05ec\5X-\2\u05eb"+
		"\u05e9\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2"+
		"\2\2\u05ee\u05f0\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05f1\7\4\2\2\u05f1"+
		"\u05f3\3\2\2\2\u05f2\u05e1\3\2\2\2\u05f2\u05e3\3\2\2\2\u05f2\u05e5\3\2"+
		"\2\2\u05f2\u05f3\3\2\2\2\u05f3W\3\2\2\2\u05f4\u05fd\7\3\2\2\u05f5\u05fa"+
		"\5\u0086D\2\u05f6\u05f7\7\5\2\2\u05f7\u05f9\5\u0086D\2\u05f8\u05f6\3\2"+
		"\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05f5\3\2\2\2\u05fd\u05fe\3\2"+
		"\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0602\7\4\2\2\u0600\u0602\5\u0086D\2\u0601"+
		"\u05f4\3\2\2\2\u0601\u0600\3\2\2\2\u0602Y\3\2\2\2\u0603\u0604\7>\2\2\u0604"+
		"\u0606\7Q\2\2\u0605\u0607\7\66\2\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2"+
		"\2\2\u0607\u0608\3\2\2\2\u0608\u0609\5\u00ba^\2\u0609\u0612\7\3\2\2\u060a"+
		"\u060f\5\u0086D\2\u060b\u060c\7\5\2\2\u060c\u060e\5\u0086D\2\u060d\u060b"+
		"\3\2\2\2\u060e\u0611\3\2\2\2\u060f\u060d\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0612\u060a\3\2\2\2\u0612\u0613\3\2"+
		"\2\2\u0613\u0614\3\2\2\2\u0614\u0615\7\4\2\2\u0615\u0621\5\u00bc_\2\u0616"+
		"\u0618\7\17\2\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3"+
		"\2\2\2\u0619\u061e\5\u00bc_\2\u061a\u061b\7\5\2\2\u061b\u061d\5\u00bc"+
		"_\2\u061c\u061a\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0621\u0617\3\2"+
		"\2\2\u0621\u0622\3\2\2\2\u0622[\3\2\2\2\u0623\u0624\t\f\2\2\u0624]\3\2"+
		"\2\2\u0625\u0629\5t;\2\u0626\u0628\5`\61\2\u0627\u0626\3\2\2\2\u0628\u062b"+
		"\3\2\2\2\u0629\u0627\3\2\2\2\u0629\u062a\3\2\2\2\u062a_\3\2\2\2\u062b"+
		"\u0629\3\2\2\2\u062c\u062d\5b\62\2\u062d\u062e\7\64\2\2\u062e\u0630\5"+
		"t;\2\u062f\u0631\5d\63\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u0638\3\2\2\2\u0632\u0633\7<\2\2\u0633\u0634\5b\62\2\u0634\u0635\7\64"+
		"\2\2\u0635\u0636\5t;\2\u0636\u0638\3\2\2\2\u0637\u062c\3\2\2\2\u0637\u0632"+
		"\3\2\2\2\u0638a\3\2\2\2\u0639\u063b\7\67\2\2\u063a\u0639\3\2\2\2\u063a"+
		"\u063b\3\2\2\2\u063b\u0651\3\2\2\2\u063c\u0651\7\65\2\2\u063d\u063f\7"+
		"8\2\2\u063e\u0640\7\66\2\2\u063f\u063e\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"\u0651\3\2\2\2\u0641\u0642\78\2\2\u0642\u0651\79\2\2\u0643\u0645\7:\2"+
		"\2\u0644\u0646\7\66\2\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646"+
		"\u0651\3\2\2\2\u0647\u0649\7;\2\2\u0648\u064a\7\66\2\2\u0649\u0648\3\2"+
		"\2\2\u0649\u064a\3\2\2\2\u064a\u0651\3\2\2\2\u064b\u064d\78\2\2\u064c"+
		"\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0651\7\u00ed"+
		"\2\2\u064f\u0651\7~\2\2\u0650\u063a\3\2\2\2\u0650\u063c\3\2\2\2\u0650"+
		"\u063d\3\2\2\2\u0650\u0641\3\2\2\2\u0650\u0643\3\2\2\2\u0650\u0647\3\2"+
		"\2\2\u0650\u064c\3\2\2\2\u0650\u064f\3\2\2\2\u0651c\3\2\2\2\u0652\u0653"+
		"\7=\2\2\u0653\u0663\5\u0088E\2\u0654\u0655\7\u009f\2\2\u0655\u0656\7\3"+
		"\2\2\u0656\u065b\5\u00bc_\2\u0657\u0658\7\5\2\2\u0658\u065a\5\u00bc_\2"+
		"\u0659\u0657\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065c"+
		"\3\2\2\2\u065c\u065e\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u065f\7\4\2\2\u065f"+
		"\u0663\3\2\2\2\u0660\u0661\7\177\2\2\u0661\u0663\5\u0088E\2\u0662\u0652"+
		"\3\2\2\2\u0662\u0654\3\2\2\2\u0662\u0660\3\2\2\2\u0663e\3\2\2\2\u0664"+
		"\u0665\7j\2\2\u0665\u067e\7\3\2\2\u0666\u0668\7\u008b\2\2\u0667\u0666"+
		"\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\t\r\2\2\u066a"+
		"\u067f\7\u0095\2\2\u066b\u066c\5\u0086D\2\u066c\u066d\7C\2\2\u066d\u067f"+
		"\3\2\2\2\u066e\u067f\7\u00f6\2\2\u066f\u0670\7\u0096\2\2\u0670\u0671\7"+
		"\u00f7\2\2\u0671\u0672\7\u0097\2\2\u0672\u0673\7\u0098\2\2\u0673\u067c"+
		"\7\u00f7\2\2\u0674\u067a\7=\2\2\u0675\u067b\5\u00bc_\2\u0676\u0677\5\u00ba"+
		"^\2\u0677\u0678\7\3\2\2\u0678\u0679\7\4\2\2\u0679\u067b\3\2\2\2\u067a"+
		"\u0675\3\2\2\2\u067a\u0676\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u0674\3\2"+
		"\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2\2\2\u067e\u0667\3\2\2\2\u067e"+
		"\u066b\3\2\2\2\u067e\u066e\3\2\2\2\u067e\u066f\3\2\2\2\u067f\u0680\3\2"+
		"\2\2\u0680\u0681\7\4\2\2\u0681g\3\2\2\2\u0682\u0683\7\3\2\2\u0683\u0684"+
		"\5j\66\2\u0684\u0685\7\4\2\2\u0685i\3\2\2\2\u0686\u068b\5\u00bc_\2\u0687"+
		"\u0688\7\5\2\2\u0688\u068a\5\u00bc_\2\u0689\u0687\3\2\2\2\u068a\u068d"+
		"\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068ck\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068e\u068f\7\3\2\2\u068f\u0694\5n8\2\u0690\u0691\7\5\2"+
		"\2\u0691\u0693\5n8\2\u0692\u0690\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0692"+
		"\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\3\2\2\2\u0696\u0694\3\2\2\2\u0697"+
		"\u0698\7\4\2\2\u0698m\3\2\2\2\u0699\u069b\5\u00bc_\2\u069a\u069c\t\n\2"+
		"\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069co\3\2\2\2\u069d\u069e"+
		"\7\3\2\2\u069e\u06a3\5r:\2\u069f\u06a0\7\5\2\2\u06a0\u06a2\5r:\2\u06a1"+
		"\u069f\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3\u06a4\3\2"+
		"\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06a7\7\4\2\2\u06a7"+
		"q\3\2\2\2\u06a8\u06ab\5\u00bc_\2\u06a9\u06aa\7q\2\2\u06aa\u06ac\7\u00f2"+
		"\2\2\u06ab\u06a9\3\2\2\2\u06ab\u06ac\3\2\2\2\u06acs\3\2\2\2\u06ad\u06af"+
		"\5~@\2\u06ae\u06b0\5f\64\2\u06af\u06ae\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0"+
		"\u06b1\3\2\2\2\u06b1\u06b2\5z>\2\u06b2\u06c6\3\2\2\2\u06b3\u06b4\7\3\2"+
		"\2\u06b4\u06b5\5B\"\2\u06b5\u06b7\7\4\2\2\u06b6\u06b8\5f\64\2\u06b7\u06b6"+
		"\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\5z>\2\u06ba"+
		"\u06c6\3\2\2\2\u06bb\u06bc\7\3\2\2\u06bc\u06bd\5^\60\2\u06bd\u06bf\7\4"+
		"\2\2\u06be\u06c0\5f\64\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0"+
		"\u06c1\3\2\2\2\u06c1\u06c2\5z>\2\u06c2\u06c6\3\2\2\2\u06c3\u06c6\5v<\2"+
		"\u06c4\u06c6\5x=\2\u06c5\u06ad\3\2\2\2\u06c5\u06b3\3\2\2\2\u06c5\u06bb"+
		"\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c4\3\2\2\2\u06c6u\3\2\2\2\u06c7"+
		"\u06c8\7M\2\2\u06c8\u06cd\5\u0086D\2\u06c9\u06ca\7\5\2\2\u06ca\u06cc\5"+
		"\u0086D\2\u06cb\u06c9\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2"+
		"\u06cd\u06ce\3\2\2\2\u06ce\u06d0\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u06d1"+
		"\5z>\2\u06d1w\3\2\2\2\u06d2\u06d3\5\u00bc_\2\u06d3\u06dc\7\3\2\2\u06d4"+
		"\u06d9\5\u0086D\2\u06d5\u06d6\7\5\2\2\u06d6\u06d8\5\u0086D\2\u06d7\u06d5"+
		"\3\2\2\2\u06d8\u06db\3\2\2\2\u06d9\u06d7\3\2\2\2\u06d9\u06da\3\2\2\2\u06da"+
		"\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06dc\u06d4\3\2\2\2\u06dc\u06dd\3\2"+
		"\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\7\4\2\2\u06df\u06e0\5z>\2\u06e0y"+
		"\3\2\2\2\u06e1\u06e3\7\17\2\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2"+
		"\u06e3\u06e4\3\2\2\2\u06e4\u06e6\5\u00be`\2\u06e5\u06e7\5h\65\2\u06e6"+
		"\u06e5\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06e2\3\2"+
		"\2\2\u06e8\u06e9\3\2\2\2\u06e9{\3\2\2\2\u06ea\u06eb\7K\2\2\u06eb\u06ec"+
		"\7X\2\2\u06ec\u06ed\7\u00a0\2\2\u06ed\u06f1\7\u00f2\2\2\u06ee\u06ef\7"+
		"L\2\2\u06ef\u06f0\7\u00a1\2\2\u06f0\u06f2\5.\30\2\u06f1\u06ee\3\2\2\2"+
		"\u06f1\u06f2\3\2\2\2\u06f2\u071c\3\2\2\2\u06f3\u06f4\7K\2\2\u06f4\u06f5"+
		"\7X\2\2\u06f5\u06ff\7\u00a4\2\2\u06f6\u06f7\7\u00a5\2\2\u06f7\u06f8\7"+
		"\u00a6\2\2\u06f8\u06f9\7\24\2\2\u06f9\u06fd\7\u00f2\2\2\u06fa\u06fb\7"+
		"\u00aa\2\2\u06fb\u06fc\7\24\2\2\u06fc\u06fe\7\u00f2\2\2\u06fd\u06fa\3"+
		"\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700\3\2\2\2\u06ff\u06f6\3\2\2\2\u06ff"+
		"\u0700\3\2\2\2\u0700\u0706\3\2\2\2\u0701\u0702\7\u00a7\2\2\u0702\u0703"+
		"\7\u00a8\2\2\u0703\u0704\7\u00a6\2\2\u0704\u0705\7\24\2\2\u0705\u0707"+
		"\7\u00f2\2\2\u0706\u0701\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u070d\3\2\2"+
		"\2\u0708\u0709\7o\2\2\u0709\u070a\7\u00a9\2\2\u070a\u070b\7\u00a6\2\2"+
		"\u070b\u070c\7\24\2\2\u070c\u070e\7\u00f2\2\2\u070d\u0708\3\2\2\2\u070d"+
		"\u070e\3\2\2\2\u070e\u0713\3\2\2\2\u070f\u0710\7\u00ab\2\2\u0710\u0711"+
		"\7\u00a6\2\2\u0711\u0712\7\24\2\2\u0712\u0714\7\u00f2\2\2\u0713\u070f"+
		"\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0719\3\2\2\2\u0715\u0716\7\'\2\2\u0716"+
		"\u0717\7\u00d9\2\2\u0717\u0718\7\17\2\2\u0718\u071a\7\u00f2\2\2\u0719"+
		"\u0715\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071c\3\2\2\2\u071b\u06ea\3\2"+
		"\2\2\u071b\u06f3\3\2\2\2\u071c}\3\2\2\2\u071d\u071e\5\u00bc_\2\u071e\u071f"+
		"\7\6\2\2\u071f\u0721\3\2\2\2\u0720\u071d\3\2\2\2\u0720\u0721\3\2\2\2\u0721"+
		"\u0722\3\2\2\2\u0722\u0723\5\u00bc_\2\u0723\177\3\2\2\2\u0724\u0725\5"+
		"\u00bc_\2\u0725\u0726\7\6\2\2\u0726\u0728\3\2\2\2\u0727\u0724\3\2\2\2"+
		"\u0727\u0728\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\5\u00bc_\2\u072a"+
		"\u0081\3\2\2\2\u072b\u0733\5\u0086D\2\u072c\u072e\7\17\2\2\u072d\u072c"+
		"\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0731\3\2\2\2\u072f\u0732\5\u00bc_"+
		"\2\u0730\u0732\5h\65\2\u0731\u072f\3\2\2\2\u0731\u0730\3\2\2\2\u0732\u0734"+
		"\3\2\2\2\u0733\u072d\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0083\3\2\2\2\u0735"+
		"\u073a\5\u0082B\2\u0736\u0737\7\5\2\2\u0737\u0739\5\u0082B\2\u0738\u0736"+
		"\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3\2\2\2\u073a\u073b\3\2\2\2\u073b"+
		"\u0085\3\2\2\2\u073c\u073a\3\2\2\2\u073d\u073e\5\u0088E\2\u073e\u0087"+
		"\3\2\2\2\u073f\u0740\bE\1\2\u0740\u0741\7 \2\2\u0741\u0749\5\u0088E\7"+
		"\u0742\u0743\7\"\2\2\u0743\u0744\7\3\2\2\u0744\u0745\5\32\16\2\u0745\u0746"+
		"\7\4\2\2\u0746\u0749\3\2\2\2\u0747\u0749\5\u008aF\2\u0748\u073f\3\2\2"+
		"\2\u0748\u0742\3\2\2\2\u0748\u0747\3\2\2\2\u0749\u0752\3\2\2\2\u074a\u074b"+
		"\f\4\2\2\u074b\u074c\7\36\2\2\u074c\u0751\5\u0088E\5\u074d\u074e\f\3\2"+
		"\2\u074e\u074f\7\35\2\2\u074f\u0751\5\u0088E\4\u0750\u074a\3\2\2\2\u0750"+
		"\u074d\3\2\2\2\u0751\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2"+
		"\2\2\u0753\u0089\3\2\2\2\u0754\u0752\3\2\2\2\u0755\u0757\5\u008eH\2\u0756"+
		"\u0758\5\u008cG\2\u0757\u0756\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u008b"+
		"\3\2\2\2\u0759\u075b\7 \2\2\u075a\u0759\3\2\2\2\u075a\u075b\3\2\2\2\u075b"+
		"\u075c\3\2\2\2\u075c\u075d\7#\2\2\u075d\u075e\5\u008eH\2\u075e\u075f\7"+
		"\36\2\2\u075f\u0760\5\u008eH\2\u0760\u078a\3\2\2\2\u0761\u0763\7 \2\2"+
		"\u0762\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765"+
		"\7\37\2\2\u0765\u0766\7\3\2\2\u0766\u076b\5\u0086D\2\u0767\u0768\7\5\2"+
		"\2\u0768\u076a\5\u0086D\2\u0769\u0767\3\2\2\2\u076a\u076d\3\2\2\2\u076b"+
		"\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076e\3\2\2\2\u076d\u076b\3\2"+
		"\2\2\u076e\u076f\7\4\2\2\u076f\u078a\3\2\2\2\u0770\u0772\7 \2\2\u0771"+
		"\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\7\37"+
		"\2\2\u0774\u0775\7\3\2\2\u0775\u0776\5\32\16\2\u0776\u0777\7\4\2\2\u0777"+
		"\u078a\3\2\2\2\u0778\u077a\7 \2\2\u0779\u0778\3\2\2\2\u0779\u077a\3\2"+
		"\2\2\u077a\u077b\3\2\2\2\u077b\u077c\t\16\2\2\u077c\u078a\5\u008eH\2\u077d"+
		"\u077f\7&\2\2\u077e\u0780\7 \2\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2"+
		"\2\u0780\u0781\3\2\2\2\u0781\u078a\7\'\2\2\u0782\u0784\7&\2\2\u0783\u0785"+
		"\7 \2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\3\2\2\2\u0786"+
		"\u0787\7\21\2\2\u0787\u0788\7\r\2\2\u0788\u078a\5\u008eH\2\u0789\u075a"+
		"\3\2\2\2\u0789\u0762\3\2\2\2\u0789\u0771\3\2\2\2\u0789\u0779\3\2\2\2\u0789"+
		"\u077d\3\2\2\2\u0789\u0782\3\2\2\2\u078a\u008d\3\2\2\2\u078b\u078c\bH"+
		"\1\2\u078c\u0790\5\u0090I\2\u078d\u078e\t\17\2\2\u078e\u0790\5\u008eH"+
		"\t\u078f\u078b\3\2\2\2\u078f\u078d\3\2\2\2\u0790\u07a6\3\2\2\2\u0791\u0792"+
		"\f\b\2\2\u0792\u0793\t\20\2\2\u0793\u07a5\5\u008eH\t\u0794\u0795\f\7\2"+
		"\2\u0795\u0796\t\21\2\2\u0796\u07a5\5\u008eH\b\u0797\u0798\f\6\2\2\u0798"+
		"\u0799\7\u0091\2\2\u0799\u07a5\5\u008eH\7\u079a\u079b\f\5\2\2\u079b\u079c"+
		"\7\u0094\2\2\u079c\u07a5\5\u008eH\6\u079d\u079e\f\4\2\2\u079e\u079f\7"+
		"\u0092\2\2\u079f\u07a5\5\u008eH\5\u07a0\u07a1\f\3\2\2\u07a1\u07a2\5\u0094"+
		"K\2\u07a2\u07a3\5\u008eH\4\u07a3\u07a5\3\2\2\2\u07a4\u0791\3\2\2\2\u07a4"+
		"\u0794\3\2\2\2\u07a4\u0797\3\2\2\2\u07a4\u079a\3\2\2\2\u07a4\u079d\3\2"+
		"\2\2\u07a4\u07a0\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6"+
		"\u07a7\3\2\2\2\u07a7\u008f\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07aa\bI"+
		"\1\2\u07aa\u0827\t\22\2\2\u07ab\u07ad\7/\2\2\u07ac\u07ae\5\u00aeX\2\u07ad"+
		"\u07ac\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2"+
		"\2\2\u07b0\u07b3\3\2\2\2\u07b1\u07b2\7\62\2\2\u07b2\u07b4\5\u0086D\2\u07b3"+
		"\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\7\63"+
		"\2\2\u07b6\u0827\3\2\2\2\u07b7\u07b8\7/\2\2\u07b8\u07ba\5\u0086D\2\u07b9"+
		"\u07bb\5\u00aeX\2\u07ba\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07ba"+
		"\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bf\7\62\2\2"+
		"\u07bf\u07c1\5\u0086D\2\u07c0\u07be\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c3\7\63\2\2\u07c3\u0827\3\2\2\2\u07c4\u07c5\7"+
		"\\\2\2\u07c5\u07c6\7\3\2\2\u07c6\u07c7\5\u0086D\2\u07c7\u07c8\7\17\2\2"+
		"\u07c8\u07c9\5\u00a4S\2\u07c9\u07ca\7\4\2\2\u07ca\u0827\3\2\2\2\u07cb"+
		"\u07cc\7p\2\2\u07cc\u07d5\7\3\2\2\u07cd\u07d2\5\u0082B\2\u07ce\u07cf\7"+
		"\5\2\2\u07cf\u07d1\5\u0082B\2\u07d0\u07ce\3\2\2\2\u07d1\u07d4\3\2\2\2"+
		"\u07d2\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2"+
		"\3\2\2\2\u07d5\u07cd\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7"+
		"\u0827\7\4\2\2\u07d8\u07d9\7H\2\2\u07d9\u07da\7\3\2\2\u07da\u07dd\5\u0086"+
		"D\2\u07db\u07dc\7z\2\2\u07dc\u07de\7*\2\2\u07dd\u07db\3\2\2\2\u07dd\u07de"+
		"\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\7\4\2\2\u07e0\u0827\3\2\2\2\u07e1"+
		"\u07e2\7J\2\2\u07e2\u07e3\7\3\2\2\u07e3\u07e6\5\u0086D\2\u07e4\u07e5\7"+
		"z\2\2\u07e5\u07e7\7*\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7"+
		"\u07e8\3\2\2\2\u07e8\u07e9\7\4\2\2\u07e9\u0827\3\2\2\2\u07ea\u07eb\7\u0081"+
		"\2\2\u07eb\u07ec\7\3\2\2\u07ec\u07ed\5\u008eH\2\u07ed\u07ee\7\37\2\2\u07ee"+
		"\u07ef\5\u008eH\2\u07ef\u07f0\7\4\2\2\u07f0\u0827\3\2\2\2\u07f1\u0827"+
		"\5\u0092J\2\u07f2\u0827\7\u008c\2\2\u07f3\u07f4\5\u00ba^\2\u07f4\u07f5"+
		"\7\6\2\2\u07f5\u07f6\7\u008c\2\2\u07f6\u0827\3\2\2\2\u07f7\u07f8\7\3\2"+
		"\2\u07f8\u07fb\5\u0082B\2\u07f9\u07fa\7\5\2\2\u07fa\u07fc\5\u0082B\2\u07fb"+
		"\u07f9\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fd\u07fe\3\2"+
		"\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\7\4\2\2\u0800\u0827\3\2\2\2\u0801"+
		"\u0802\7\3\2\2\u0802\u0803\5\32\16\2\u0803\u0804\7\4\2\2\u0804\u0827\3"+
		"\2\2\2\u0805\u0806\5\u00ba^\2\u0806\u0812\7\3\2\2\u0807\u0809\5\\/\2\u0808"+
		"\u0807\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080f\5\u0086"+
		"D\2\u080b\u080c\7\5\2\2\u080c\u080e\5\u0086D\2\u080d\u080b\3\2\2\2\u080e"+
		"\u0811\3\2\2\2\u080f\u080d\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0813\3\2"+
		"\2\2\u0811\u080f\3\2\2\2\u0812\u0808\3\2\2\2\u0812\u0813\3\2\2\2\u0813"+
		"\u0814\3\2\2\2\u0814\u0817\7\4\2\2\u0815\u0816\7@\2\2\u0816\u0818\5\u00b4"+
		"[\2\u0817\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0827\3\2\2\2\u0819"+
		"\u081a\5\u00ba^\2\u081a\u081b\7\3\2\2\u081b\u081c\t\23\2\2\u081c\u081d"+
		"\5\u0086D\2\u081d\u081e\7\r\2\2\u081e\u081f\5\u0086D\2\u081f\u0820\7\4"+
		"\2\2\u0820\u0827\3\2\2\2\u0821\u0827\5\u00bc_\2\u0822\u0823\7\3\2\2\u0823"+
		"\u0824\5\u0086D\2\u0824\u0825\7\4\2\2\u0825\u0827\3\2\2\2\u0826\u07a9"+
		"\3\2\2\2\u0826\u07ab\3\2\2\2\u0826\u07b7\3\2\2\2\u0826\u07c4\3\2\2\2\u0826"+
		"\u07cb\3\2\2\2\u0826\u07d8\3\2\2\2\u0826\u07e1\3\2\2\2\u0826\u07ea\3\2"+
		"\2\2\u0826\u07f1\3\2\2\2\u0826\u07f2\3\2\2\2\u0826\u07f3\3\2\2\2\u0826"+
		"\u07f7\3\2\2\2\u0826\u0801\3\2\2\2\u0826\u0805\3\2\2\2\u0826\u0819\3\2"+
		"\2\2\u0826\u0821\3\2\2\2\u0826\u0822\3\2\2\2\u0827\u0832\3\2\2\2\u0828"+
		"\u0829\f\6\2\2\u0829\u082a\7\t\2\2\u082a\u082b\5\u008eH\2\u082b\u082c"+
		"\7\n\2\2\u082c\u0831\3\2\2\2\u082d\u082e\f\4\2\2\u082e\u082f\7\6\2\2\u082f"+
		"\u0831\5\u00bc_\2\u0830\u0828\3\2\2\2\u0830\u082d\3\2\2\2\u0831\u0834"+
		"\3\2\2\2\u0832\u0830\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0091\3\2\2\2\u0834"+
		"\u0832\3\2\2\2\u0835\u0842\7\'\2\2\u0836\u0842\5\u009cO\2\u0837\u0838"+
		"\5\u00bc_\2\u0838\u0839\7\u00f2\2\2\u0839\u0842\3\2\2\2\u083a\u0842\5"+
		"\u00c2b\2\u083b\u0842\5\u009aN\2\u083c\u083e\7\u00f2\2\2\u083d\u083c\3"+
		"\2\2\2\u083e\u083f\3\2\2\2\u083f\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840"+
		"\u0842\3\2\2\2\u0841\u0835\3\2\2\2\u0841\u0836\3\2\2\2\u0841\u0837\3\2"+
		"\2\2\u0841\u083a\3\2\2\2\u0841\u083b\3\2\2\2\u0841\u083d\3\2\2\2\u0842"+
		"\u0093\3\2\2\2\u0843\u0844\t\24\2\2\u0844\u0095\3\2\2\2\u0845\u0846\t"+
		"\25\2\2\u0846\u0097\3\2\2\2\u0847\u0848\t\26\2\2\u0848\u0099\3\2\2\2\u0849"+
		"\u084a\t\27\2\2\u084a\u009b\3\2\2\2\u084b\u084f\7.\2\2\u084c\u084e\5\u009e"+
		"P\2\u084d\u084c\3\2\2\2\u084e\u0851\3\2\2\2\u084f\u084d\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u009d\3\2\2\2\u0851\u084f\3\2\2\2\u0852\u0853\5\u00a0"+
		"Q\2\u0853\u0856\5\u00bc_\2\u0854\u0855\7i\2\2\u0855\u0857\5\u00bc_\2\u0856"+
		"\u0854\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u009f\3\2\2\2\u0858\u085a\t\30"+
		"\2\2\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085b\3\2\2\2\u085b"+
		"\u085e\t\r\2\2\u085c\u085e\7\u00f2\2\2\u085d\u0859\3\2\2\2\u085d\u085c"+
		"\3\2\2\2\u085e\u00a1\3\2\2\2\u085f\u0863\7H\2\2\u0860\u0861\7I\2\2\u0861"+
		"\u0863\5\u00bc_\2\u0862\u085f\3\2\2\2\u0862\u0860\3\2\2\2\u0863\u00a3"+
		"\3\2\2\2\u0864\u0865\7n\2\2\u0865\u0866\7\u0086\2\2\u0866\u0867\5\u00a4"+
		"S\2\u0867\u0868\7\u0088\2\2\u0868\u0887\3\2\2\2\u0869\u086a\7o\2\2\u086a"+
		"\u086b\7\u0086\2\2\u086b\u086c\5\u00a4S\2\u086c\u086d\7\5\2\2\u086d\u086e"+
		"\5\u00a4S\2\u086e\u086f\7\u0088\2\2\u086f\u0887\3\2\2\2\u0870\u0877\7"+
		"p\2\2\u0871\u0873\7\u0086\2\2\u0872\u0874\5\u00aaV\2\u0873\u0872\3\2\2"+
		"\2\u0873\u0874\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0878\7\u0088\2\2\u0876"+
		"\u0878\7\u0084\2\2\u0877\u0871\3\2\2\2\u0877\u0876\3\2\2\2\u0878\u0887"+
		"\3\2\2\2\u0879\u0884\5\u00bc_\2\u087a\u087b\7\3\2\2\u087b\u0880\7\u00f7"+
		"\2\2\u087c\u087d\7\5\2\2\u087d\u087f\7\u00f7\2\2\u087e\u087c\3\2\2\2\u087f"+
		"\u0882\3\2\2\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0883\3\2"+
		"\2\2\u0882\u0880\3\2\2\2\u0883\u0885\7\4\2\2\u0884\u087a\3\2\2\2\u0884"+
		"\u0885\3\2\2\2\u0885\u0887\3\2\2\2\u0886\u0864\3\2\2\2\u0886\u0869\3\2"+
		"\2\2\u0886\u0870\3\2\2\2\u0886\u0879\3\2\2\2\u0887\u00a5\3\2\2\2\u0888"+
		"\u088d\5\u00a8U\2\u0889\u088a\7\5\2\2\u088a\u088c\5\u00a8U\2\u088b\u0889"+
		"\3\2\2\2\u088c\u088f\3\2\2\2\u088d\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e"+
		"\u00a7\3\2\2\2\u088f\u088d\3\2\2\2\u0890\u0891\5\u00bc_\2\u0891\u0894"+
		"\5\u00a4S\2\u0892\u0893\7q\2\2\u0893\u0895\7\u00f2\2\2\u0894\u0892\3\2"+
		"\2\2\u0894\u0895\3\2\2\2\u0895\u00a9\3\2\2\2\u0896\u089b\5\u00acW\2\u0897"+
		"\u0898\7\5\2\2\u0898\u089a\5\u00acW\2\u0899\u0897\3\2\2\2\u089a\u089d"+
		"\3\2\2\2\u089b\u0899\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u00ab\3\2\2\2\u089d"+
		"\u089b\3\2\2\2\u089e\u089f\5\u00bc_\2\u089f\u08a0\7\13\2\2\u08a0\u08a3"+
		"\5\u00a4S\2\u08a1\u08a2\7q\2\2\u08a2\u08a4\7\u00f2\2\2\u08a3\u08a1\3\2"+
		"\2\2\u08a3\u08a4\3\2\2\2\u08a4\u00ad\3\2\2\2\u08a5\u08a6\7\60\2\2\u08a6"+
		"\u08a7\5\u0086D\2\u08a7\u08a8\7\61\2\2\u08a8\u08a9\5\u0086D\2\u08a9\u00af"+
		"\3\2\2\2\u08aa\u08ab\7?\2\2\u08ab\u08b0\5\u00b2Z\2\u08ac\u08ad\7\5\2\2"+
		"\u08ad\u08af\5\u00b2Z\2\u08ae\u08ac\3\2\2\2\u08af\u08b2\3\2\2\2\u08b0"+
		"\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u00b1\3\2\2\2\u08b2\u08b0\3\2"+
		"\2\2\u08b3\u08b4\5\u00bc_\2\u08b4\u08b5\7\17\2\2\u08b5\u08b6\5\u00b4["+
		"\2\u08b6\u00b3\3\2\2\2\u08b7\u08e2\5\u00bc_\2\u08b8\u08db\7\3\2\2\u08b9"+
		"\u08ba\7\u009a\2\2\u08ba\u08bb\7\24\2\2\u08bb\u08c0\5\u0086D\2\u08bc\u08bd"+
		"\7\5\2\2\u08bd\u08bf\5\u0086D\2\u08be\u08bc\3\2\2\2\u08bf\u08c2\3\2\2"+
		"\2\u08c0\u08be\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08dc\3\2\2\2\u08c2\u08c0"+
		"\3\2\2\2\u08c3\u08c4\t\31\2\2\u08c4\u08c5\7\24\2\2\u08c5\u08ca\5\u0086"+
		"D\2\u08c6\u08c7\7\5\2\2\u08c7\u08c9\5\u0086D\2\u08c8\u08c6\3\2\2\2\u08c9"+
		"\u08cc\3\2\2\2\u08ca\u08c8\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08ce\3\2"+
		"\2\2\u08cc\u08ca\3\2\2\2\u08cd\u08c3\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce"+
		"\u08d9\3\2\2\2\u08cf\u08d0\t\32\2\2\u08d0\u08d1\7\24\2\2\u08d1\u08d6\5"+
		"L\'\2\u08d2\u08d3\7\5\2\2\u08d3\u08d5\5L\'\2\u08d4\u08d2\3\2\2\2\u08d5"+
		"\u08d8\3\2\2\2\u08d6\u08d4\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08da\3\2"+
		"\2\2\u08d8\u08d6\3\2\2\2\u08d9\u08cf\3\2\2\2\u08d9\u08da\3\2\2\2\u08da"+
		"\u08dc\3\2\2\2\u08db\u08b9\3\2\2\2\u08db\u08cd\3\2\2\2\u08dc\u08de\3\2"+
		"\2\2\u08dd\u08df\5\u00b6\\\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df"+
		"\u08e0\3\2\2\2\u08e0\u08e2\7\4\2\2\u08e1\u08b7\3\2\2\2\u08e1\u08b8\3\2"+
		"\2\2\u08e2\u00b5\3\2\2\2\u08e3\u08e4\7B\2\2\u08e4\u08f4\5\u00b8]\2\u08e5"+
		"\u08e6\7C\2\2\u08e6\u08f4\5\u00b8]\2\u08e7\u08e8\7B\2\2\u08e8\u08e9\7"+
		"#\2\2\u08e9\u08ea\5\u00b8]\2\u08ea\u08eb\7\36\2\2\u08eb\u08ec\5\u00b8"+
		"]\2\u08ec\u08f4\3\2\2\2\u08ed\u08ee\7C\2\2\u08ee\u08ef\7#\2\2\u08ef\u08f0"+
		"\5\u00b8]\2\u08f0\u08f1\7\36\2\2\u08f1\u08f2\5\u00b8]\2\u08f2\u08f4\3"+
		"\2\2\2\u08f3\u08e3\3\2\2\2\u08f3\u08e5\3\2\2\2\u08f3\u08e7\3\2\2\2\u08f3"+
		"\u08ed\3\2\2\2\u08f4\u00b7\3\2\2\2\u08f5\u08f6\7D\2\2\u08f6\u08fd\t\33"+
		"\2\2\u08f7\u08f8\7G\2\2\u08f8\u08fd\7K\2\2\u08f9\u08fa\5\u0086D\2\u08fa"+
		"\u08fb\t\33\2\2\u08fb\u08fd\3\2\2\2\u08fc\u08f5\3\2\2\2\u08fc\u08f7\3"+
		"\2\2\2\u08fc\u08f9\3\2\2\2\u08fd\u00b9\3\2\2\2\u08fe\u0903\5\u00bc_\2"+
		"\u08ff\u0900\7\6\2\2\u0900\u0902\5\u00bc_\2\u0901\u08ff\3\2\2\2\u0902"+
		"\u0905\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u00bb\3\2"+
		"\2\2\u0905\u0903\3\2\2\2\u0906\u0917\5\u00be`\2\u0907\u0917\7\u00ed\2"+
		"\2\u0908\u0917\7;\2\2\u0909\u0917\7\67\2\2\u090a\u0917\78\2\2\u090b\u0917"+
		"\79\2\2\u090c\u0917\7:\2\2\u090d\u0917\7<\2\2\u090e\u0917\7\64\2\2\u090f"+
		"\u0917\7\65\2\2\u0910\u0917\7=\2\2\u0911\u0917\7e\2\2\u0912\u0917\7h\2"+
		"\2\u0913\u0917\7f\2\2\u0914\u0917\7g\2\2\u0915\u0917\7~\2\2\u0916\u0906"+
		"\3\2\2\2\u0916\u0907\3\2\2\2\u0916\u0908\3\2\2\2\u0916\u0909\3\2\2\2\u0916"+
		"\u090a\3\2\2\2\u0916\u090b\3\2\2\2\u0916\u090c\3\2\2\2\u0916\u090d\3\2"+
		"\2\2\u0916\u090e\3\2\2\2\u0916\u090f\3\2\2\2\u0916\u0910\3\2\2\2\u0916"+
		"\u0911\3\2\2\2\u0916\u0912\3\2\2\2\u0916\u0913\3\2\2\2\u0916\u0914\3\2"+
		"\2\2\u0916\u0915\3\2\2\2\u0917\u00bd\3\2\2\2\u0918\u091c\7\u00fb\2\2\u0919"+
		"\u091c\5\u00c0a\2\u091a\u091c\5\u00c4c\2\u091b\u0918\3\2\2\2\u091b\u0919"+
		"\3\2\2\2\u091b\u091a\3\2\2\2\u091c\u00bf\3\2\2\2\u091d\u091e\7\u00fc\2"+
		"\2\u091e\u00c1\3\2\2\2\u091f\u0921\7\u008b\2\2\u0920\u091f\3\2\2\2\u0920"+
		"\u0921\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u093c\7\u00f8\2\2\u0923\u0925"+
		"\7\u008b\2\2\u0924\u0923\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0926\3\2\2"+
		"\2\u0926\u093c\7\u00f7\2\2\u0927\u0929\7\u008b\2\2\u0928\u0927\3\2\2\2"+
		"\u0928\u0929\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u093c\7\u00f3\2\2\u092b"+
		"\u092d\7\u008b\2\2\u092c\u092b\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e"+
		"\3\2\2\2\u092e\u093c\7\u00f4\2\2\u092f\u0931\7\u008b\2\2\u0930\u092f\3"+
		"\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\3\2\2\2\u0932";
	private static final String _serializedATNSegment1 =
		"\u093c\7\u00f5\2\2\u0933\u0935\7\u008b\2\2\u0934\u0933\3\2\2\2\u0934\u0935"+
		"\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u093c\7\u00f9\2\2\u0937\u0939\7\u008b"+
		"\2\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a\3\2\2\2\u093a"+
		"\u093c\7\u00fa\2\2\u093b\u0920\3\2\2\2\u093b\u0924\3\2\2\2\u093b\u0928"+
		"\3\2\2\2\u093b\u092c\3\2\2\2\u093b\u0930\3\2\2\2\u093b\u0934\3\2\2\2\u093b"+
		"\u0938\3\2\2\2\u093c\u00c3\3\2\2\2\u093d\u093e\t\34\2\2\u093e\u00c5\3"+
		"\2\2\2\u0144\u00e0\u00e5\u00e8\u00ed\u00fa\u00fe\u0105\u010a\u010f\u0112"+
		"\u0115\u0119\u011d\u0120\u0123\u012a\u012e\u0136\u0139\u013c\u013f\u0142"+
		"\u0145\u0149\u014c\u014f\u0156\u015c\u0162\u016a\u018a\u0192\u0196\u019b"+
		"\u01a1\u01a9\u01af\u01bc\u01c1\u01ca\u01cf\u01df\u01e6\u01ea\u01f2\u01f9"+
		"\u0200\u020f\u0213\u0219\u021f\u0222\u0225\u022b\u022f\u0233\u0238\u023c"+
		"\u0244\u0247\u0250\u0255\u025b\u0262\u0265\u026b\u0276\u0279\u027d\u0282"+
		"\u0287\u028e\u0291\u0294\u029b\u02a0\u02a6\u02af\u02b7\u02bd\u02c1\u02c5"+
		"\u02c9\u02cb\u02d4\u02da\u02df\u02e2\u02e6\u02e9\u02f3\u02f6\u02fa\u02ff"+
		"\u0302\u0308\u0310\u0315\u031b\u0321\u032c\u0334\u033b\u0343\u0346\u034e"+
		"\u0352\u0359\u03cd\u03d5\u03dd\u03e6\u03f2\u03f6\u03f9\u03ff\u0409\u0415"+
		"\u041a\u0420\u042c\u042e\u0433\u0437\u043c\u0441\u0444\u0449\u044d\u0452"+
		"\u0454\u0458\u0461\u0469\u0470\u0477\u0480\u0485\u0494\u049b\u049e\u04a5"+
		"\u04a9\u04af\u04b7\u04c2\u04cd\u04d4\u04da\u04e0\u04e9\u04eb\u04f4\u04f7"+
		"\u0500\u0503\u050c\u050f\u0518\u051b\u051e\u0523\u0525\u0528\u0533\u0538"+
		"\u0543\u0547\u054b\u0557\u055a\u055e\u0568\u056c\u056e\u0571\u0575\u0578"+
		"\u057c\u0582\u0586\u058a\u058f\u0592\u0594\u0599\u059e\u05a1\u05a5\u05a8"+
		"\u05aa\u05af\u05b4\u05c1\u05c6\u05ce\u05d4\u05de\u05ed\u05f2\u05fa\u05fd"+
		"\u0601\u0606\u060f\u0612\u0617\u061e\u0621\u0629\u0630\u0637\u063a\u063f"+
		"\u0645\u0649\u064c\u0650\u065b\u0662\u0667\u067a\u067c\u067e\u068b\u0694"+
		"\u069b\u06a3\u06ab\u06af\u06b7\u06bf\u06c5\u06cd\u06d9\u06dc\u06e2\u06e6"+
		"\u06e8\u06f1\u06fd\u06ff\u0706\u070d\u0713\u0719\u071b\u0720\u0727\u072d"+
		"\u0731\u0733\u073a\u0748\u0750\u0752\u0757\u075a\u0762\u076b\u0771\u0779"+
		"\u077f\u0784\u0789\u078f\u07a4\u07a6\u07af\u07b3\u07bc\u07c0\u07d2\u07d5"+
		"\u07dd\u07e6\u07fd\u0808\u080f\u0812\u0817\u0826\u0830\u0832\u083f\u0841"+
		"\u084f\u0856\u0859\u085d\u0862\u0873\u0877\u0880\u0884\u0886\u088d\u0894"+
		"\u089b\u08a3\u08b0\u08c0\u08ca\u08cd\u08d6\u08d9\u08db\u08de\u08e1\u08f3"+
		"\u08fc\u0903\u0916\u091b\u0920\u0924\u0928\u092c\u0930\u0934\u0938\u093b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
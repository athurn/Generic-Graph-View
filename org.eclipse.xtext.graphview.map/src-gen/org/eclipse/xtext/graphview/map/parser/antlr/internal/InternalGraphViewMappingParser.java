package org.eclipse.xtext.graphview.map.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.graphview.map.services.GraphViewMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGraphViewMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'diagram'", "'type'", "'{'", "'}'", "'import'", "'.'", "'*'", "'node'", "'for'", "'each'", "'label'", "'edge'", "'->'", "'ref'", "'call'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalGraphViewMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphViewMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphViewMappingParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g"; }



     	private GraphViewMappingGrammarAccess grammarAccess;
     	
        public InternalGraphViewMappingParser(TokenStream input, GraphViewMappingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DiagramMapping";	
       	}
       	
       	@Override
       	protected GraphViewMappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDiagramMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:67:1: entryRuleDiagramMapping returns [EObject current=null] : iv_ruleDiagramMapping= ruleDiagramMapping EOF ;
    public final EObject entryRuleDiagramMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:68:2: (iv_ruleDiagramMapping= ruleDiagramMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:69:2: iv_ruleDiagramMapping= ruleDiagramMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDiagramMappingRule()); 
            }
            pushFollow(FOLLOW_ruleDiagramMapping_in_entryRuleDiagramMapping75);
            iv_ruleDiagramMapping=ruleDiagramMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiagramMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagramMapping85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagramMapping"


    // $ANTLR start "ruleDiagramMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:76:1: ruleDiagramMapping returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) ;
    public final EObject ruleDiagramMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_typeGuard_4_0 = null;

        EObject lv_mappings_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'diagram' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'type' ( (lv_typeGuard_4_0= ruleJvmTypeReference ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagramMapping131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDiagramMapping144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDiagramMappingAccess().getDiagramKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:102:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:103:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:103:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:104:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDiagramMapping165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDiagramMapping177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDiagramMappingAccess().getTypeKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:124:1: ( (lv_typeGuard_4_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:125:1: (lv_typeGuard_4_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:125:1: (lv_typeGuard_4_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:126:3: lv_typeGuard_4_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getTypeGuardJvmTypeReferenceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleDiagramMapping198);
            lv_typeGuard_4_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
              	        }
                     		set(
                     			current, 
                     			"typeGuard",
                      		lv_typeGuard_4_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDiagramMapping210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDiagramMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:146:1: ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=22)||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:147:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:147:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:148:3: lv_mappings_6_0= ruleAbstractExpressionMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDiagramMappingAccess().getMappingsAbstractExpressionMappingParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_ruleDiagramMapping231);
            	    lv_mappings_6_0=ruleAbstractExpressionMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDiagramMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_6_0, 
            	              		"AbstractExpressionMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleDiagramMapping244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDiagramMappingAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagramMapping"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:176:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:177:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:178:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport280);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport290); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:185:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:188:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:189:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:189:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:189:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:193:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:194:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:194:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:195:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport348);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:219:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:220:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:221:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard385);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard396); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:228:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:231:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:232:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:232:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:233:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard443);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:243:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:244:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildcard475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAbstractExpressionMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:263:1: entryRuleAbstractExpressionMapping returns [EObject current=null] : iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF ;
    public final EObject entryRuleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExpressionMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:264:2: (iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:265:2: iv_ruleAbstractExpressionMapping= ruleAbstractExpressionMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractExpressionMappingRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping517);
            iv_ruleAbstractExpressionMapping=ruleAbstractExpressionMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractExpressionMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractExpressionMapping527); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractExpressionMapping"


    // $ANTLR start "ruleAbstractExpressionMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:272:1: ruleAbstractExpressionMapping returns [EObject current=null] : (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall ) ;
    public final EObject ruleAbstractExpressionMapping() throws RecognitionException {
        EObject current = null;

        EObject this_NodeMapping_0 = null;

        EObject this_LabelMapping_1 = null;

        EObject this_EdgeMapping_2 = null;

        EObject this_MappingCall_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:275:28: ( (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:276:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:276:1: (this_NodeMapping_0= ruleNodeMapping | this_LabelMapping_1= ruleLabelMapping | this_EdgeMapping_2= ruleEdgeMapping | this_MappingCall_3= ruleMappingCall )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:277:5: this_NodeMapping_0= ruleNodeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getNodeMappingParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping574);
                    this_NodeMapping_0=ruleNodeMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeMapping_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:287:5: this_LabelMapping_1= ruleLabelMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getLabelMappingParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping601);
                    this_LabelMapping_1=ruleLabelMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LabelMapping_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:297:5: this_EdgeMapping_2= ruleEdgeMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getEdgeMappingParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping628);
                    this_EdgeMapping_2=ruleEdgeMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EdgeMapping_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:307:5: this_MappingCall_3= ruleMappingCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractExpressionMappingAccess().getMappingCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingCall_in_ruleAbstractExpressionMapping655);
                    this_MappingCall_3=ruleMappingCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MappingCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractExpressionMapping"


    // $ANTLR start "entryRuleNodeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:323:1: entryRuleNodeMapping returns [EObject current=null] : iv_ruleNodeMapping= ruleNodeMapping EOF ;
    public final EObject entryRuleNodeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:324:2: (iv_ruleNodeMapping= ruleNodeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:325:2: iv_ruleNodeMapping= ruleNodeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping690);
            iv_ruleNodeMapping=ruleNodeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeMapping700); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeMapping"


    // $ANTLR start "ruleNodeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:332:1: ruleNodeMapping returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) ;
    public final EObject ruleNodeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_4_0 = null;

        EObject lv_mappings_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:335:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:336:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:336:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:336:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleNodeMapping737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeMappingAccess().getNodeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:340:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:341:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:341:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:342:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeMapping754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNodeMappingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleNodeMapping771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:362:1: ( (lv_multi_3_0= 'each' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:363:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:363:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:364:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,20,FOLLOW_20_in_ruleNodeMapping789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getNodeMappingAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNodeMappingRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:377:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:378:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:378:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:379:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleNodeMapping824);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleNodeMapping836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:399:1: ( (lv_mappings_6_0= ruleAbstractExpressionMapping ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||(LA6_0>=21 && LA6_0<=22)||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:400:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:400:1: (lv_mappings_6_0= ruleAbstractExpressionMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:401:3: lv_mappings_6_0= ruleAbstractExpressionMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeMappingAccess().getMappingsAbstractExpressionMappingParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping857);
            	    lv_mappings_6_0=ruleAbstractExpressionMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_6_0, 
            	              		"AbstractExpressionMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleNodeMapping870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNodeMappingAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeMapping"


    // $ANTLR start "entryRuleLabelMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:429:1: entryRuleLabelMapping returns [EObject current=null] : iv_ruleLabelMapping= ruleLabelMapping EOF ;
    public final EObject entryRuleLabelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:430:2: (iv_ruleLabelMapping= ruleLabelMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:431:2: iv_ruleLabelMapping= ruleLabelMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelMappingRule()); 
            }
            pushFollow(FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping906);
            iv_ruleLabelMapping=ruleLabelMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelMapping916); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelMapping"


    // $ANTLR start "ruleLabelMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:438:1: ruleLabelMapping returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleLabelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:441:28: ( (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:442:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:442:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:442:3: otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleLabelMapping953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelMappingAccess().getLabelKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:446:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:447:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:447:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:448:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabelMapping970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLabelMappingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLabelMapping987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLabelMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:468:1: ( (lv_multi_3_0= 'each' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:469:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:469:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:470:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,20,FOLLOW_20_in_ruleLabelMapping1005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getLabelMappingAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLabelMappingRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:483:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:484:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:484:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:485:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleLabelMapping1040);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLabelMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelMapping"


    // $ANTLR start "entryRuleEdgeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:509:1: entryRuleEdgeMapping returns [EObject current=null] : iv_ruleEdgeMapping= ruleEdgeMapping EOF ;
    public final EObject entryRuleEdgeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:510:2: (iv_ruleEdgeMapping= ruleEdgeMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:511:2: iv_ruleEdgeMapping= ruleEdgeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1076);
            iv_ruleEdgeMapping=ruleEdgeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeMapping1086); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeMapping"


    // $ANTLR start "ruleEdgeMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:518:1: ruleEdgeMapping returns [EObject current=null] : (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' ) ;
    public final EObject ruleEdgeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_expression_4_0 = null;

        EObject lv_sourceMapping_6_0 = null;

        EObject lv_targetMapping_8_0 = null;

        EObject lv_mappings_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:521:28: ( (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:522:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:522:1: (otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:522:3: otherlv_0= 'edge' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )? otherlv_7= '->' ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )? ( (lv_mappings_9_0= ruleLabelMapping ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEdgeMapping1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEdgeMappingAccess().getEdgeKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:526:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:527:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:527:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:528:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeMapping1140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEdgeMappingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEdgeMapping1157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:548:1: ( (lv_multi_3_0= 'each' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:549:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:549:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:550:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,20,FOLLOW_20_in_ruleEdgeMapping1175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getEdgeMappingAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeMappingRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:563:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:564:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:564:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:565:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeMapping1210);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEdgeMapping1222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEdgeMappingAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:585:1: ( (lv_sourceMapping_6_0= ruleEdgeEndMapping ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:586:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:586:1: (lv_sourceMapping_6_0= ruleEdgeEndMapping )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:587:3: lv_sourceMapping_6_0= ruleEdgeEndMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getSourceMappingEdgeEndMappingParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1243);
                    lv_sourceMapping_6_0=ruleEdgeEndMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"sourceMapping",
                              		lv_sourceMapping_6_0, 
                              		"EdgeEndMapping");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleEdgeMapping1256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEdgeMappingAccess().getHyphenMinusGreaterThanSignKeyword_7());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:607:1: ( (lv_targetMapping_8_0= ruleEdgeEndMapping ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:608:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:608:1: (lv_targetMapping_8_0= ruleEdgeEndMapping )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:609:3: lv_targetMapping_8_0= ruleEdgeEndMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getTargetMappingEdgeEndMappingParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1277);
                    lv_targetMapping_8_0=ruleEdgeEndMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"targetMapping",
                              		lv_targetMapping_8_0, 
                              		"EdgeEndMapping");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:625:3: ( (lv_mappings_9_0= ruleLabelMapping ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:626:1: (lv_mappings_9_0= ruleLabelMapping )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:626:1: (lv_mappings_9_0= ruleLabelMapping )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:627:3: lv_mappings_9_0= ruleLabelMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeMappingAccess().getMappingsLabelMappingParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLabelMapping_in_ruleEdgeMapping1299);
            	    lv_mappings_9_0=ruleLabelMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEdgeMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_9_0, 
            	              		"LabelMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleEdgeMapping1312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEdgeMappingAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeMapping"


    // $ANTLR start "entryRuleEdgeEndMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:655:1: entryRuleEdgeEndMapping returns [EObject current=null] : iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF ;
    public final EObject entryRuleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeEndMapping = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:656:2: (iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:657:2: iv_ruleEdgeEndMapping= ruleEdgeEndMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeEndMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1348);
            iv_ruleEdgeEndMapping=ruleEdgeEndMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeEndMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeEndMapping1358); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeEndMapping"


    // $ANTLR start "ruleEdgeEndMapping"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:664:1: ruleEdgeEndMapping returns [EObject current=null] : ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleEdgeEndMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_call_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:667:28: ( ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:668:1: ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:668:1: ( (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:668:2: (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:668:2: (otherlv_0= 'ref' | ( (lv_call_1_0= 'call' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:668:4: otherlv_0= 'ref'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleEdgeEndMapping1396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getEdgeEndMappingAccess().getRefKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:673:6: ( (lv_call_1_0= 'call' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:673:6: ( (lv_call_1_0= 'call' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:674:1: (lv_call_1_0= 'call' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:674:1: (lv_call_1_0= 'call' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:675:3: lv_call_1_0= 'call'
                    {
                    lv_call_1_0=(Token)match(input,25,FOLLOW_25_in_ruleEdgeEndMapping1420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_call_1_0, grammarAccess.getEdgeEndMappingAccess().getCallCallKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEdgeEndMappingRule());
                      	        }
                             		setWithLastConsumed(current, "call", true, "call");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:688:3: ( (otherlv_2= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:689:1: (otherlv_2= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:689:1: (otherlv_2= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:690:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeEndMappingRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEdgeEndMapping1454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getEdgeEndMappingAccess().getReferencedMappingAbstractMappingDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEdgeEndMapping1466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEdgeEndMappingAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:705:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:706:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:706:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:707:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeEndMappingAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1487);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeEndMappingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeEndMapping"


    // $ANTLR start "entryRuleMappingCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:731:1: entryRuleMappingCall returns [EObject current=null] : iv_ruleMappingCall= ruleMappingCall EOF ;
    public final EObject entryRuleMappingCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:732:2: (iv_ruleMappingCall= ruleMappingCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:733:2: iv_ruleMappingCall= ruleMappingCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingCallRule()); 
            }
            pushFollow(FOLLOW_ruleMappingCall_in_entryRuleMappingCall1523);
            iv_ruleMappingCall=ruleMappingCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingCall1533); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingCall"


    // $ANTLR start "ruleMappingCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:740:1: ruleMappingCall returns [EObject current=null] : (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleMappingCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_multi_3_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:743:28: ( (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:744:1: (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:744:1: (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:744:3: otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'for' ( (lv_multi_3_0= 'each' ) )? ( (lv_expression_4_0= ruleXExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMappingCall1570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingCallAccess().getCallKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:748:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:749:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:749:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:750:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMappingCall1590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMappingCallAccess().getReferencedMappingAbstractMappingDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMappingCall1602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMappingCallAccess().getForKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:765:1: ( (lv_multi_3_0= 'each' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:766:1: (lv_multi_3_0= 'each' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:766:1: (lv_multi_3_0= 'each' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:767:3: lv_multi_3_0= 'each'
                    {
                    lv_multi_3_0=(Token)match(input,20,FOLLOW_20_in_ruleMappingCall1620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_multi_3_0, grammarAccess.getMappingCallAccess().getMultiEachKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingCallRule());
                      	        }
                             		setWithLastConsumed(current, "multi", true, "each");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:780:3: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:781:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:781:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:782:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingCallAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleMappingCall1655);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingCallRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingCall"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:806:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:807:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:808:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1691);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1701); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:815:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:818:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:820:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1747);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:836:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:837:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:838:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1781);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1791); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:845:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:848:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:849:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:849:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=RULE_ID && LA15_1<=RULE_STRING)||(LA15_1>=13 && LA15_1<=14)||(LA15_1>=16 && LA15_1<=19)||(LA15_1>=21 && LA15_1<=23)||LA15_1==25||(LA15_1>=27 && LA15_1<=50)||(LA15_1>=52 && LA15_1<=76)) ) {
                    alt15=2;
                }
                else if ( (LA15_1==26) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_STRING)||LA15_0==13||LA15_0==19||LA15_0==36||(LA15_0>=38 && LA15_0<=39)||LA15_0==43||LA15_0==48||LA15_0==50||LA15_0==53||LA15_0==55||(LA15_0>=59 && LA15_0<=60)||LA15_0==64||(LA15_0>=66 && LA15_0<=73)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:849:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:849:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:849:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:849:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:850:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:855:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:856:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:856:1: ( ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:857:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1849);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1865);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:878:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:879:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:879:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:880:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1885);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:897:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:897:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:898:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1915);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred1_InternalGraphViewMapping()) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:911:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:911:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:911:7: ()
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:912:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:917:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:918:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:918:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:919:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1968);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:932:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:933:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:933:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:934:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1991);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:958:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:959:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:960:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2031);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2042); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:967:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:970:28: (kw= '=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:972:2: kw= '='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpSingleAssign2079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:985:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:986:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:987:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2119);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2130); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:994:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:997:28: (kw= '+=' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:999:2: kw= '+='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign2167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1012:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1013:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1014:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2206);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2216); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1021:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1024:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1025:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1025:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1026:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2263);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred2_InternalGraphViewMapping()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1039:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1039:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1039:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1040:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1045:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1046:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1046:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1047:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2316);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1060:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1061:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1061:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1062:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2339);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1086:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1087:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1088:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2378);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2389); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1095:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1098:28: (kw= '||' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1100:2: kw= '||'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOr2426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1113:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1114:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1115:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2465);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1122:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1125:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1126:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1126:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1127:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2522);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred3_InternalGraphViewMapping()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1140:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1140:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1140:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1141:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1146:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1147:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1147:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1148:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2575);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1161:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1162:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1162:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1163:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2598);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1187:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1188:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1189:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2637);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2648); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1196:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1199:28: (kw= '&&' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1201:2: kw= '&&'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAnd2685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1214:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1215:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1216:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2724);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2734); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1223:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1226:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1227:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1227:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1228:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2781);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==31) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred4_InternalGraphViewMapping()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1241:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1241:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1241:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1242:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1247:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1248:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1248:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1249:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2834);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1262:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1263:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1263:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1264:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2857);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1288:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1289:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1290:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2896);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2907); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1297:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1300:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1301:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1301:1: (kw= '==' | kw= '!=' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1302:2: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality2945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1309:2: kw= '!='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1322:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1323:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1324:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3004);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3014); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1331:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1334:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1335:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1335:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1336:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3061);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop20:
            do {
                int alt20=3;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred5_InternalGraphViewMapping()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA20_6 = input.LA(2);

                    if ( (synpred6_InternalGraphViewMapping()) ) {
                        alt20=2;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1346:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1347:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression3097); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1356:3: ( ( ruleQualifiedName ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1357:1: ( ruleQualifiedName )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1357:1: ( ruleQualifiedName )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1358:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3122);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1377:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1377:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1377:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1378:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1383:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1384:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1384:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1385:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3183);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1398:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1399:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1399:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1400:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3206);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1424:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1425:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1426:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3246);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3257); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1433:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1436:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1437:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1437:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            case 36:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1438:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare3295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1445:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1452:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1459:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1472:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1473:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1474:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3392);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3402); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1481:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1484:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1485:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1485:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1486:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3449);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==37) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred7_InternalGraphViewMapping()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1499:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1499:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1499:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1500:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1505:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1506:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1506:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1507:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3502);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1520:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1521:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1521:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1522:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3525);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1546:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1547:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1548:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3564);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3575); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1555:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1558:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1559:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1559:1: (kw= '->' | kw= '..' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1560:2: kw= '->'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOther3613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1567:2: kw= '..'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1580:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1581:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1582:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3672);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3682); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1589:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1592:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1593:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1593:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1594:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3729);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==39) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred8_InternalGraphViewMapping()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1607:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1607:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1607:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1608:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1613:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1614:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1614:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1615:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3782);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1628:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1629:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1629:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1630:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3805);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1654:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1655:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1656:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3844);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3855); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1663:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1666:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1667:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1667:1: (kw= '+' | kw= '-' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1668:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpAdd3893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1675:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1688:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1689:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1690:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3952);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3962); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1697:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1700:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1701:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1701:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1702:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4009);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA26_5 = input.LA(2);

                    if ( (synpred9_InternalGraphViewMapping()) ) {
                        alt26=1;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1715:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1715:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1715:7: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1716:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1721:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1722:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1722:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1723:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4062);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1736:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1737:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1738:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4085);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1762:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1763:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1764:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4124);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4135); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1771:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1774:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1775:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1775:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt27=1;
                }
                break;
            case 40:
                {
                alt27=2;
                }
                break;
            case 41:
                {
                alt27=3;
                }
                break;
            case 42:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1776:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMulti4173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1783:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti4192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1790:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti4211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1797:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti4230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1810:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1811:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1812:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4270);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4280); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1819:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1822:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1823:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1823:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=38 && LA28_0<=39)||LA28_0==43) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==13||LA28_0==19||LA28_0==36||LA28_0==48||LA28_0==50||LA28_0==53||LA28_0==55||(LA28_0>=59 && LA28_0<=60)||LA28_0==64||(LA28_0>=66 && LA28_0<=73)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1823:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1823:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1823:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1823:3: ()
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1824:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1829:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1830:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1830:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1831:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4338);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1844:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1845:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1845:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1846:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4359);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1864:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4388);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1880:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1881:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1882:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4424);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4435); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1889:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1892:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1893:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1893:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt29=1;
                }
                break;
            case 39:
                {
                alt29=2;
                }
                break;
            case 38:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1894:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1901:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1908:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary4511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1921:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1922:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1923:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4551);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4561); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1930:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1933:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1934:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1935:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4608);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred10_InternalGraphViewMapping()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1945:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1945:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1945:6: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1946:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression4643); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1955:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1956:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1956:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1957:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4666);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1981:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1982:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1983:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4704);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4714); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1990:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1993:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1994:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1994:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1995:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4761);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop37:
            do {
                int alt37=3;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred11_InternalGraphViewMapping()) ) {
                        alt37=1;
                    }
                    else if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred12_InternalGraphViewMapping()) ) {
                        alt37=2;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2009:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2009:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2009:26: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2010:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4810); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2019:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2020:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2020:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2021:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4833);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4849);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2042:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2043:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2043:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2044:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4871);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2077:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2077:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2077:8: ()
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2078:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2083:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2083:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4957); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2088:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2088:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2089:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2089:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2090:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4981); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2104:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2104:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2105:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2105:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2106:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall5018); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2119:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==36) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2119:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall5047); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2123:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2124:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2124:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2125:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5068);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2141:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==47) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2141:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall5081); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2145:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2146:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2146:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2147:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5102);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop32;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall5116); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2167:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2168:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2168:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2169:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5141);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2189:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2190:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall5175); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt35=3;
            	            alt35 = dfa35.predict(input);
            	            switch (alt35) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2215:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2216:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5250);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2233:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2233:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2233:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2233:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2234:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2234:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2235:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5278);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2251:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop34:
            	                    do {
            	                        int alt34=2;
            	                        int LA34_0 = input.LA(1);

            	                        if ( (LA34_0==47) ) {
            	                            alt34=1;
            	                        }


            	                        switch (alt34) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2251:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall5291); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2255:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2256:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2256:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2257:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5312);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop34;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall5329); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2285:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2286:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2287:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5370);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5380); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2294:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2297:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2298:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2298:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt38=13;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt38=1;
                }
                break;
            case 13:
                {
                alt38=2;
                }
                break;
            case 55:
                {
                alt38=3;
                }
                break;
            case RULE_ID:
            case 36:
            case 64:
                {
                alt38=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 50:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt38=5;
                }
                break;
            case 53:
                {
                alt38=6;
                }
                break;
            case 19:
                {
                alt38=7;
                }
                break;
            case 59:
                {
                alt38=8;
                }
                break;
            case 60:
                {
                alt38=9;
                }
                break;
            case 71:
                {
                alt38=10;
                }
                break;
            case 72:
                {
                alt38=11;
                }
                break;
            case 73:
                {
                alt38=12;
                }
                break;
            case 48:
                {
                alt38=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2299:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5427);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2309:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5454);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2319:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5481);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2329:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5508);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2339:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5535);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2349:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5562);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2359:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5589);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2369:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5616);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2379:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5643);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2389:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5670);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2399:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5697);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2409:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5724);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2419:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5751);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2435:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2436:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2437:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5786);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5796); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2444:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2447:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2448:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2448:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt39=1;
                }
                break;
            case 67:
            case 68:
                {
                alt39=2;
                }
                break;
            case RULE_INT:
                {
                alt39=3;
                }
                break;
            case 69:
                {
                alt39=4;
                }
                break;
            case RULE_STRING:
                {
                alt39=5;
                }
                break;
            case 70:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2449:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5843);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2459:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5870);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2469:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5897);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2479:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5924);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2489:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5951);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2499:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5978);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2515:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2516:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2517:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6013);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6023); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2524:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2527:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2528:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2528:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2528:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2528:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2529:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXClosure6069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2538:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==48||LA41_0==76) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2538:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2538:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2539:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2540:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6091);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2556:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==47) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2556:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXClosure6104); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2560:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2561:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2561:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2562:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6125);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleXClosure6141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2582:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2583:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2583:1: (lv_expression_6_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2584:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure6162);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure6174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2612:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2613:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2614:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6210);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6220); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2621:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2624:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2625:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2625:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2625:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2625:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2625:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2636:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2636:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2636:6: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2637:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2642:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==48||LA43_0==76) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2642:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2642:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2643:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2643:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2644:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6318);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2660:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==47) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2660:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure6331); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2664:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2665:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2665:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2666:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6352);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure6368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2686:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2687:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2687:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2688:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6391);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2712:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2713:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2714:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6427);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6437); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2721:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2724:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2725:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2725:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2725:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXParenthesizedExpression6474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6496);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXParenthesizedExpression6507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2750:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2751:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2752:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6543);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6553); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2759:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2762:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2763:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2763:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2763:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2763:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2764:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2777:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2778:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2778:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2779:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6632);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2799:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2800:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2800:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2801:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6665);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2817:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred16_InternalGraphViewMapping()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2817:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2817:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2817:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2822:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2823:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2823:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2824:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6708);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2848:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2849:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2850:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6746);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2857:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2860:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2861:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2861:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2861:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2861:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2862:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2871:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==56) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2871:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2871:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2872:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2872:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2873:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6824);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2893:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2894:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2894:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2895:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6859);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression6871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2915:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==48||LA46_0==56||LA46_0==58||LA46_0==76) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2916:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2916:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2917:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6892);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2933:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2933:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2941:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2942:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2942:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2943:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6939);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleXSwitchExpression6953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2971:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2972:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2973:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6989);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6999); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2980:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2983:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2984:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2984:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2984:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2984:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==48||LA48_0==76) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2985:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2985:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2986:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7045);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3002:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3002:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart7059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3006:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3007:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3007:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3008:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7080);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart7094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3028:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3029:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3029:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3030:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7115);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3054:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3055:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3056:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7151);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7161); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3063:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3066:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3067:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3067:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3067:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3067:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3068:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression7207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression7219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3081:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3082:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3082:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3083:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7240);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression7252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3103:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3104:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3104:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3105:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7273);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression7285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3125:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3126:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3126:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3127:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7306);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3151:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3152:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3153:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7342);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7352); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3160:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3163:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3164:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3164:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3164:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3164:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3165:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXWhileExpression7398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXWhileExpression7410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3178:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3179:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3179:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3180:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7431);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXWhileExpression7443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3200:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3201:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3201:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3202:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7464);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3226:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3227:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3228:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7500);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7510); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3235:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3238:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3239:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3239:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3239:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3239:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3240:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3249:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3250:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3250:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3251:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7577);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression7589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXDoWhileExpression7601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3275:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3276:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3276:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3277:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7622);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXDoWhileExpression7634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3305:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3306:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3307:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7670);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3314:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3317:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3318:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3318:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3318:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3318:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3319:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3328:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)||LA51_0==13||LA51_0==19||LA51_0==36||(LA51_0>=38 && LA51_0<=39)||LA51_0==43||LA51_0==48||LA51_0==50||LA51_0==53||LA51_0==55||(LA51_0>=59 && LA51_0<=60)||(LA51_0>=62 && LA51_0<=64)||(LA51_0>=66 && LA51_0<=73)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3328:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3328:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3329:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3329:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3330:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7748);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3346:2: (otherlv_3= ';' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==61) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3346:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXBlockExpression7761); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression7777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3362:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3363:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3364:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7813);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3371:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3374:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3375:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3375:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=62 && LA52_0<=63)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)||LA52_0==13||LA52_0==19||LA52_0==36||(LA52_0>=38 && LA52_0<=39)||LA52_0==43||LA52_0==48||LA52_0==50||LA52_0==53||LA52_0==55||(LA52_0>=59 && LA52_0<=60)||LA52_0==64||(LA52_0>=66 && LA52_0<=73)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3376:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7870);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3386:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7897);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3402:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3403:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3404:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7932);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7942); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3411:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3414:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3415:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3415:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3415:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3415:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3416:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3421:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            else if ( (LA53_0==63) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3421:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3421:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3422:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3422:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3423:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3437:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration8026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred17_InternalGraphViewMapping()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==48) && (synpred17_InternalGraphViewMapping())) {
                alt54=1;
            }
            else if ( (LA54_0==76) && (synpred17_InternalGraphViewMapping())) {
                alt54=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3449:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3449:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3449:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3450:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3450:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3451:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8074);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3467:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3468:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3468:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3469:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8095);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3486:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3486:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3487:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3487:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3488:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8124);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3504:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==26) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3504:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXVariableDeclaration8138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3508:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3509:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3509:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3510:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8159);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3534:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3535:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3536:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8197);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8207); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3543:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3546:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3547:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3547:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3547:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3547:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_ID||LA56_1==16||LA56_1==36) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==48||LA56_0==76) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3548:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3548:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3549:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8253);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3565:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3566:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3566:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3567:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8275);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3591:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3592:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3593:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8311);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8321); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3600:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3603:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3604:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3604:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3604:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3604:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3605:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3610:2: ( ( ruleStaticQualifier ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==65) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3611:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3611:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3612:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8378);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3625:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==36) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3625:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall8392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3629:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3630:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3630:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3631:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8413);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3647:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==47) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3647:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8426); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3651:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3652:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3652:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3653:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8447);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall8461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3673:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3674:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3674:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3675:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8486);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3688:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3688:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3688:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3688:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3695:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3696:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt61=3;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3721:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3722:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8595);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3739:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3739:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3739:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3739:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3740:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3740:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3741:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8623);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3757:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==47) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3757:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8636); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3761:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3762:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3762:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3763:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8657);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3791:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3792:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3793:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8713);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8724); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3800:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3803:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3804:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3804:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==64) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3805:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8771);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3817:2: kw= 'super'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleIdOrSuper8795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3830:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3831:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3832:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8836);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3839:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3842:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3843:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3843:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    int LA64_2 = input.LA(2);

                    if ( (LA64_2==65) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3844:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8894);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier8912); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3868:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3869:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3870:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8953);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8963); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3877:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3880:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3881:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3881:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3881:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3881:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3882:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall9009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3891:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3892:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3892:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3893:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9032);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3906:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==36) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3906:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall9045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3910:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3911:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3911:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3912:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9066);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3928:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==47) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3928:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9079); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3932:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3933:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3933:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3934:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9100);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall9114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall9128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt68=3;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3970:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3971:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9190);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3988:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3988:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3988:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3988:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3989:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3989:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3990:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9218);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4006:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==47) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4006:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9231); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4010:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4011:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4011:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4012:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9252);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4040:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4041:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4042:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9305);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9315); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4049:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4052:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4053:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4053:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4053:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4053:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4054:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4059:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==67) ) {
                alt69=1;
            }
            else if ( (LA69_0==68) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4059:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4064:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4064:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4065:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4065:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4066:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4087:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4088:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4089:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9436);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9446); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4096:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4099:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4100:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4100:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4100:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4100:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4101:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral9492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4118:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4119:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4120:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9528);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9538); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4127:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4130:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4131:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4131:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4131:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4131:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4132:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4137:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4138:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4138:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4139:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4163:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4164:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4165:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9630);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9640); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4172:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4175:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4176:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4176:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4176:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4176:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4177:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4182:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4183:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4183:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4184:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4208:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4209:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4210:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9732);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9742); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4217:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4220:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4221:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4221:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4221:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4221:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4222:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral9788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXTypeLiteral9800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4235:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4236:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4236:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4237:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9823);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXTypeLiteral9835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4262:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4263:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4264:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9871);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9881); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4271:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4274:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4275:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4275:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4275:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4275:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4276:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression9927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4285:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4286:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4286:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4287:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9948);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4311:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4312:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4313:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9984);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9994); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4320:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4323:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4324:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4324:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4324:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4324:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression10040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4334:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4334:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4339:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4340:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10071);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4364:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4365:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4366:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10108);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4373:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4376:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4377:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4377:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4377:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4377:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4378:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression10164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4387:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4388:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4388:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4389:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10185);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==75) ) {
                alt73=1;
            }
            else if ( (LA73_0==74) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==75) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred22_InternalGraphViewMapping()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4407:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4408:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10215);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4424:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==74) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred23_InternalGraphViewMapping()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4424:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4424:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4424:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10237); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4429:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4430:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4430:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4431:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10259);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4448:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4448:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4448:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4452:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4453:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4453:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4454:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10302);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4478:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4479:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4480:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10340);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10350); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4487:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4490:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4491:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4491:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4491:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4491:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4491:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause10395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXCatchClause10408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4500:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4501:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4501:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4502:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10429);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCatchClause10441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4522:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4523:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4523:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4524:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10462);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4548:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4549:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4550:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10499);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10510); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4557:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4560:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4561:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4561:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4562:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10557);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4572:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==16) ) {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==RULE_ID) ) {
                        int LA74_3 = input.LA(3);

                        if ( (synpred25_InternalGraphViewMapping()) ) {
                            alt74=1;
                        }


                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4572:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4572:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4572:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName10585); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10608);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4599:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4600:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4601:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10655);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10665); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4608:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4611:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4612:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4612:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==48||LA75_0==76) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4613:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10712);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4623:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10739);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4639:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4640:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4641:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10774);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4648:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4651:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4652:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4652:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4652:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4652:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==48) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4652:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef10822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4656:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4657:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4657:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4658:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10843);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4674:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==47) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4674:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10856); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4678:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4679:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4679:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4680:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10877);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef10891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleXFunctionTypeRef10905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4704:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4705:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4705:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4706:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10926);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4730:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4731:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4732:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10962);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10972); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4739:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4742:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4743:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4743:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4743:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4743:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4744:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4744:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4745:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11020);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4758:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4758:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4758:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4758:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference11041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4763:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4764:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4764:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4765:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11063);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4781:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==47) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4781:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmParameterizedTypeReference11076); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4785:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4786:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4786:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4787:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11097);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference11111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4815:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4816:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4817:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11149);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4824:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4827:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4828:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4828:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==48||LA80_0==76) ) {
                alt80=1;
            }
            else if ( (LA80_0==77) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4829:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11206);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4839:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11233);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4855:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4856:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4857:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11268);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11278); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4864:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4867:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4868:2: ()
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4869:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleJvmWildcardTypeReference11324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4878:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==78) ) {
                alt81=1;
            }
            else if ( (LA81_0==64) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4878:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4878:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4879:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4879:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4880:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11346);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4897:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4897:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4898:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4898:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4899:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11373);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4923:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4924:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4925:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11411);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11421); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4932:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4935:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4936:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4936:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4936:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBound11458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4940:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4941:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4941:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4942:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11479);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4966:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4967:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4968:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11515);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11525); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4975:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4978:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4979:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4979:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4979:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBoundAnded11562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4983:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4984:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4984:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4985:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11583);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5009:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5010:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5011:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11619);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5018:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5021:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5022:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5022:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5022:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmLowerBound11666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5026:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5027:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5027:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5028:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11687);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5054:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5055:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5056:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11726);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11737); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5063:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5066:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:5067:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalGraphViewMapping
    public final void synpred1_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:906:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:907:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:908:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:908:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:909:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping1936);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGraphViewMapping

    // $ANTLR start synpred2_InternalGraphViewMapping
    public final void synpred2_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1034:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1035:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1035:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1036:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1036:1: ( ruleOpOr )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1037:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2284);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalGraphViewMapping

    // $ANTLR start synpred3_InternalGraphViewMapping
    public final void synpred3_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1135:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1136:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1136:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1137:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1137:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1138:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2543);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalGraphViewMapping

    // $ANTLR start synpred4_InternalGraphViewMapping
    public final void synpred4_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1236:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1237:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1237:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1238:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1238:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1239:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2802);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGraphViewMapping

    // $ANTLR start synpred5_InternalGraphViewMapping
    public final void synpred5_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1344:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1345:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred5_InternalGraphViewMapping3078); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGraphViewMapping

    // $ANTLR start synpred6_InternalGraphViewMapping
    public final void synpred6_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1372:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1373:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1373:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1374:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1374:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1375:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping3151);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGraphViewMapping

    // $ANTLR start synpred7_InternalGraphViewMapping
    public final void synpred7_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1494:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1495:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1495:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1496:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1496:1: ( ruleOpOther )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1497:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3470);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGraphViewMapping

    // $ANTLR start synpred8_InternalGraphViewMapping
    public final void synpred8_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1602:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1603:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1603:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1604:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1605:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3750);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalGraphViewMapping

    // $ANTLR start synpred9_InternalGraphViewMapping
    public final void synpred9_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1710:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1711:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1711:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1712:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1713:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping4030);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalGraphViewMapping

    // $ANTLR start synpred10_InternalGraphViewMapping
    public final void synpred10_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:4: ( () 'as' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:5: () 'as'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1943:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:1944:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred10_InternalGraphViewMapping4624); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGraphViewMapping

    // $ANTLR start synpred11_InternalGraphViewMapping
    public final void synpred11_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2003:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2004:1: 
        {
        }

        match(input,16,FOLLOW_16_in_synpred11_InternalGraphViewMapping4778); if (state.failed) return ;
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2005:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2006:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2006:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2007:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4787);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4793);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGraphViewMapping

    // $ANTLR start synpred12_InternalGraphViewMapping
    public final void synpred12_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2061:10: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2062:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2062:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt82=3;
        switch ( input.LA(1) ) {
        case 16:
            {
            alt82=1;
            }
            break;
        case 45:
            {
            alt82=2;
            }
            break;
        case 46:
            {
            alt82=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 82, 0, input);

            throw nvae;
        }

        switch (alt82) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2062:4: '.'
                {
                match(input,16,FOLLOW_16_in_synpred12_InternalGraphViewMapping4896); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2064:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2064:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2065:1: ( '?.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2065:1: ( '?.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2066:2: '?.'
                {
                match(input,45,FOLLOW_45_in_synpred12_InternalGraphViewMapping4910); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2071:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2071:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2072:1: ( '*.' )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2072:1: ( '*.' )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2073:2: '*.'
                {
                match(input,46,FOLLOW_46_in_synpred12_InternalGraphViewMapping4930); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalGraphViewMapping

    // $ANTLR start synpred13_InternalGraphViewMapping
    public final void synpred13_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2182:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2183:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2183:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2184:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred13_InternalGraphViewMapping5157); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGraphViewMapping

    // $ANTLR start synpred14_InternalGraphViewMapping
    public final void synpred14_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2203:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2204:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2204:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==48||LA84_0==76) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2204:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2204:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2205:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2205:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2206:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5209);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2208:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==47) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2208:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred14_InternalGraphViewMapping5216); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2209:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2210:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2210:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2211:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5223);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop83;
                    }
                } while (true);


                }
                break;

        }

        match(input,51,FOLLOW_51_in_synpred14_InternalGraphViewMapping5233); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGraphViewMapping

    // $ANTLR start synpred16_InternalGraphViewMapping
    public final void synpred16_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2817:4: ( 'else' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:2817:6: 'else'
        {
        match(input,54,FOLLOW_54_in_synpred16_InternalGraphViewMapping6678); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGraphViewMapping

    // $ANTLR start synpred17_InternalGraphViewMapping
    public final void synpred17_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3441:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3442:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3442:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3443:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping8044);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3445:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3446:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3446:1: ( ruleValidID )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3447:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping8053);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalGraphViewMapping

    // $ANTLR start synpred18_InternalGraphViewMapping
    public final void synpred18_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3688:4: ( ( '(' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3689:1: ( '(' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3689:1: ( '(' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3690:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred18_InternalGraphViewMapping8502); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGraphViewMapping

    // $ANTLR start synpred19_InternalGraphViewMapping
    public final void synpred19_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3709:6: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3710:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3710:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==48||LA88_0==76) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3710:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3710:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3711:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3711:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3712:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8554);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3714:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==47) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3714:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred19_InternalGraphViewMapping8561); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3715:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3716:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3716:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3717:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8568);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        match(input,51,FOLLOW_51_in_synpred19_InternalGraphViewMapping8578); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGraphViewMapping

    // $ANTLR start synpred20_InternalGraphViewMapping
    public final void synpred20_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3958:5: ()
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3959:1: 
        {
        }

        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3959:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==48||LA90_0==76) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3959:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3959:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3960:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3960:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3961:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9149);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3963:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==47) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3963:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred20_InternalGraphViewMapping9156); if (state.failed) return ;
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3964:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3965:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3965:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:3966:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9163);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        match(input,51,FOLLOW_51_in_synpred20_InternalGraphViewMapping9173); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGraphViewMapping

    // $ANTLR start synpred21_InternalGraphViewMapping
    public final void synpred21_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4334:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4335:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4335:1: ( ruleXExpression )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4336:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping10054);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGraphViewMapping

    // $ANTLR start synpred22_InternalGraphViewMapping
    public final void synpred22_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:5: ( 'catch' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4405:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred22_InternalGraphViewMapping10199); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGraphViewMapping

    // $ANTLR start synpred23_InternalGraphViewMapping
    public final void synpred23_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4424:5: ( 'finally' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4424:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred23_InternalGraphViewMapping10229); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGraphViewMapping

    // $ANTLR start synpred25_InternalGraphViewMapping
    public final void synpred25_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4572:3: ( '.' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4573:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred25_InternalGraphViewMapping10576); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGraphViewMapping

    // $ANTLR start synpred26_InternalGraphViewMapping
    public final void synpred26_InternalGraphViewMapping_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4758:4: ( '<' )
        // ../org.eclipse.xtext.graphview.map/src-gen/org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.g:4758:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred26_InternalGraphViewMapping11033); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalGraphViewMapping

    // Delegated rules

    public final boolean synpred19_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGraphViewMapping() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGraphViewMapping_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA36 dfa36 = new DFA36(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA36_eotS =
        "\100\uffff";
    static final String DFA36_eofS =
        "\1\2\77\uffff";
    static final String DFA36_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA36_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA36_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\25\2\1\1\2\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2182:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\34\uffff";
    static final String DFA35_eofS =
        "\34\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA35_maxS =
        "\1\114\2\0\31\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\2\5\6\uffff\1\5\5\uffff\1\5\20\uffff\1\5\1\uffff\2\5\3"+
            "\uffff\1\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2203:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==48) ) {s = 2;}

                        else if ( (LA35_0==76) && (synpred14_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA35_0==51) && (synpred14_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_STRING)||LA35_0==13||LA35_0==19||LA35_0==36||(LA35_0>=38 && LA35_0<=39)||LA35_0==43||LA35_0==50||LA35_0==53||LA35_0==55||(LA35_0>=59 && LA35_0<=60)||LA35_0==64||(LA35_0>=66 && LA35_0<=73)) ) {s = 5;}

                        else if ( (LA35_0==49) ) {s = 27;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\100\uffff";
    static final String DFA62_eofS =
        "\1\2\77\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA62_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA62_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\25\2\1\1\2\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3688:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\34\uffff";
    static final String DFA61_eofS =
        "\34\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA61_maxS =
        "\1\114\2\0\31\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\2\5\6\uffff\1\5\5\uffff\1\5\20\uffff\1\5\1\uffff\2\5\3"+
            "\uffff\1\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3709:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==48) ) {s = 2;}

                        else if ( (LA61_0==76) && (synpred19_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA61_0==51) && (synpred19_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA61_0>=RULE_INT && LA61_0<=RULE_STRING)||LA61_0==13||LA61_0==19||LA61_0==36||(LA61_0>=38 && LA61_0<=39)||LA61_0==43||LA61_0==50||LA61_0==53||LA61_0==55||(LA61_0>=59 && LA61_0<=60)||LA61_0==64||(LA61_0>=66 && LA61_0<=73)) ) {s = 5;}

                        else if ( (LA61_0==49) ) {s = 27;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\34\uffff";
    static final String DFA68_eofS =
        "\34\uffff";
    static final String DFA68_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA68_maxS =
        "\1\114\2\0\31\uffff";
    static final String DFA68_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA68_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\2\5\6\uffff\1\5\5\uffff\1\5\20\uffff\1\5\1\uffff\2\5\3"+
            "\uffff\1\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\2\5\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3958:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_0 = input.LA(1);

                         
                        int index68_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA68_0==RULE_ID) ) {s = 1;}

                        else if ( (LA68_0==48) ) {s = 2;}

                        else if ( (LA68_0==76) && (synpred20_InternalGraphViewMapping())) {s = 3;}

                        else if ( (LA68_0==51) && (synpred20_InternalGraphViewMapping())) {s = 4;}

                        else if ( ((LA68_0>=RULE_INT && LA68_0<=RULE_STRING)||LA68_0==13||LA68_0==19||LA68_0==36||(LA68_0>=38 && LA68_0<=39)||LA68_0==43||LA68_0==50||LA68_0==53||LA68_0==55||(LA68_0>=59 && LA68_0<=60)||LA68_0==64||(LA68_0>=66 && LA68_0<=73)) ) {s = 5;}

                        else if ( (LA68_0==49) ) {s = 27;}

                         
                        input.seek(index68_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGraphViewMapping()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\100\uffff";
    static final String DFA70_eofS =
        "\1\31\77\uffff";
    static final String DFA70_minS =
        "\1\4\30\0\47\uffff";
    static final String DFA70_maxS =
        "\1\114\30\0\47\uffff";
    static final String DFA70_acceptS =
        "\31\uffff\1\2\45\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\47\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\15\1\17\6\uffff\1\6\1\31\1\uffff\3\31\1\22\1\uffff\3"+
            "\31\1\uffff\1\31\1\uffff\11\31\1\10\1\31\1\4\1\3\3\31\1\2\4"+
            "\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31\1\7\3\31\1\23\1\24"+
            "\3\31\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\3"+
            "\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4334:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\100\uffff";
    static final String DFA79_eofS =
        "\1\2\77\uffff";
    static final String DFA79_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA79_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA79_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA79_transitionS = {
            "\3\2\6\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
            "\11\2\1\1\16\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4758:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGraphViewMapping()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDiagramMapping_in_entryRuleDiagramMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagramMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagramMapping131 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_11_in_ruleDiagramMapping144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDiagramMapping165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagramMapping177 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleDiagramMapping198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagramMapping210 = new BitSet(new long[]{0x0000000002644000L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleDiagramMapping231 = new BitSet(new long[]{0x0000000002644000L});
    public static final BitSet FOLLOW_14_in_ruleDiagramMapping244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard443 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard462 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildcard475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_entryRuleAbstractExpressionMapping517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExpressionMapping527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_ruleAbstractExpressionMapping574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_ruleAbstractExpressionMapping601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_ruleAbstractExpressionMapping628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingCall_in_ruleAbstractExpressionMapping655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeMapping_in_entryRuleNodeMapping690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeMapping700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNodeMapping737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeMapping754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNodeMapping771 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_20_in_ruleNodeMapping789 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleNodeMapping824 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeMapping836 = new BitSet(new long[]{0x0000000002644000L});
    public static final BitSet FOLLOW_ruleAbstractExpressionMapping_in_ruleNodeMapping857 = new BitSet(new long[]{0x0000000002644000L});
    public static final BitSet FOLLOW_14_in_ruleNodeMapping870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_entryRuleLabelMapping906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelMapping916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLabelMapping953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabelMapping970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLabelMapping987 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_20_in_ruleLabelMapping1005 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleLabelMapping1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeMapping_in_entryRuleEdgeMapping1076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeMapping1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEdgeMapping1123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeMapping1140 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEdgeMapping1157 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_20_in_ruleEdgeMapping1175 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeMapping1210 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEdgeMapping1222 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1243 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEdgeMapping1256 = new BitSet(new long[]{0x0000000003204000L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_ruleEdgeMapping1277 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_ruleLabelMapping_in_ruleEdgeMapping1299 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleEdgeMapping1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeEndMapping_in_entryRuleEdgeEndMapping1348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeEndMapping1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEdgeEndMapping1396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25_in_ruleEdgeEndMapping1420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEdgeEndMapping1454 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEdgeEndMapping1466 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleEdgeEndMapping1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingCall_in_entryRuleMappingCall1523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingCall1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMappingCall1570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMappingCall1590 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMappingCall1602 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_20_in_ruleMappingCall1620 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleMappingCall1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1849 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1865 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1915 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1968 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpSingleAssign2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2263 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2316 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2339 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOr2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2522 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2575 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2598 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAnd2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2781 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2834 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2857 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3061 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression3097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3122 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3183 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3206 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3449 = new BitSet(new long[]{0x0000002000800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3502 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3525 = new BitSet(new long[]{0x0000002000800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpOther3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3729 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3782 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3805 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpAdd3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4009 = new BitSet(new long[]{0x0000070000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4062 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4085 = new BitSet(new long[]{0x0000070000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMulti4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4338 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4608 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression4643 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4666 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4761 = new BitSet(new long[]{0x0000600000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4833 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4849 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4871 = new BitSet(new long[]{0x0000600000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4957 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4981 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall5018 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall5047 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5068 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall5081 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5102 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall5116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5141 = new BitSet(new long[]{0x0001600000010002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall5175 = new BitSet(new long[]{0x18AF08D000182070L,0x00000000000013FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5250 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5278 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall5291 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5312 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall5329 = new BitSet(new long[]{0x0000600000010002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXClosure6069 = new BitSet(new long[]{0x0009000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6091 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure6104 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6125 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure6141 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure6162 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6318 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure6331 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6352 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure6368 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXParenthesizedExpression6474 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6496 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXParenthesizedExpression6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6599 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6611 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6632 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6644 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6665 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6686 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6802 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6824 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6836 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6859 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression6871 = new BitSet(new long[]{0x0501000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6892 = new BitSet(new long[]{0x0701000000004010L,0x0000000000001000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6906 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6918 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6939 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXSwitchExpression6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7045 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart7059 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7080 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart7094 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression7207 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression7219 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7240 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression7252 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7273 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression7285 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXWhileExpression7398 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXWhileExpression7410 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7431 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXWhileExpression7443 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7556 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7577 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression7589 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXDoWhileExpression7601 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7622 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXDoWhileExpression7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7726 = new BitSet(new long[]{0xD8A508D000186070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7748 = new BitSet(new long[]{0xF8A508D000186070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_61_in_ruleXBlockExpression7761 = new BitSet(new long[]{0xD8A508D000186070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7995 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration8026 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8095 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8124 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXVariableDeclaration8138 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8378 = new BitSet(new long[]{0x0000001000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall8392 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8413 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8426 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8447 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall8461 = new BitSet(new long[]{0x0000001000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8486 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8520 = new BitSet(new long[]{0x18AF08D000182070L,0x00000000000013FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8595 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8623 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8636 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8657 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIdOrSuper8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier8912 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall9009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9032 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall9045 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9066 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9079 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9100 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall9114 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall9128 = new BitSet(new long[]{0x18AF08D000182070L,0x00000000000013FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9190 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9218 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9231 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9252 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral9788 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXTypeLiteral9800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9823 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXTypeLiteral9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression9927 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression10040 = new BitSet(new long[]{0x18A508D000182072L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression10164 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10237 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10281 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause10395 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCatchClause10408 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10429 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCatchClause10441 = new BitSet(new long[]{0x18A508D000182070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10557 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName10585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10608 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef10822 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10843 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10856 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10877 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef10891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXFunctionTypeRef10905 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11020 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference11041 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11063 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmParameterizedTypeReference11076 = new BitSet(new long[]{0x0001000000000010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11097 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmWildcardTypeReference11324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004001L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBound11458 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBoundAnded11562 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmLowerBound11666 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGraphViewMapping1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGraphViewMapping2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGraphViewMapping2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGraphViewMapping2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalGraphViewMapping3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGraphViewMapping3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGraphViewMapping3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGraphViewMapping3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGraphViewMapping4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred10_InternalGraphViewMapping4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred11_InternalGraphViewMapping4778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalGraphViewMapping4787 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGraphViewMapping4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred12_InternalGraphViewMapping4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred12_InternalGraphViewMapping4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalGraphViewMapping4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred13_InternalGraphViewMapping5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5209 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalGraphViewMapping5216 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGraphViewMapping5223 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred14_InternalGraphViewMapping5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred16_InternalGraphViewMapping6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGraphViewMapping8044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalGraphViewMapping8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalGraphViewMapping8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8554 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred19_InternalGraphViewMapping8561 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGraphViewMapping8568 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred19_InternalGraphViewMapping8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9149 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalGraphViewMapping9156 = new BitSet(new long[]{0x0001000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGraphViewMapping9163 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred20_InternalGraphViewMapping9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGraphViewMapping10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred22_InternalGraphViewMapping10199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred23_InternalGraphViewMapping10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred25_InternalGraphViewMapping10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred26_InternalGraphViewMapping11033 = new BitSet(new long[]{0x0000000000000002L});

}
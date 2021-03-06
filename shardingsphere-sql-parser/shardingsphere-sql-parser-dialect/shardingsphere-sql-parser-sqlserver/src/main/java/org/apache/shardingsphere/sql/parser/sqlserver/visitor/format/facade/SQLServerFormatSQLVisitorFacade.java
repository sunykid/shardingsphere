/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sql.parser.sqlserver.visitor.format.facade;

import org.apache.shardingsphere.sql.parser.api.visitor.format.facade.FormatSQLVisitorFacade;
import org.apache.shardingsphere.sql.parser.api.visitor.format.impl.DALFormatSQLVisitor;
import org.apache.shardingsphere.sql.parser.api.visitor.format.impl.DCLFormatSQLVisitor;
import org.apache.shardingsphere.sql.parser.api.visitor.format.impl.DDLFormatSQLVisitor;
import org.apache.shardingsphere.sql.parser.api.visitor.format.impl.DMLFormatSQLVisitor;
import org.apache.shardingsphere.sql.parser.api.visitor.format.impl.RLFormatSQLVisitor;
import org.apache.shardingsphere.sql.parser.api.visitor.format.impl.TCLFormatSQLVisitor;

/**
 * Format SQL Visitor facade for MySQL.
 */
public final class SQLServerFormatSQLVisitorFacade implements FormatSQLVisitorFacade {
    
    @Override
    public Class<? extends DMLFormatSQLVisitor> getDMLVisitorClass() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Class<? extends DDLFormatSQLVisitor> getDDLVisitorClass() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Class<? extends TCLFormatSQLVisitor> getTCLVisitorClass() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Class<? extends DCLFormatSQLVisitor> getDCLVisitorClass() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Class<? extends DALFormatSQLVisitor> getDALVisitorClass() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Class<? extends RLFormatSQLVisitor> getRLVisitorClass() {
        throw new UnsupportedOperationException();
    }
}

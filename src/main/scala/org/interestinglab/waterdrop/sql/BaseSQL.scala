package org.interestinglab.waterdrop.sql

import org.apache.spark.sql.DataFrame
import org.apache.spark.streaming.StreamingContext
import com.typesafe.config.Config
import org.interestinglab.waterdrop.core.Plugin


abstract class BaseSQL(val config: Config) extends Plugin {

    def prepare(ssc : StreamingContext)

    def query(df : DataFrame) : DataFrame
}

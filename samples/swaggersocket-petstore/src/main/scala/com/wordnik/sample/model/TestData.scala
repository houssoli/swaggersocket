/**
 *  Copyright 2011 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
 
package com.wordnik.sample.model

import com.wordnik.swagger.runtime.annotations._

import scala.reflect.BeanProperty

import scala.collection.JavaConversions._

import scala.collection.mutable.ListBuffer


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author tony
 *
 */
class TestData extends Object {

	/**
	 * 
	 * 
	 * 
	 */
	var categoryList  =  new ListBuffer[Category]
	def getCategoryList:java.util.List[com.wordnik.sample.model.Category] = {
	    categoryList.toList
	}
	def setCategoryList(args:java.util.List[com.wordnik.sample.model.Category]) = {
	    categoryList.clear
	    args.foreach(arg=>categoryList += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
	var petList  =  new ListBuffer[Pet]
	def getPetList:java.util.List[com.wordnik.sample.model.Pet] = {
	    petList.toList
	}
	def setPetList(args:java.util.List[com.wordnik.sample.model.Pet]) = {
	    petList.clear
	    args.foreach(arg=>petList += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
	var tagList  =  new ListBuffer[Tag]
	def getTagList:java.util.List[com.wordnik.sample.model.Tag] = {
	    tagList.toList
	}
	def setTagList(args:java.util.List[com.wordnik.sample.model.Tag]) = {
	    tagList.clear
	    args.foreach(arg=>tagList += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
	var userList  =  new ListBuffer[User]
	def getUserList:java.util.List[com.wordnik.sample.model.User] = {
	    userList.toList
	}
	def setUserList(args:java.util.List[com.wordnik.sample.model.User]) = {
	    userList.clear
	    args.foreach(arg=>userList += arg)
	}

    override def toString:String = {
        "[" +
        "categoryList:" + categoryList + 
            "petList:" + petList + 
            "tagList:" + tagList + 
            "userList:" + userList + "]"
    }
}
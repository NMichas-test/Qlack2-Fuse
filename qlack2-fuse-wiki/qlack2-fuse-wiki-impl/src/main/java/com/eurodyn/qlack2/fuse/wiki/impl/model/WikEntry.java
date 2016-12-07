/*
* Copyright 2014 EUROPEAN DYNAMICS SA <info@eurodyn.com>
*
* Licensed under the EUPL, Version 1.1 only (the "License").
* You may not use this work except in compliance with the Licence.
* You may obtain a copy of the Licence at:
* https://joinup.ec.europa.eu/software/page/eupl/licence-eupl
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the Licence is distributed on an "AS IS" basis,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the Licence for the specific language governing permissions and
* limitations under the Licence.
*/
package com.eurodyn.qlack2.fuse.wiki.impl.model;
// Generated by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * WikEntry generated by hbm2java
 */
@Entity
@Table(name="wik_entry"
)
public class WikEntry  implements java.io.Serializable {


     private String id;
     private WikWiki wikiId;
     private String pageContent;
     private String namespace;
     private Long dtLastModified;
     private String lastModifiedBy;
     private Long dtCreated;
     private String createdBy;
     private String url;
     private Boolean locked;
     private String lockedBy;
     private String title;
     private Boolean homepage;
     private Set<WikEntryVersion> wikEntryVersions = new HashSet<WikEntryVersion>(0);
     private Set<WikEntryHasTag> wikEntryHasTags = new HashSet<WikEntryHasTag>(0);

    public WikEntry() {
    }


    public WikEntry(WikWiki wikiId, String namespace, String title) {
        this.wikiId = wikiId;
        this.namespace = namespace;
        this.title = title;
    }
    
    public WikEntry(WikWiki wikiId, String pageContent, String namespace, Long dtLastModified, String lastModifiedBy, Long dtCreated, String createdBy, String url, Boolean locked, String lockedBy, String title, Set<WikEntryVersion> wikEntryVersions, Set<WikEntryHasTag> wikEntryHasTags) {
       this.wikiId = wikiId;
       this.pageContent = pageContent;
       this.namespace = namespace;
       this.dtLastModified = dtLastModified;
       this.lastModifiedBy = lastModifiedBy;
       this.dtCreated = dtCreated;
       this.createdBy = createdBy;
       this.url = url;
       this.locked = locked;
       this.lockedBy = lockedBy;
       this.title = title;
       this.wikEntryVersions = wikEntryVersions;
       this.wikEntryHasTags = wikEntryHasTags;
    }

    public WikEntry(WikWiki wikiId, String pageContent, String namespace, Long dtLastModified, String lastModifiedBy, Long dtCreated, String createdBy, String url, Boolean locked, String lockedBy, String title, Boolean homepage, Set<WikEntryVersion> wikEntryVersions, Set<WikEntryHasTag> wikEntryHasTags) {
        this.wikiId = wikiId;
        this.pageContent = pageContent;
        this.namespace = namespace;
        this.dtLastModified = dtLastModified;
        this.lastModifiedBy = lastModifiedBy;
        this.dtCreated = dtCreated;
        this.createdBy = createdBy;
        this.url = url;
        this.locked = locked;
        this.lockedBy = lockedBy;
        this.title = title;
        this.homepage = homepage;
        this.wikEntryVersions = wikEntryVersions;
        this.wikEntryHasTags = wikEntryHasTags;
    }
	
    @Id
	public String getId() {
		 if (this.id == null) {
			 this.id = java.util.UUID.randomUUID().toString();
	     }

		 return this.id;
	}

    public void setId(String id) {
        this.id = id;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="wiki_id", nullable=false)
	public WikWiki getWikiId() {
		return this.wikiId;
	}

    public void setWikiId(WikWiki wikiId) {
        this.wikiId = wikiId;
    }

    @Column(name="page_content", length=65535)
	public String getPageContent() {
		return this.pageContent;
	}

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    @Column(name="namespace", nullable=false, length=1000)
	public String getNamespace() {
		return this.namespace;
	}

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Column(name="dt_last_modified")
	public Long getDtLastModified() {
		return this.dtLastModified;
	}

    public void setDtLastModified(Long dtLastModified) {
        this.dtLastModified = dtLastModified;
    }

    @Column(name="last_modified_by", length=36)
	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Column(name="dt_created")
	public Long getDtCreated() {
		return this.dtCreated;
	}

    public void setDtCreated(Long dtCreated) {
        this.dtCreated = dtCreated;
    }

    @Column(name="created_by", length=36)
	public String getCreatedBy() {
		return this.createdBy;
	}

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name="url", length=45)
	public String getUrl() {
		return this.url;
	}

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name="locked")
	public Boolean getLocked() {
		return this.locked;
	}

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Column(name="locked_by", length=36)
		public String getLockedBy() {
			return this.lockedBy;
		}

    public void setLockedBy(String lockedBy) {
        this.lockedBy = lockedBy;
    }

    @Column(name="title", nullable=false)
		public String getTitle() {
			return this.title;
		}

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="homepage")
	public Boolean isHomepage() {
		return this.homepage;
	}

    public void setHomepage(Boolean homepage) {
        this.homepage = homepage;
    } 
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="wikEntryId")
		public Set<WikEntryVersion> getWikEntryVersions() {
			return this.wikEntryVersions;
		}

    public void setWikEntryVersions(Set<WikEntryVersion> wikEntryVersions) {
        this.wikEntryVersions = wikEntryVersions;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="wikEntryId")
		public Set<WikEntryHasTag> getWikEntryHasTags() {
			return this.wikEntryHasTags;
		}

    public void setWikEntryHasTags(Set<WikEntryHasTag> wikEntryHasTags) {
        this.wikEntryHasTags = wikEntryHasTags;
    }




}

